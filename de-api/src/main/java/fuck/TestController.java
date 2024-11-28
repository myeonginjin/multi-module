package fuck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public static User user;

    @GetMapping("")
    public String test() {
        user = new User();
        user.setName("SUCCESS");
        return user.getName() +"    HAPPY ~";
    }
}
