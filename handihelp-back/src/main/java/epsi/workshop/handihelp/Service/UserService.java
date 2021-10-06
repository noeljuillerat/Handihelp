package epsi.workshop.handihelp.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import epsi.workshop.handihelp.dao.dto.UserDto;
import epsi.workshop.handihelp.dao.entity.User;
import epsi.workshop.handihelp.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.transaction.Transactional;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    //Autowired
    private final UserRepository userRepository;
    private final RoleUserService roleUserService;

    @Autowired
    public UserService(UserRepository userRepository, RoleUserService roleUserService) {
        this.userRepository = userRepository;
        this.roleUserService = roleUserService;
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

    public String createUser(String bodyRequest) {
        try {
            JsonObject jsonUser = new Gson().fromJson(bodyRequest, JsonObject.class);
            User user = new User();
            user.setPrenom(jsonUser.get("prenom").getAsString());
            user.setNom(jsonUser.get("nom").getAsString());
            user.setUsername(jsonUser.get("username").getAsString());
            user.setPassword(jsonUser.get("password").getAsString());
            user.setEmail(jsonUser.get("email").getAsString());
            user.setTelephone(jsonUser.get("telephone").getAsString());
            user.setRoleUser(roleUserService.getRoleById(1L));
            this.saveUser(user);
            return "{\"status\":\"ok\"}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"status\":\"error\"}";
        }
    }

    public String loginUser(String bodyRequest) {
        JsonObject jsonUser = new Gson().fromJson(bodyRequest, JsonObject.class);
        String username = jsonUser.get("username").getAsString();
        String password = jsonUser.get("password").getAsString();
        Iterable<User> users = this.getAllUsers();
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) {
                if (Objects.equals(user.getPassword(), password)) {
//                    UserDto userDto = userToUserDto(user);
//                    Gson gson = new Gson();
//                    String json = gson.toJson(userDto);
                    return "{\"status\":\"ok\"}";
                } else {
                    return "{\"status\":\"bad-password\"}";
                }
            }
        }
        return "{\"status\":\"user-not-found\"}";
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
    public UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setPrenom(user.getPrenom());
        userDto.setNom(user.getNom());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setTelephone(user.getTelephone());
        userDto.setRole(user.getRoleUser().getRole());
        return userDto;
    }

    public User getUserByUsername(String username) {
        Iterable<User> users = this.getAllUsers();
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) {
                UserDto userDto = userToUserDto(user);
                return user;
            }
        }
        return null;
    }
}
