import game_players.GamePlayers;
import game_players.Healer;
import items.Potion;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {


    private Weapon axe;
    private Potion potion;
    private Healer player;
    private GamePlayers playerToHeal;

    @Before
    public void before(){
        potion = new Potion("Heal 10", 50);
        axe = new Weapon("Axe", 10, 5);
        player = new Healer("Dave", axe, 50, potion);
        playerToHeal = new Healer("Dave", axe, 50, potion);
//        enemy = new Enemy("Korg", axe, inventory, 50, "Rockman");
    }

    @Test
    public void canHealPlayer() {
        player.heal(playerToHeal, 20);
        assertEquals(70, playerToHeal.getHealth(), 0.01);
    }
}
