package l5hassignment.L5HASSIGNMENT;


public class Fraction {
    
    
    private int Numerator;
    private int Denominator;

    public Fraction(int n, int d) 
    {
        Numerator = n;
	Denominator = d;
    }

    public void setNumerator(int n) 
    {
	Numerator = n;
    }
    public void setDenominator(int d)
    {
        Denominator = d;
    }

    public void displayFraction()
    {
	System.out.print(Numerator + "/" + Denominator);
    }

    public boolean equals(Fraction other)
    {
	int num1, num2;
	int num3, num4;
	int num5 = 1;
        for (int i = 2; i <= Math.min(Numerator, Denominator); i++) 
	{

            if (Numerator % i == 0 && Denominator % i == 0)
            num5 = i;
	}

	num1 = Numerator / num5;
	num2 = Denominator / num5;

	int otherGcf = 1;
	for (int i = 2; i <= Math.min(other.Numerator, other.Denominator); i++) 
	{
			
            if (other.Numerator % i == 0 && other.Denominator % i == 0)
            otherGcf = i;
	}

	num3 = other.Numerator / otherGcf;
	num4 = other.Denominator / otherGcf;

	return (num1 == num3 && num2 == num4);

	}

}


    
