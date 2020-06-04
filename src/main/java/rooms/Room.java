package rooms;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<IItem> loot;

    public Room(String name, ArrayList<IItem> loot) {
        this.name = name;
        this.loot = loot;
    }

    public String getName() {
        return name;
    }

    public ArrayList<IItem> getLoot() {
        return loot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoot(ArrayList<IItem> loot) {
        this.loot = loot;
    }
}
