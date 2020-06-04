import game_players.GamePlayers;
import game_players.Warrior;
import items.Weapon;
import org.junit.Test;

public class WarriorTest {



    @Test
    public void canDefend(){

        Weapon axe = new Weapon("Axe", 10, 5);
        GamePlayers player = new Warrior("Dave", axe, );
        }
    }
}
