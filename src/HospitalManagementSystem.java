
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author saksh
 */
public class HospitalManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
    } catch(Exception ignored){}

    new HospitalManagementSystem(); //start your application
}  
    
}
