/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1andrey;

import javax.swing.JOptionPane;

/**
 *
 * @author yorle
 */
public class Quiz1Andrey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String nom=JOptionPane.showInputDialog("Digite su nombre");
        String ape=JOptionPane.showInputDialog("Cual es su apellido");
        String lectura;
        double sal;
        lectura=JOptionPane.showInputDialog("Cual es su salario");
        sal=Double.parseDouble(lectura);
        JOptionPane.showMessageDialog(null, sal*0.0925);
        
              
        
    }
     
   
}
