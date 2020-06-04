package items;

public class Potion {

    private String name;
    private double healing;

    public Potion(String name, double healing) {
        this.name = name;
        this.healing = healing;
    }

    public String getName() {
        return name;
    }

    public double getHealing() {
        return healing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealing(double healing) {
        this.healing = healing;
    }
}
