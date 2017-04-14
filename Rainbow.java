package jums;
import java.util.Scanner;
public class Rainbow {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int x=1;
	do{
	System.out.println("enter any number from number from 1-7 to get the colour of the rainbow");
	x++;
	int number=in.nextInt();
	switch(number){
	case 1:{
		System.out.println("RED");
		break;
	}
	case 2:{
		System.out.println("ORANGE");
		break;
	}
	case 3:{
		System.out.println("YELLOW");
		break;
	}
	case 4:{
		System.out.println("GREEN");
		break;
	}
	case 5:{
		System.out.println("BLUE");
		break;
	}
	case 6:{
		System.out.println("INDIGO");
		break;
	}
	case 7:{
		System.out.println("VIOLET");
		break;
	}
		default:{
			System.out.println("the number does not exist");
		}
		
	}
}while(x<=8);
}
}
