package epsi.workshop.handihelp.Controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import epsi.workshop.handihelp.Service.UserService;
import epsi.workshop.handihelp.dao.dto.UserDto;
import epsi.workshop.handihelp.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    // Autowired
    private UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public Iterable<User> getAllUser() {
        return userService.getAllUsers();
    }
    @GetMapping("/find")
    public User getOneUser(@RequestParam String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping(value = "/login")
    public String loginUser(@RequestBody String body) {
        return userService.loginUser(body);
    }
    @PostMapping(value = "/create")
    public String createUser(@RequestBody String body) {
        return userService.createUser(body);
    }
}
