package sk.taskmanager.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import controller.Api;

import java.util.HashMap;
import java.util.List;

/**
 * @author Šimon Hašák
 */
@RestController
public class ApiController {

    private final Api api = new Api();

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/network")
    public List<String> getNetworkData() {
        return this.api.networkExecutor(new HashMap<>());
    }

    @GetMapping("/user")
    public Boolean getUserData() {
        return this.api.userExecutor(new HashMap<>());
    }
}
