package items;

public class Weapon {

    private String name;
    private double damage;
    private double speed;

    public Weapon(String name, double damage, double speed) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public double getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
