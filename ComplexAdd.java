import java.util.Scanner;
class Complex
{
	int r,i;
	Complex(int real,int img)
	{
		r=real;
		i=img;
	}
	void display()
	{
		System.out.println(r+"+"+i+"i");
	}
}
public class ComplexAdd
{
	static void add(Complex first,Complex second)
	{
		int real=first.r+second.r;
		int img=first.i+second.i;
		System.out.println("After addition="+real+"+"+img+"i");
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of first complex number:");
        int real1 = scanner.nextInt();
        System.out.println("Enter the imaginary part of first complex number:");
        int img1 = scanner.nextInt();

        System.out.println("Enter the real part of second complex number:");
        int real2 = scanner.nextInt();
        System.out.println("Enter the imaginary part of second complex number:");
        int img2 = scanner.nextInt();

        Complex first = new Complex(real1, img1);
        Complex second = new Complex(real2, img2);

        System.out.println("Complex numbers are:");
        first.display();
        second.display();

        add(first, second);

        scanner.close();
    }
}
