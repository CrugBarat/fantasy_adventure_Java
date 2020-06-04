package game_players;

import behaviours.IFight;
import items.IItem;
import items.Weapon;

import java.util.ArrayList;

public abstract class GamePlayers implements IFight {

    private String name;
    private Weapon weapon;
    private ArrayList<IItem> inventory;
    private double health;

    public GamePlayers(String name, Weapon weapon, ArrayList<IItem> inventory, double health) {
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

    public ArrayList<IItem> getInventory() {
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

    public void setInventory(ArrayList<IItem> inventory) {
        this.inventory = inventory;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void attack(GamePlayers gamePlayers) {
        gamePlayers.defend(this.weapon.getDamage());
    }

    public void defend(double damage) {
        this.health -= damage;
    }

    public void addToInventory(IItem item){
        this.inventory.add(item);
    }
}
