package jums;
import java.util.Scanner;
public class Idno {
public static void main(String[] args){
	Scanner sam=new Scanner(System.in);
	System.out.println("enter your ID no.");
	int IDno=sam.nextInt();
	if(IDno==35004267){
	System.out.println("correct IDno.");
	}
	if(IDno==35004287){
		System.out.println("you burgar");
	
	}
	else if(IDno==35161505){
		System.out.println("stop it Sam");
	}
	else{
		System.out.println("stop");
	}
}
}
