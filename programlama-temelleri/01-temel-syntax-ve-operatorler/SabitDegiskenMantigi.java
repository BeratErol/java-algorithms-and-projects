// Yarıçapın girilmesiyle dairenin alan hesabı 
// Final değişkenini öğrenme

import java.util.Scanner;   // Scanner is in the java.util package 

public class SabitDegiskenMantigi {
	public static void main (String[] args) { 
    final double PI = 3.14159;    // Declare a constant 
    /* if (PI>0)
	PI++;   PI'yi final değişkeninde sabit olarak tanımladığımız için değiştirmeye çalıştığımızda hata verir. */
    
    // Create a Scanner object 
	Scanner input = new Scanner(System.in);
	
	// Prompt the user to ender a radius
	System.out.print("Enter a number for radius: ");
	double radius = input.nextDouble();	
	
	// Compute area
	double area = radius * radius * PI ;
	
	//Display result 
	System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}

