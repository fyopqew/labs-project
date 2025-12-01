public class Sloth {
    public String name;         
    protected int age;           
    private double weight;       
    String favoriteTree;         

    public Sloth() {
        name = "Безымянный ленивец";
        age = 1;
        weight = 4.5;
        favoriteTree = "Не указано";
    }

    public Sloth(String name, int age, double weight, String favoriteTree) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favoriteTree = favoriteTree;
    }

    public void sleep() {
        System.out.println(name + " спит на дереве " + favoriteTree + ".");
    }

    protected void eat(String food) {
        System.out.println(name + " медленно ест " + food + ".");
    }

    private void think() {
        System.out.println(name + " думает... но очень медленно");
    }

    void showInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + " кг, Любимое дерево: " + favoriteTree);
        think();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}
