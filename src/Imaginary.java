public class Imaginary
{
    public static void main(String[] args)
    {
        Complex one = new Complex();
        Complex two = new Complex(2,3);
        Complex three = new Complex();
        Complex four = new Complex();
        Complex five = new Complex();

        one.real = 6;
        one.imaginary =10;

        one.display();
        two.display();

        three.add(one,two);
        three.display();

        four.sub(one,two);
        four.display();

        five.mul(one,two);
        five.display();

    }
}

class Complex
{
    int real;
    int imaginary;

    Complex(int x,int y)
    {
        real = x;
        imaginary = y;
    }

    Complex()
    {
        real =0;
        imaginary = 0;
    }

    void display()
    {
        System.out.println(real+"+ i*"+imaginary);
    }

    void add(Complex obj1,Complex obj2)
    {
        real = obj1.real+obj2.real;
        imaginary = obj1.imaginary+obj2.imaginary;
    }

    void sub(Complex obj1,Complex obj2)
    {
        real = obj1.real-obj2.real;
        imaginary = obj1.imaginary-obj2.imaginary;
    }

    void mul(Complex obj1,Complex obj2)
    {
        real = obj1.real*obj1.real - obj1.imaginary*obj1.imaginary;
        imaginary = obj1.imaginary*obj2.real+obj1.real* obj2.imaginary;
    }

}