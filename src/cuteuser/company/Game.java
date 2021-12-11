package cuteuser.company;

public class Game implements UserChoiceListener{

    public static Storage storage;
    public static View view;

    public static void main(String[] args) {
        View view = new View();
        Storage storage = new Storage();
    }

    public void userChoice(int choice) {
        view.showLocation(storage.getLocation(choice));
    }
}
