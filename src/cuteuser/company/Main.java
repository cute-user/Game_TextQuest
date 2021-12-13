package cuteuser.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Storage storage = new Storage();
        View view = new View();
	    Game game = new Game(storage, view);
        Location loc = storage.getLocation(0);
        game.view.showLocation(loc);
        while (true) {
            int input = in.nextInt();
            int next_loc = loc.getActions[input-1].DestLocationId;
            game.view.showLocation(storage.getLocation(next_loc));
        }
    }
}
