package methodpac;
import javax.swing.JOptionPane;

public class OverloadedMethods {

    public static void method_1() {
        int shoppingCart_1 = 2510;
        int shoppingCart_2 = 5660;
        int shoppingCart_3 = 1000;
        int shoppingCarSum = shoppingCart_1 + shoppingCart_2 + shoppingCart_3;

        participateInDrawing(shoppingCarSum);
    }

    public static void method_1(int shoppingCart_1, int shoppingCart_2) {
        int shoppingCarSum = shoppingCart_1 + shoppingCart_2;

        participateInDrawing(shoppingCarSum);
    }

    public static void method_1(int shoppingCart_1, int shoppingCart_2, int shoppingCart_3) {
        int shoppingCarSum = shoppingCart_1 + shoppingCart_2 + shoppingCart_3;

        participateInDrawing(shoppingCarSum);
    }

    public static void participateInDrawing(int shoppingCarSum) {
        if (shoppingCarSum >= 9000) {
            String response = JOptionPane.showInputDialog("Your total is $" + shoppingCarSum + ".\n" +
                "Do you want to participate in a drawing for a car for $10 more? (yes/no):"
            );

            if (response.equalsIgnoreCase("yes")) {
                JOptionPane.showMessageDialog(null, "You've been entered into the drawing for a car! Total price: " + (shoppingCarSum + 10) );
            } else {
                JOptionPane.showMessageDialog(null, "Ok, see you next time :) enjoy your products!.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your total is less than $9000, sorry, you should have at least 9000.");
        }
    }

    public static void main(String[] args) {
        
        method_1();  
        
        method_1(1000, 2000);  

        method_1(4000, 2000, 6000);  
    }
}
