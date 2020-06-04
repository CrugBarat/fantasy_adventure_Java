import game_players.Enemy;
import game_players.GamePlayers;
import game_players.Mage;
import game_players.Warrior;
import items.IItem;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import pets.Pet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MageTest {


    private Weapon axe;
    private Pet pet;
    private GamePlayers player;
    private Enemy enemy;

    @Before
    public void before(){
        pet = new Pet("Fluffy", "Rhino", 50);
        axe = new Weapon("Axe", 10, 5);
        player = new Mage("Dave", axe, 50, pet);
        enemy = new Enemy("Korg", axe, 50, "Rockman");
    }

    @Test
    public void canDefendWithPet(){
        player.defend(10);
        assertEquals(50, player.getHealth(), 0.01);
        assertEquals(40, pet.getHealth(), 0.01);
    }

    @Test
    public void canDefendWithPetTooMuchDamageForPet(){
        player.defend(60);
        assertEquals(40, player.getHealth(), 0.01);
        assertEquals(0, pet.getHealth(), 0.01);
    }

    @Test
    public void canDefendWithPetTooMuchDamageForAll(){
        player.defend(110);
        assertEquals(0, player.getHealth(), 0.01);
        assertEquals(0, pet.getHealth(), 0.01);
    }
}
