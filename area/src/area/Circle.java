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
public class Circle {
    private int radius;
    private double area;
    private double circumference;
    /**
     * Constructor is a special method
     * 1.Name should be same as class name
     * 2.No return type
     * 3.Used to initialize the variables
     * 4.Must be Public
     * 5.A class can have multiple constructor
     * @param radius 
     */
    public Circle(){
        radius = 0;
        area = 0;
        circumference = 0;
    }
    public Circle(int radius){
       this.radius = radius;
       area = 0;
       circumference = 0;
    }
    public Circle(int radius,double area,double circumference){
         this.radius = radius;
         this.area = area;
         this.circumference = circumference ;
        
    }
    public void input(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter radious: ");
        radius = sc.nextInt();
    }
    public void area(){
        area = 3.14 * radius * radius;
        System.out.println("The area ia "+area);
       
    }
    public void circumference(){
        circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of circle is "+ circumference);
    }
        
}
