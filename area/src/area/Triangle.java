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
public class Triangle {
    private int base;
    private int height;
    private double area;
    
    public void area(){Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        area = 0.5 * base * height;
        System.out.println("The area is "+area);
        
    }
}
