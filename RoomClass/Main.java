package RoomClass;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        Scanner input = new Scanner(System.in);
        int roomNo; String roomType; double roomArea; String acMachine;

        System.out.print("Enter Room No: ");
        roomNo = input.nextInt();
        input.nextLine();

        System.out.print("Enter Room Type: ");
        roomType = input.nextLine();
       


        System.out.print("Enter Room Area: ");
        roomArea = input.nextDouble();
        input.nextLine();

        System.out.print("If AC is included: ");
        acMachine = input.nextLine();



        room.setData(roomNo, roomType, roomArea, acMachine);

        System.out.println("\nRoom Details:");
        room.displayData();

        input.close();

    }
    
}