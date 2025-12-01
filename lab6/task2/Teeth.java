public class Teeth {
    private int count;

    public Teeth(int count) {
        this.count = count;
    }

    public void bite() {
        System.out.println("Хищник кусает острыми зубами (" + count + " зубов)!");
    }

    public int getCount() {
        return count;
    }
}
