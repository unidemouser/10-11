/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author My
 */
public class Util {
    
    
    public static int maximum(int a, int b){
        if(a>b){
            System.out.println(a+ " is greater than "+b);
            return a;
            
        }else{
//            Math.
            System.out.println(b+" is greater than "+a);
            return b;
        }
        
    }
    
    public static double getAreaOfCircle(double radius){
        double area=Math.PI*radius*radius;
        return area;
    }
    
    public static void printPattern(String a){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i>=j){
                    System.out.print(a);
                }
            }
            System.out.println("");
        }
    }
    
    
    
    
    
}
