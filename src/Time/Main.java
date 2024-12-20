package Time;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String t1="", t2="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time 1 (HH:MM:SS) = ");
		t1=sc.next();
		System.out.println("Enter the Time 2 (HH:MM:SS) = ");
		t2=sc.next();
		
		Time time1 = new Time(Integer.parseInt(t1.substring(0, 2)),Integer.parseInt(t1.substring(3, 5)),Integer.parseInt(t1.substring(6, 8)));
		System.out.println(time1.toString());
		Time time2 = new Time(Integer.parseInt(t2.substring(0, 2)),Integer.parseInt(t2.substring(3, 5)),Integer.parseInt(t2.substring(6, 8)));
		System.out.println(time2.toString());
		Time difftime = new Time();
		
		System.out.println(difftime.getHoursDifference()+" Hours "+difftime.getMinutesDifference()+" Minutes "+difftime.getSecondsDifference()+" Seconds");
		sc.close();
	}
	
}
