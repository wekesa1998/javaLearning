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
public class Methodoverloads {
    public static void main(String[] args){
        int a=89;
        int c=90;
        int d=minFunction(a,c);
        double x=45.89;
        double k=90.00;
        double f=minFunction(x,k);
        System.out.println("the minimum value is:"+d);
        System.out.println("the minimum value is:"+f);
    }
public static int minFunction(int y,int k){
    int min;
    if(y>k)
        min=k;
    else
        min=y;
    return min;
    
   
    }
public static double minFunction(double l,double s){
    double min;
    if(l>s)
        min=s;
    else
        min=l;
    return min;
    }
  }
    

