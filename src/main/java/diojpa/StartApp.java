package diojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import diojpa.model.User;
import diojpa.repo.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception{
        User user = new User();
        user.setName("John Doe");
        user.setUsername("johndoe");
        user.setPassword("password123");
        repository.save(user);


        for(User u: repository.findAll()){
            System.out.println(u.toString());
        }
    }
}
