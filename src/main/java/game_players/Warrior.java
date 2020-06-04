package game_players;

import items.IItem;
import items.Weapon;

import java.util.ArrayList;

public class Warrior extends GamePlayers {

    public Warrior(String name, Weapon weapon, ArrayList<IItem> inventory, double health) {
        super(name, weapon, inventory, health);
    }
}
