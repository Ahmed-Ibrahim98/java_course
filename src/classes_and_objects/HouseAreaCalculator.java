package classes_and_objects;

public class HouseAreaCalculator {
    public static void main(String[] args) {
        double room1Length = 5.0;
        double room1Width = 4.0;
        double room2Length = 6.0;
        double room2Width = 3.0;

        double room1Area = room1Length * room1Width;
        double room2Area = room2Length * room2Width;

        double totalArea = room1Area + room2Area;

        System.out.println("Room 1 Area: " + room1Area);
        System.out.println("Room 2 Area: " + room2Area);
        System.out.println("Total Area: " + totalArea);
    }
}
