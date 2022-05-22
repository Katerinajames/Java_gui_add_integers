/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package add;

import javax.swing.JOptionPane;

/**
 *
 * @author katherine
 */
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s=JOptionPane.showInputDialog("Enter first integer");
        int f=Integer.parseInt(s);
        String s1=JOptionPane.showInputDialog("Enter second integer");
        int f1=Integer.parseInt(s1);
        int sum=f+f1;
        String message=String.format("Our sum is %d",sum);
        
        JOptionPane.showMessageDialog(null,message);
        
    }
    
}
