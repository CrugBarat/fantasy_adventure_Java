package game_players;

import items.IItem;
import items.Potion;
import items.Weapon;

import java.util.ArrayList;

public class Healer extends GamePlayers {

    private Potion potion;

    public Healer(String name, Weapon weapon, ArrayList<IItem> inventory, double health, Potion potion) {
        super(name, weapon, inventory, health);
        this.potion = potion;
    }

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public void heal(GamePlayers player, double healAmount) {
        double health = player.getHealth();
        health += healAmount;
        player.setHealth(health);
    }
}
