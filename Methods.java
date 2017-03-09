/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.in.java;

/**
 *
 * @author WEKESA
 */
public class Methods {
    public static void main(String[] args){
        int a=23;
        int b=43;
        int c=minFunction(a,b);
        System.out.println("the minimum value is:"+c);
        
    }
public static int minFunction(int x,int y){
    int min;
    if(x>y)
        min=y;
    else
        min=x;
    return min;
}    
    
}
