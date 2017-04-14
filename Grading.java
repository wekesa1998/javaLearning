package jums;
import java.util.Scanner;
public class Grading {
public static void main(String[] args){	
Scanner in=new Scanner(System.in);
int x=1;
do{
System.out.println("enter marks");
x++;
int marks=in.nextInt();
if(marks>=70&&marks<=100){
	System.out.println("A");
}
else if(marks>=60&&marks<=69){
	System.out.println("B");
}
else if(marks>=50&&marks<=59){
	System.out.println("C");
}
else if(marks>=40&&marks<=49){
	System.out.println("D");
}
else{
	System.out.println("FAIL");
}
}while(x<=10);
}
	
	}

