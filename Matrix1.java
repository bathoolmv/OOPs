import java.util.Scanner;
class Matrix
{
	int m,n,i,j;
	int [][]a=new int[5][5];
	int [][]b=new int[5][5];
	int [][]c=new int[5][5];
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the no of rows: ");
		m=sc.nextInt();
		System.out.println("Enter the no of coloumns: ");
		n=sc.nextInt();
		System.out.println("Enter the elements of matrix");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Enter the elements of second matrix");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				b[i][j]=sc.nextInt();
	}
	void add()
	{
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
	}
	void display()
	{
		System.out.println("Matrix A");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("Matrix B");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Matrix c");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	}
}
public class Matrix1
{
	public static void main(String args[])
	{
		Matrix ob=new Matrix();
		ob.get();
		ob.add();
		ob.display();
	}
}
