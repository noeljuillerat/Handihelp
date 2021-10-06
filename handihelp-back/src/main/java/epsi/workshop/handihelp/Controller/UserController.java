package epsi.workshop.handihelp.Controller;

import epsi.workshop.handihelp.Service.UserService;
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
    public User getOneUser(@RequestParam String userId) {
        return userService.getUserById(Long.valueOf(userId));
    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createUser(@RequestBody MultiValueMap<String, String> formData) {
        System.out.println(formData);
        String message = formData.getFirst("username") + " : " + formData.getFirst("password");
//        String value = formData.getFirst("test");
//        String message = "Valeur : " + value;
        return message;
    }
}
