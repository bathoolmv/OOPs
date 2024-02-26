import java.util.Scanner;
public class cirarea
{
	public static void main(String[] args)
	{
	   Scanner input=new Scanner(System.in);
	   System.out.print("Enter radius:");
		/*double radius=input.nextDouble();
		double area=radius*radius*3.14159;*/
		float radius=input.nextFloat();
		float area=(float)(radius*radius*3.14);
		System.out.println("area="+area);
		}
}
