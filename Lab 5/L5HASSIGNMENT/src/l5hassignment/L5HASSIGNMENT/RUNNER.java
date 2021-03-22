
package l5hassignment.L5HASSIGNMENT;

import java.util.Scanner;


public class RUNNER {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int Numerator, Denominator;
	System.out.print("Enter target Fraction's Numerator: ");
	Numerator = input.nextInt();
	System.out.print("Enter target  Fraction's Denominator: ");
	Denominator = input.nextInt();
	Fraction fraction = new Fraction(Numerator, Denominator);	
		System.out.print("Enter new Numerator: ");
		int otherNumerator = input.nextInt();
		System.out.print("Enter new Denominator: ");
		int otherDenominator = input.nextInt();
		Fraction otherFraction = new Fraction(otherNumerator, otherDenominator);
		if (fraction.equals(otherFraction)) {
			fraction.displayFraction();
			System.out.print(" is equal to ");
			otherFraction.displayFraction();
		} else

		{
			fraction.displayFraction();
			System.out.print(" is not equal to ");
			otherFraction.displayFraction();
		}
    }                    
}

        
        
    
    

