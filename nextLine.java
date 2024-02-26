import java.util.Scanner;
public class nextLine
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter name:");
		String na=input.nextLine();
		System.out.print("Enter age:");
		int age=input.nextInt();
		System.out.println("Name:"+na+"\nAge:"+age);
	}
}
