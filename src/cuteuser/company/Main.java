package cuteuser.company;

import java.util.Scanner;

class Game {
    Storage storage;
    View view;
    Game(Storage storage, View view) {
        this.storage = storage;
        this.view = view;
    }
}

class View {
    void showLocation(Location loc) {
        System.out.println(loc.getText);
        for (int i=0; i< loc.getActions.length; i++) {
            System.out.println(loc.getActions[i].getText);
        }
    }
}

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
