package classes_and_objects;
/*
 * Write a class that creates instances of the Rectangle Class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] arg) {
        /*****************************
         * RECTANGLE 1
         ****************************/
        // Create instance of Rectangle Class
        Rectangle room1 = new Rectangle(5,4);
        double area1 = room1.calculateArea();
        /*****************************
         * RECTANGLE 2
         ****************************/
        // Create instance of Rectangle Class
        Rectangle room2 = new Rectangle(10,6);
        double area2 = room2.calculateArea();
        // calculate total area and print output
        double totalArea = area1 + area2;
        System.out.println("The area of room 1 and room 2 combined is equal to : "+
                totalArea);
    }
}
