/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;

/**
 *
 * @author PC4
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
         int choice=0;
         Scanner sc = new Scanner(System.in);
       /* Circle circle = new Circle();
        circle.area();
        
        Rectangle rectangle = new Rectangle();
        rectangle.area();
        Triangle triangle = new Triangle();
        triangle.area();
*/

        do{
            System.out.println("\t\t!Calculate the Area!");
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Triangle");
            System.out.println("4.Quit");
            System.out.println("\tEnter Choice: ");
            choice = sc.nextInt();
           if(choice == 1){
             Circle circle = new Circle(10);
             circle.area();
             circle.circumference();
               
           }else if (choice == 2){
               Rectangle rectangle = new Rectangle();
               rectangle.input();
               rectangle.area();
               rectangle.peremeter();
               
           }else if(choice == 3){
              Triangle triangle = new Triangle();
              triangle.area(); 
               
           }else if(choice == 4){
               System.out.println("Thank You");
           }else{
               System.out.println("Enter right choice");
           }
        }while(choice != 4);
        
       
    }
    
}
