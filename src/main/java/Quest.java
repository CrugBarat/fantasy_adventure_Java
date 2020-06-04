import game_players.GamePlayers;
import rooms.Room;

import java.util.ArrayList;

public class Quest {

    private GamePlayers gamePlayer;
    private ArrayList<Room> rooms;

    public Quest(GamePlayers gamePlayer) {
        this.gamePlayer = gamePlayer;
        this.rooms = new ArrayList<Room>();
    }
}
