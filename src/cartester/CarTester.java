/*
 * David Lutelmowski
 * 20/03/19
 * CarTester
 */
package cartester;

import javax.swing.JOptionPane;

/**
 *
 * @author dalut3278
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static String c1, c2, c3;
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        Car car1 = new Car();
        int k = JOptionPane.showConfirmDialog(null, car1.toString());
        if (k != JOptionPane.YES_OPTION) {
            car1 = new Car();
        } else {
            c1 = car1.toString();
        }
        
        Car car2 = new Car();
        k = JOptionPane.showConfirmDialog(null, car2.toString());
        if (k != JOptionPane.YES_OPTION) {
            car2 = new Car();
        } else {
            c2 = car2.toString();
        }
        
        Car car3 = new Car();
        k = JOptionPane.showConfirmDialog(null, car2.toString());
        if (k != JOptionPane.YES_OPTION) {
            car3 = new Car();
        } else {
            c3 = car3.toString();
        }
        
        //Print the details of each dog
        System.out.println(c1);
        System.out.println("--------------------------");

        System.out.println(c2);
        System.out.println("--------------------------");

        //toString() is called by default, no need to write it!
        System.out.println(c3);
        System.out.println("--------------------------");

        car1.honk();

        car2.honk();

        car3.honk();
    }
}
