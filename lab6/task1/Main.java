import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Sloth sloth1 = new Sloth();
        Sloth sloth2 = new Sloth("Сэм", 5, 6.3, "Манговое дерево");

        sloth1.showInfo();
        sloth2.showInfo();

        sloth1.sleep();
        sloth2.eat("листья");

        sloth1.setWeight(5.1);
        System.out.println(sloth1.name + " теперь весит " + sloth1.getWeight() + " кг.");
    }
}
