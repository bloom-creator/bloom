package converttemp;
import java.util.Scanner;


public class ConvertTemp {

	public static void main(String[] args) {
		
 Scanner sc= new Scanner(System.in);


System.out.print("Enter temperature in Celcius: ");
double celcius = sc.nextDouble();

double fahrenheit = 9.0/5* celcius+ 32;
System.out.println( celcius+"C = "+ fahrenheit +"F");




 


 
	}

}
