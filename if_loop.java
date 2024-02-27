import java.util.Scanner;
public class if_loop
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		
		if(num % 2 == 0){
			System.out.println(num + "is even");
		}else{
			System.out.println(num + "is even");
		}
		input.close();
	}
}
		
