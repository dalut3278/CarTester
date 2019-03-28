package cartester;

import javax.swing.JOptionPane;

/**
 *
 * @author dalut3278
 */
public class Car {
 //variables for characteristics

  public static String carMake, carModel, carColour, price, miles, condition;
  
  //constructors
  public Car() { 
    carMake = JOptionPane.showInputDialog("Enter a car Make: ");
    if(carMake == null){
        System.exit(0);
    }
    carModel = JOptionPane.showInputDialog("Enter a car Model: ");
    if(carModel == null){
        System.exit(0);
    }
    carColour = JOptionPane.showInputDialog("Enter the colour of the car: ");
    if(carColour == null){
        System.exit(0);
    }
    price = JOptionPane.showInputDialog("Enter the price: ");
    if(price == null){
        System.exit(0);
    }
    miles = JOptionPane.showInputDialog("Enter the miles: ");
    if(miles == null){
        System.exit(0);
    }
    condition = JOptionPane.showInputDialog("Enter the condition: ");
    if(condition == null){
        System.exit(0);
    }
  }


  public void honk() {
    System.out.println("HONK!");
  }

  //method to display all info of the Dog
  public String toString() {
    String output = "Car: " + carMake + " " + carModel + "\n";
    output += "Colour: " + carColour + "\n";
    output += "Price: $" + price + "\n";
    output += "Mileage: " + miles + "\n";
    output += "Condition: " + condition;
    //output string is complete, return it
    return output;    
}
}
