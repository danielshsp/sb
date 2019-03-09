
package co.motorola.sb.repository;

import co.motorola.sb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository <Users, Long> { 
    
     List<Users> findByUserName(String userName);
     @Query(value="select * from sysaid_user where ref_id=?1" ,nativeQuery=true)
     Optional<Users> findByRefId(int id);
 
} 
