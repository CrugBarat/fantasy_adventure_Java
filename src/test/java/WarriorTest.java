import game_players.GamePlayers;
import game_players.Warrior;
import items.IItem;
import items.Weapon;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {



    @Test
    public void canDefend(){
        ArrayList<IItem> inventory  = new ArrayList<IItem>();
        Weapon axe = new Weapon("Axe", 10, 5);
        GamePlayers player = new Warrior("Dave", axe, inventory, 100);
        player.defend(10);
        assertEquals(90, player.getHealth(), 0.01);
        }
    }
}
