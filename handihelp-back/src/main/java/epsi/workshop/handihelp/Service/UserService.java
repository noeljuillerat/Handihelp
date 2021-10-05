package epsi.workshop.handihelp.Service;

import epsi.workshop.handihelp.dao.entity.User;
import epsi.workshop.handihelp.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {
    //Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }

    public String createUser() {
        // TODO : create user
        return "{'status' : 'ok'}";
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
