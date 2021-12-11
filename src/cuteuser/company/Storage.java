package cuteuser.company;

public class Storage {
    Location locs[] = new Location[3];
    public Storage() {
        locs[0] = new Location("You are in the forest", new Action[] {
                new Action("Go Home", 2),
                new Action("Go to the Village", 1)});

        locs[1] = new Location("You are in the Village", new Action[] {
                new Action("Go Home", 2),
                new Action("Go Forest", 0)});

        locs[2] = new Location("You are in the Home", new Action[] {
                new Action("Go Forest", 0),
                new Action("Go to the Village", 1)});

    }
    Location getLocation(int id) {
        return locs[id];
    }

}
