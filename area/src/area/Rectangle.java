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
public class Rectangle {
    private int length;
    private int width;
    private int area;
    private int peremeter;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
    }
    
    public void area(){
        area = length * width;
        System.out.println("The area is "+area);
        
    }
    public void peremeter(){
         peremeter = 2 *(length + width);
        System.out.println("The peremeter of rectangle is "+peremeter);
    }
        
    
}
