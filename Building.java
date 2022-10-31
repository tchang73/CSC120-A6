/**
 * constructs building when given name, address, and number of floors
 * @param: name, address, nFloors
 * @return: a message stating the building's informations.
 */

public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    public String getName() { //get name of building
        return this.name;
    }

    public String getAddress() { // get address of building
        return this.address;
    }

    public int getFloors() { //get number of floors of building
        return this.nFloors;
    }

    public String toString() { //construct message with given info of building
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}