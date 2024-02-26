import java.util.Scanner;
public class avg
{
	public static void main(String[] args)
	{
	   Scanner input=new Scanner(System.in);
	   System.out.print("Enter numbers:");
		/*double radius=input.nextDouble();
		double area=radius*radius*3.14159;*/
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		float avg=(float)((a+b+c)/3);
		System.out.println("average="+avg);
		}
}
