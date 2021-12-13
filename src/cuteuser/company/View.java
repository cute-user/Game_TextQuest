package cuteuser.company;

import java.util.Scanner;

public class View {
    static Scanner in = new Scanner(System.in);
    UserChoiceListener uc;
    View(UserChoiceListener uc) {
        this.uc = uc;
    }
    void showLocation(Location loc) {
        System.out.println(loc.getText);
        for (int i=0; i< loc.getActions.length; i++) {
            System.out.println(i+1 + ". "+ loc.getActions[i].getText);
        }
        int input = in.nextInt() - 1;
        uc.userChoice(input);
    }
}
