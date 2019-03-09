
package co.motorola.sb.resource;

import co.motorola.sb.exception.ResourceNotFoundException;
import co.motorola.sb.model.Users;
import co.motorola.sb.repository.UsersRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/users")

public class UserResource {
  
    @Autowired
    UsersRepository usersRepository;
    
    @GetMapping(value = "/all")
    public List <Users> getAll(){ 
        return usersRepository.findAll();
    }
    
    @GetMapping(value = "/{UserName}")
    public List <Users> findByName(@PathVariable final String UserName){
        return usersRepository.findByUserName(UserName);
        
    } 
    
    @PostMapping(value = "/create")
    public List <Users> load(@RequestBody final Users users){
        usersRepository.save(users);
        return usersRepository.findByUserName(users.getUserName());
        
    }
    
    @GetMapping(value = "/user/{refId}")
    public Users findById(@PathVariable(value = "refId") int refId){
        return usersRepository.findByRefId(refId).orElseThrow(()-> new ResourceNotFoundException("User", "refid", refId));
        
    }
   
    @PutMapping("/load/user/{refId}")
    public Users updateNote(@PathVariable(value = "refId") int refId,@Valid @RequestBody Users usersDetails) {

        Users user;     
        user = usersRepository.findByRefId(refId).orElseThrow(()-> new ResourceNotFoundException("User", "refid", refId));
        user.setFirstName(usersDetails.getFirstName());
        user.setLastName(usersDetails.getLastName());
        user.setPhone(usersDetails.getPhone());
        user.setSMS(usersDetails.getSMS());
        user.setEmail(usersDetails.getEmail());
        user.setDisplayName(usersDetails.getDisplayName());
        Users updatedUser = usersRepository.save(user);
        return updatedUser;
    
    }
     
    
}
