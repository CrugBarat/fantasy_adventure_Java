package game_players;

import items.IItem;
import items.Weapon;

import java.util.ArrayList;

public class Warrior extends GamePlayers {

    private double armour;
    public Warrior(String name, Weapon weapon, ArrayList<IItem> inventory, double health, double armour) {
        super(name, weapon, inventory, health);
        this.armour = armour;
    }

    public double getArmour() {
        return armour;
    }

    public void setArmour(double armour) {
        this.armour = armour;
    }


    public void defend(double damage) {
        double health = this.getHealth();
        health -= damage - getArmour();
        setHealth(health);
    }
}
