package game_players;

import items.IItem;
import items.Weapon;
import pets.Pet;

import java.util.ArrayList;

public class Mage extends GamePlayers {

    private Pet pet;

    public Mage(String name, Weapon weapon, double health, Pet pet) {
        super(name, weapon, health);
        this.pet = pet;
    }


    public void defend(double damage) {
        double health = this.getHealth();
        double petHealth = this.pet.getHealth();


        if (petHealth >= damage) {
            petHealth -= damage;
            damage = 0;
        } else if(petHealth < damage){
            damage -= petHealth;
            petHealth = 0;
        }

        if (health >= damage) {
            health -= damage;
        } else if(health < damage){
            health = 0;
        }

        setHealth(health);
        pet.setHealth(petHealth);
    }

}
