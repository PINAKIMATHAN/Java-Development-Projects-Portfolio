package bmi;
import java.util.Scanner;
import java.text.DecimalFormat;
public class bmi {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("############   ######### #########     #################");
		System.out.println("############   ######### #########     #################");
		System.out.println("####    ####   ### ##### ##### ###     #################");
		System.out.println("####    ####   ###  #### ####  ###           #####");
		System.out.println("####    ####   ###   ### ###   ###           #####");
		System.out.println("############   ###    ## ##    ###           #####");
		System.out.println("############   ###     ###     ###           #####");
		System.out.println("####    ####   ###             ###           #####");
		System.out.println("####    ####   ###             ###           #####");
		System.out.println("####    ####   ###             ###     #################");
		System.out.println("############   ###             ###     #################");
		System.out.println("########################################################");

		System.out.println("Welcome to the BMI Measurement Program");
		System.out.println("");
		
		int counter =0;
		while (counter <= 1000000)  {
		System.out.println("");
		System.out.println("");
	System.out.println("Enter your size");
int j1 = in.nextInt();
System.out.println("");
System.out.println("Enter your weight");
int j2 = in.nextInt();


int r1 = j1;
int r2 = j2;
double r = r1 * r1;
double r3 = r2 / r;
double r4 = r3 * 10000;
DecimalFormat df = new  DecimalFormat(".00");

double nge =18.5;
double ngs = 30;
System.out.println("");
System.out.println("Your result is " + df.format(r4));
System.out.println("");

}
 	}
 }
