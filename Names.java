/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINE
 */
import java.util.Scanner;
public class Names {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your firstname");
        String firstname=scanner.nextLine();
        System.out.print("enter the secondname");
        String secondname=scanner.nextLine();
        System.out.print(secondname+"" +firstname);
        System.out.println();
        
        
        
    }
}
