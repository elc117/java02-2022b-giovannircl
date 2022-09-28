package Classes;

public class TestDisplay {
    public static void main(String[] args) {
        Display d1 = new Display(15, false, 3000);
        Display d2 = new Display(25, true, 2000);

        d1.status();
        d2.status();

        d1.setInches(20);
        d1.setLed(true);
        d1.setBrightness(1500);

        d1.status();

        d2.setInches(18.5);
        d2.setLed(false);
        d2.setBrightness(1000);

        d2.status();
    }
}
