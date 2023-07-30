/*Create a class called House that has 3 instance variables:
a string address
an int numberOfFloors
Define a constructor method for House that will print in console a message as soon as a House object is created
Define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
you declare two House variables house1 and house2
you create two House objects and assign them to the variables house1 and house2
 */

public class Main {
    public static void main(String[] args) {

        House house1;

        house1 = new House("Via King Crimson 21" , 8);

        House house2;

        house2 = new House("Via Discipline snc" , 10);
    }
}