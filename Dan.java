package jums;
import java.util.Scanner;
public class Dan {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("temperature conversion fro degree to kelvin");
		 int m=0;
		do{
		System.out.println("enter temperature values in degrees");
		float degree=in.nextFloat();
		m++;
		System.out.println(degree +" degree is equivalent to kelvin: "+(degree+273));
	}while(m<100);
	}
	}


