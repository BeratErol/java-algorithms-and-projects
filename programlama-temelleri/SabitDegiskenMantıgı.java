// YarÄ±Ã§apÄ±n girilmesiyle dairenin alan hesabÄ± 
// Final deÄŸiÅŸkenini Ã¶ÄŸrenme

import java.util.Scanner;   // Scanner is in the java.util package 

public class SabitDegiskenMantıgı {
	public static void main (String[] args) { 
    final double PI = 3.14159;    // Declare a constant 
    /* if (PI>0)
	PI++;   PI'yi final deÄŸiÅŸkeninde sabit olarak tanÄ±mladÄ±ÄŸÄ±mÄ±z iÃ§in deÄŸiÅŸtirmeye Ã§alÄ±ÅŸtÄ±ÄŸÄ±mÄ±zda hata verir. */
    
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

