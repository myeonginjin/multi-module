package fuck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("")
    public Payment payment() {
        Payment payment = new Payment(1, 1000);
        payment.discount();
        return payment;
    }
}
