class Complex {

    float real, imaginary;

    Complex()
    {
    }

    Complex(float tempReal, float tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }

    Complex addComp(Complex C1, Complex C2)
    {

        Complex temp = new Complex();

        temp.real = C1.real + C2.real;

        temp.imaginary = C1.imaginary + C2.imaginary;

        return temp;
    }
    Complex subComp(Complex C1, Complex C2)
    {

        Complex temp = new Complex();


        temp.real = C1.real - C2.real;


        temp.imaginary = C1.imaginary - C2.imaginary;


        return temp;
    }
    Complex mulComp(Complex C1, Complex C2)
    {

        Complex temp = new Complex();

        temp.real = C1.real *C2.real - C1.imaginary*C2.imaginary;

        temp.imaginary = C1.imaginary * C2.real + C1.real*C2.imaginary;

        return temp;
    }
    Complex divComp(Complex C1, Complex C2)
    {

        Complex temp = new Complex();
        float deno = (C2.real*C2.real + C2.imaginary*C2.imaginary);
        temp.real = (C1.real*C2.real + C1.imaginary*C2.imaginary)/deno;
        temp.imaginary = -(C2.real*C1.imaginary - C1.real*C2.imaginary)/deno;

        return temp;
    }

}

public class Imaginary {


    public static void main(String[] args)
    {

        Complex C1 = new Complex(6, 4);

        System.out.println("Complex number 1 : "
                + C1.real + " + i"
                + C1.imaginary);

        Complex C2 = new Complex(4, 5);

        System.out.println("Complex number 2 : "
                + C2.real +"+ i"
                + C2.imaginary);

        Complex C3 = new Complex();

        C3 = C3.addComp(C1, C2);

        Complex C4 = new Complex();


        C4 = C4.subComp(C1, C2);
        System.out.println("Sum of complex numbers : "
                + C3.real + " + i"
                + C3.imaginary);
        if(C4.imaginary>=0) {
            System.out.println("Difference of Complex number: "
                    + C4.real +" + i "
                    +C4.imaginary );
        }
        else {
            System.out.println("Difference of Complex number: "
                    + C4.real +
                    +C4.imaginary + "i");

        }


        Complex C5 = new Complex();
        C5 = C5.mulComp(C1, C2);
        System.out.println("Multiplication of complex numbers : "
                + C5.real + " + "
                + C5.imaginary+ "i");
        Complex C6 = new Complex();
        C6 = C6.divComp(C1, C2);
        System.out.println("Division of complex numbers : "
                + C6.real + " + "
                + C6.imaginary+ "i");
    }
}