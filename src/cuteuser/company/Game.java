package cuteuser.company;

public class Game implements UserChoiceListener{
    private Storage storage;
    private View view;
    private Location currectLocation;

    public Game(Storage storage) {
        this.storage = storage;
        this.view = new View(this);
    }
    public void start() {
        currectLocation = storage.getLocation(0);
        view.showLocation(currectLocation);
    }
    public void userChoice(int actionIndex) {
        int idLoc =  currectLocation.getActions[actionIndex].DestLocationId;
        if (idLoc != -1) {
            currectLocation = storage.getLocation(idLoc);
            view.showLocation(currectLocation);
        }
    }
}
