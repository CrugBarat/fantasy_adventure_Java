package game_players;

import items.Weapon;

import java.util.ArrayList;

public class Warrior extends GamePlayers {

    public Warrior(String name, Weapon weapon, ArrayList<Weapon> inventory, double health) {
        super(name, weapon, inventory, health);
    }
}
