package fuck;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    private String name;

    public User() {
        this.name = "default";
    }
}
