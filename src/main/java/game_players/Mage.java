package game_players;

import items.Weapon;
import pets.Pet;

import java.util.ArrayList;

public class Mage extends GamePlayers {

    private Pet pet;

    public Mage(String name, Weapon weapon, ArrayList<Weapon> inventory, double health, Pet pet) {
        super(name, weapon, inventory, health);
        this.pet = pet;
    }
}
