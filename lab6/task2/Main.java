import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Claws claws = new Claws(9);
        Teeth teeth = new Teeth(32);
        Predator lion = new Predator("Лев", claws, teeth);

        lion.roar();
        lion.run();
        lion.hunt();
        lion.sleep();
    }
}
