package pets;

import behaviours.IFight;
import game_players.GamePlayers;
import items.IItem;

public class Pet implements IItem, IFight {

    private String name;
    private String type;
    private double health;

    public Pet(String name, String type, double health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String type() {
        return "pet";
    }

    public void attack(GamePlayers gamePlayers) {

    }

    public void defend(double damage) {
        this.health -= damage;
    }

}
