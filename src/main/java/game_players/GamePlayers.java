package game_players;

public abstract class GamePlayers {

    private String name;
    private Weapon weapon;
    private ArrayList<Weapon> inventory;
    private double health;

    public GamePlayers(String name, Weapon weapon, ArrayList<Weapon> inventory, double health) {
        this.name = name;
        this.weapon = weapon;
        this.inventory = inventory;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public ArrayList<Weapon> getInventory() {
        return inventory;
    }

    public double getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setInventory(ArrayList<Weapon> inventory) {
        this.inventory = inventory;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
