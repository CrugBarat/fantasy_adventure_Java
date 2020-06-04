import game_players.Enemy;
import game_players.GamePlayers;
import game_players.Warrior;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    private Weapon axe;
    private GamePlayers player;
    private Enemy enemy;

    @Before
    public void before(){
        axe = new Weapon("Axe", 10, 5);
        player = new Warrior("Dave", axe, 100, 5);
        enemy = new Enemy("Korg", axe, 50, "Rockman");
    }

    @Test
    public void canDefend(){
        player.defend(10);
        assertEquals(95, player.getHealth(), 0.01);
    }

    @Test
    public void canAttack() {
        player.attack(enemy);
        assertEquals(40, enemy.getHealth(), 0.01);
    }
}
