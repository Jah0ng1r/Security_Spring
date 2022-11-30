package uz.fbtuit.security_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.fbtuit.security_example.entity.MyUsers;

public interface MyUsersRepository extends JpaRepository<MyUsers, Long> {
    MyUsers findByUserName(String username);
}
