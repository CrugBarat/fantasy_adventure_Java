package rooms;

import game_players.Enemy;
import game_players.GamePlayers;
import items.IItem;
import items.Weapon;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<IItem> loot;
    private ArrayList<Enemy> enemies;
    private GamePlayers gamePlayer;

    public Room(String name, GamePlayers gamePlayer) {
        this.name = name;
        this.loot = new ArrayList<IItem>();
        this.enemies = new ArrayList<Enemy>();
        this.gamePlayer = gamePlayer;
    }

    public String getName() {
        return name;
    }

    public int getLootSize() {
        return loot.size();
    }

    public ArrayList<IItem> getLoot() {
        return loot;
    }

    public int getEnemiesSize() {
        return enemies.size();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public GamePlayers getGamePlayer() {
        return gamePlayer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void addLoot(Weapon weapon) {
        this.loot.add(weapon);
    }

    public void roundOffAttacks(){
        this.gamePlayer.attack(this.enemies.get(0));
        this.enemies.get(0).attack(this.gamePlayer);
    }
}
