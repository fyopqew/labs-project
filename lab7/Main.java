import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

abstract class SpaceObject {
    private String name;

    public SpaceObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void launch();
}

class Rocket extends SpaceObject {

    public Rocket(String name) {
        super(name);
    }

    @Override
    public void launch() {
        System.out.println("🚀 Ракета " + getName() + " стартует с космодрома!");
    }
}

class Satellite extends SpaceObject {

    public Satellite(String name) {
        super(name);
    }

    @Override
    public void launch() {
        System.out.println("🛰️ Спутник " + getName() + " выведен на орбиту!");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        SpaceObject rocket = new Rocket("Falcon 9");
        SpaceObject satellite = new Satellite("Hubble");

        rocket.launch();
        satellite.launch();
    }
}
