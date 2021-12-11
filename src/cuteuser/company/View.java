package cuteuser.company;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    void showLocation(Location loc) {
        System.out.println(loc.getText);
        for (int i=0; i< loc.getActions.length; i++) {
            System.out.println(loc.getActions[i].getText);
        }
        int input =  in.nextInt();
    }
}
