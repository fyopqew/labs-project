public class Predator {
    private String name;
    private Claws claws;
    private Teeth teeth;

    public Predator(String name, Claws claws, Teeth teeth) {
        this.name = name;
        this.claws = claws;
        this.teeth = teeth;
    }

    public void roar() {
        System.out.println(name + " рычит громко и грозно!");
    }

    public void run() {
        System.out.println(name + " быстро бежит по саванне!");
    }

    public void sleep() {
        System.out.println(name + " отдыхает под деревом после охоты.");
    }

    public void hunt() {
        System.out.println(name + " начинает охоту...");
        claws.scratch();
        teeth.bite();
        System.out.println(name + " добывает пищу!");
    }
}
