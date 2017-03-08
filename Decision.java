/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author MINE
 */
import java.util.Scanner;
public class Decision {
    public static void main(String[] args){
        Scanner dun=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=dun.nextInt();
        if(marks>=80)
        System.out.println("you passed your exam");
        else
            System.out.println("you failed the exam");
    }
    
}
