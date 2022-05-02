/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleadder;

/**
 * Controller
 * @author novac
 */
public class SimpleAdder {

    /* 
      A controller will always need instance variables for each *view* 
      class (window) and at least one variable for the *model*, potentially
      more depending on the structure of the model.
      
      This controller has one instance variable to hold the CURRENT adder (model)
      and one variable to reference the window (view).
    */
    private Adder currentAdder;
    private AdderWindow window;
    
    
    
    /**
     * This method is run right after creating the controller.
     */
    public void start() {
        window = new AdderWindow();
        window.setController(this);
        window.setVisible(true);
    }
    
    /**
     * This method is run by the window class. It tells the controller
     * that the add button is pressed and gives it the necessary information.
     * @param num1Text The String value of what's inside the num1 text field
     * @param num2Text The String value of what's inside the num2 text field
     */
    void addButtonPressed(String num1Text, String num2Text) {
        // Try converting the strings into doubles
        // If there is an error in the format, set an error
        // otherwise, create the adder and display it.
        double n1, n2;
        try {
            n1 = Double.parseDouble(num1Text);
            n2 = Double.parseDouble(num2Text);
        }catch (NumberFormatException e) {
            window.setAnswer("Error in input");
            return;
        }
        
        currentAdder = new Adder(n1, n2);      
        double sum = currentAdder.getSum();
        window.setAnswer(sum);
    }
    
    

    /**
     * Run with the program first begins.
     * Creates the controller and starts it up.
     * @param args 
     */ 
    public static void main(String[] args) {
        SimpleAdder controller = new SimpleAdder();
        controller.start();
    }    
}
