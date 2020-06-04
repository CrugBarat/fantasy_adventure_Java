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

}
