
public class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        this.numerator = 1;
        this.denominator = 5;
    }

    public Fraction( int num, int denominator ){
        this.numerator = num;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator( int num ){
        this.numerator = num;
    }

    public void setDenominator( int den ){
        this.denominator = den;
    }
    
    public Fraction add( int num2, int den2 ){
        Fraction fraction2 = new Fraction( num2, den2 );
        return add( fraction2 );
    }

    public Fraction add( Fraction fraction2 ){
        int num = this.numerator * fraction2.getDenominator() + this.denominator * fraction2.getNumerator();
        int den = this.denominator * fraction2.getDenominator();

        Fraction result = new Fraction( num, den );
        return result;
    }

    public static Fraction add_static( int num1, int den1, int num2, int den2 ){
        Fraction fraction1 = new Fraction( num1, den1 );
        Fraction fraction2 = new Fraction( num2, den2 );

        return fraction1.add( fraction2 );
    }

    public Fraction subtract( Fraction fraction2 ){
        int num = this.numerator * fraction2.getDenominator() - this.denominator * fraction2.getNumerator();
        int den = this.denominator * fraction2.getDenominator();

        Fraction result = new Fraction( num, den );
        return result;
    }

    public Fraction multiply( Fraction fraction2 ){
        int num = this.numerator * fraction2.getNumerator();
        int den = this.denominator * fraction2.getDenominator();

        Fraction result = new Fraction( num, den );
        return result;
    }

    public Fraction divide( Fraction fraction2 ){
        int num = this.numerator * fraction2.getDenominator();
        int den = this.denominator * fraction2.getNumerator();

        Fraction result = new Fraction( num, den );
        return result;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public Fraction test(){
        return this;
    }
}