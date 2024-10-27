package RoomClass;

public class Room {
    private int roomNo;
    private String roomType;
    private double roomArea;
    private String acMachine;


    //constructor declaration
    public Room() {
        this.roomNo = 0;
        this.roomType = " ";
        this.roomArea = 0.0;
        this.acMachine = " ";
    }
    // setData which sets the informations of room
    public void setData(int roomNo, String roomType, double roomArea, String acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }
    //display the data which was set
    public void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq.ft");
        System.out.println("AC Available: " + acMachine.toUpperCase());
    }


}
