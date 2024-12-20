package RandomPasswordGenerator;
import java.util.Scanner;

public class Input {

	public static int getPasswordLength(Scanner sc) {
		System.out.print("Enter the Length of the Password = ");
		return sc.nextInt();
	}
	
	public static Password_Options getOptions(Scanner sc) {
		Password_Options opt= new Password_Options(); 
		
		opt.numbers      = getbooleanopt(sc,"Do you want to include Numbers?(y/n)              = ");
		opt.lowercase    = getbooleanopt(sc,"Do you want to include Lowercase Letters? (y/n)   = ");
		opt.uppercase    = getbooleanopt(sc,"Do you want to include Uppercase Letters? (y/n)   = ");
		opt.specialchars = getbooleanopt(sc,"Do you want to include Special Characters?(y/n)   = ");
		
		if(opt.numbers || opt.lowercase || opt.specialchars || opt.uppercase) {
			return opt;
		}
		else {
			System.out.println("Couldn't Generate Password");
			System.exit(0);
		}
		return null;
	}
	
	public static boolean getbooleanopt(Scanner sc,String str) {
		System.out.print(str);
		return sc.next().equals("y");	
	}
	
}
