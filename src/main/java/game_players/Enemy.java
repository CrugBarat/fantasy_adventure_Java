package game_players;

import behaviours.IFight;
import items.Weapon;

public class Enemy extends GamePlayers implements IFight {

    private String type;

    public Enemy(String name, Weapon weapon, double health, String type) {
        super(name, weapon, health);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
