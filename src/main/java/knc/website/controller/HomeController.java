package knc.website.controller;

import knc.website.model.User;
import knc.website.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    private UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public String getIndex() {
        return "index";
    }

    @GetMapping("mongo")
    public String getMongo() {
        User user = userRepository.findByUsername("test");
        return user.toString();
    }

    @GetMapping("user")
    public String getUser() {
        return "hello user";
    }

    @GetMapping("user/super")
    public String getUserSuper() {
        return "hello user super";
    }

    @GetMapping("admin")
    public String getAdmin() {
        return "hello admin";
    }
}
