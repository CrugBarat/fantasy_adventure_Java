import game_players.Enemy;
import game_players.GamePlayers;
import game_players.Mage;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import pets.Pet;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Weapon wand;
    private Weapon axe;
    private Pet pet;
    private GamePlayers player;
    private Enemy enemy;
    private Room room;
    private ArrayList<Enemy> enemies;

    @Before
    public void before(){
        pet = new Pet("Fluffy", "Rhino", 50);
        wand = new Weapon("Wand", 10, 5);
        axe = new Weapon("axe", 5, 5);
        player = new Mage("Dave", wand, 50, pet);
        enemy = new Enemy("Korg", axe, 50, "Rockman");
        room = new Room("Water Room", player);

    }

    @Test
    public void hasEmptyEnemies() {
        assertEquals(0, room.getEnemiesSize());
    }

    @Test
    public void canAddEnemies() {
        room.addEnemy(enemy);
        assertEquals(1, room.getEnemiesSize());
    }


    @Test
    public void canAddLoot() {
        room.addLoot(axe);
        assertEquals(1, room.getLootSize());
    }

    @Test
    public void canHaveRoundOfAttacks() {
        room.addEnemy(enemy);
        room.roundOffAttacks();
        assertEquals(50, player.getHealth(), 0.01);
        assertEquals(45, pet.getHealth(), 0.01);
        assertEquals(40, enemy.getHealth(), 0.01);
    }
}
