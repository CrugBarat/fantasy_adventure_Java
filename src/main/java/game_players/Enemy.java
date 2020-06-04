package game_players;

import behaviours.IFight;
import items.Weapon;

import java.util.ArrayList;

public class Enemy extends GamePlayers implements IFight {

    private String type;

    public Enemy(String name, Weapon weapon, ArrayList<Weapon> inventory, double health, String type) {
        super(name, weapon, inventory, health);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack(GamePlayers gamePlayers) {

    }

    public void defend() {

    }
}
