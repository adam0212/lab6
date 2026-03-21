import java.util.Scanner;
/**
 * class Triangle does the following
 * 1) sets instance variables to default values
 * 2) uses method readInput to ask user for height, base, and name of a triangle
 * 3) uses method getArea to calculate area of the triangle
 * 4) uses method writeOutput to output text with the name, height, width, and area of the triangle
 * @author Adam Shaheen
 * @version V1.0
 * @since 3/20/2026
 */
public class Triangle{
    private String name;
    private double base;
    private double height;

    /**
     * Constructs a triangle with default values
     */
    public Triangle() {
        name = "unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * constructs a triangle with a specificic name and height
     * 
     * @param inName is the name of the triangle
     * @param inBase is the base of the triangle
     * @param inHeight is the height of the triangle
     */
    public Triangle(String inName, double inBase, double inHeight){
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * Sets name to newName
     * @param newName is the new name of the triangle
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * Sets base to newBase
     * @param newBase is the new base of the triangle
     */
    public void setBase(double newBase){
        base = newBase;
    }

    /**
     * Sets height to newHeight
     * @param newHeight is the new height of the triangle
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }

    /**
     * Calculates the area of the triangle
     * @return the area of the triangle which is calculated by the equation
     */
    private double getArea(){
        return base*height/2.0;
    }

    /**
     * Prints out the name, base, height, and area of the triangle
     */
    public void writeOutput(){
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle Area is: %.1f", getArea());
        System.out.println("\n");
    }

    /**
     * Prompts the user for base, height and name of the triangle
     */
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
        System.out.println();
    }
}