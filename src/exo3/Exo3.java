/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * 
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter the operator:\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo\n");
        int nb;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n choisir le nombre correspondant au cacul désiré :");
        nb=sc.nextInt(); 
        int operateur = nb ;

    }
    
}
