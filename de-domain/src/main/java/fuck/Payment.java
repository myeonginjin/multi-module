package fuck;


import lombok.Getter;

@Getter
public class Payment {

    private int id;
    private int amount;

    public Payment(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public void discount() {
        amount -= 100;
    }
}
