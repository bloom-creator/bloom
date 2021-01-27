package convertime;

import java.util.Scanner;

public class ConvertTime {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("What number you wanna change?");
		int input = sc.nextInt();
		int a= input% 3600;
		int hour= input/3600;
		int b= a%60;
		int minute= a/60;
		int second= b;
		System.out.println(hour+"hours "+minute+"minutes "+second+"seconds.");
		
		
		
		
		
		
		
		
		

	}

}
