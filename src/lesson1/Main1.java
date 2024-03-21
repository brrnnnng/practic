package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int wightOfTable = 300;
        int lenghtOfTable = 500;
        int wightOfRoom = 3400;
        int leightOfRoom = 2500;

        int ploshadOfTable = wightOfTable * lenghtOfTable;
        int ploshadOfRoom = wightOfRoom * leightOfRoom;

        int tablesToInsertToRoom = ploshadOfRoom / ploshadOfTable;
        System.out.println(tablesToInsertToRoom);
    }
}
