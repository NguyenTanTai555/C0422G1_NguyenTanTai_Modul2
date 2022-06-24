package model;

public class Room extends Facility {
    String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double price, int numberOfPeople, String rentalType, String freeService) {
        super(nameService, price, numberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room" + super.toString() +
                "\nfreeService='" + freeService;
    }
}
