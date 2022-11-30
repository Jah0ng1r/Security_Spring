package uz.fbtuit.security_example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import uz.fbtuit.security_example.entity.MyUsers;
import uz.fbtuit.security_example.repository.MyUsersRepository;

public class CustomerUserDetails implements UserDetailsService {
    private final MyUsersRepository myUsersRepository;

    @Autowired
    public CustomerUserDetails(MyUsersRepository myUsersRepository) {
        this.myUsersRepository = myUsersRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUsers user = myUsersRepository.findByUserName(username);
        if (user == null) throw new UsernameNotFoundException("User Topilmadi");

        return null;
    }
}
