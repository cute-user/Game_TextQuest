package cuteuser.company;

public class View {
    void showLocation(Location loc) {
        System.out.println(loc.getText);
        for (int i=0; i< loc.getActions.length; i++) {
            System.out.println(loc.getActions[i].getText);
        }
    }
}
