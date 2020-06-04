import game_players.GamePlayers;
import game_players.Warrior;
import items.IItem;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    private Weapon axe;
    private GamePlayers player;
    private ArrayList<IItem> inventory;

    @Before
    public void before(){
        inventory = new ArrayList<IItem>();
        axe = new Weapon("Axe", 10, 5);
        player = new Warrior("Dave", axe, inventory, 100, 5);
    }

    @Test
    public void canDefend(){

        player.defend(10);
        assertEquals(95, player.getHealth(), 0.01);
        }


}
