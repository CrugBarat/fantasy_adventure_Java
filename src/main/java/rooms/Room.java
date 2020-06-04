package rooms;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import game_players.Enemy;
import game_players.GamePlayers;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<IItem> loot;
    private ArrayList<Enemy> enemies;
    private GamePlayers gamePlayer;

    public Room(String name, GamePlayers gamePlayer) {
        this.name = name;
        this.loot = new ArrayList<>();
        this.enemies = new ArrayList<>();
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

}
