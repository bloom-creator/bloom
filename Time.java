
package time;


public class Time {

	
	public static void newLine() {
		System.out.println();
	}

	
	public static void main(String[] args) {
		
		int hour, minute, second;
		hour= 17;
		minute= 30;
		second=50;
		System.out.print("The current time is: ");
		System.out.println(hour+ ":"+ minute+ ":"+ second);
		newLine();
		
		System.out.println("The current time is: "+ hour+ ":"+ minute+":"+ second);
		newLine();
		
		System.out.print("The number of seconds since midnight: ");
		System.out.println(3600*hour+ 60*minute+ second);
		newLine();
		
		System.out.println("The number of seconds remaining in the day:  "+ (3600*24- (3600*hour+60*minute+second)));
		newLine();
		
		System.out.print("The percentage of the day that has passed: ");
		System.out.println(( (17*3600+ 30*60+ 50)*100)/86400+ "%");
		newLine();
		
		
		//Another way 
		
		int secSinceMidNite = 3600*hour+ minute*60+ second;
		System.out.println("The number of seconds since mid night: "+ secSinceMidNite);
		newLine();
		
		int secRemain = (86400- secSinceMidNite);
		System.out.println("The number of seconds remaining in the day: "+secRemain);
		newLine();
		
		System.out.println("The percentage of the day that has passed: "+ secSinceMidNite*100/86400+ "%");
		newLine();
		
		
		int hourNow, minuteNow, secondNow;
		hourNow= 18;
	    minuteNow= 20;
		secondNow= 15;
		int secNow= (hourNow*3600+ minuteNow*60+ secondNow);
		System.out.println("The eslaped time: "+ (secNow-secSinceMidNite));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
