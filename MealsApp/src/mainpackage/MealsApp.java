/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainpackage;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.UIManager;


public class MealsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the LookAndFeel enviroment
        FlatDarculaLaf.setup();
        UIManager.put( "Button.arc", 888 );
        UIManager.put( "Component.arc", 888 );
        UIManager.put( "TextComponent.arc", 888 );
        
        MainFrame_Home r1 = new MainFrame_Home();
        r1.setVisible(true);
    }
    
}
