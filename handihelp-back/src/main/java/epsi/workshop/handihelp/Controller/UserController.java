package epsi.workshop.handihelp.Controller;

import epsi.workshop.handihelp.Service.UserService;
import epsi.workshop.handihelp.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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
    public User getOneUser(@RequestParam String userId) {
        return userService.getUserById(Long.valueOf(userId));
    }

}
