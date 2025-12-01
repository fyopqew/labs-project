public class Claws {
    private int sharpness;

    public Claws(int sharpness) {
        this.sharpness = sharpness;
    }

    public void scratch() {
        System.out.println("Хищник выпускает когти с остротой " + sharpness + " и царапает добычу!");
    }

    public int getSharpness() {
        return sharpness;
    }
}
