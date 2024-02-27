class Box
{
	double width,height,depth;
	void volume()
	{
	System.out.println("Volume= "+width*height*depth);
	}
}
class ClassDemo3
{
	public static void main(String args[])
	{
		Box boxobj1=new Box();
		boxobj1.width=10;
		boxobj1.height=20;
		boxobj1.depth=15;
		boxobj1.volume();
		
	}
}
