import game_players.Enemy;
import game_players.GamePlayers;
import game_players.Healer;
import game_players.Mage;
import items.IItem;
import items.Potion;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import pets.Pet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HealerTest {


    private Weapon axe;
    private Potion potion;
    private Healer player;
    private GamePlayers playerToHeal;
    private ArrayList<IItem> inventory;

    @Before
    public void before(){
        inventory = new ArrayList<IItem>();
        potion = new Potion("Heal 10", 50);
        axe = new Weapon("Axe", 10, 5);
        player = new Healer("Dave", axe, inventory, 50, potion);
        playerToHeal = new Healer("Dave", axe, inventory, 50, potion);
//        enemy = new Enemy("Korg", axe, inventory, 50, "Rockman");
    }

    @Test
    public void canHealPlayer() {
        player.heal(playerToHeal, 20);
        assertEquals(70, playerToHeal.getHealth(), 0.01);
    }
}
