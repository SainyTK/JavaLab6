import java.io.*;

public class Test
{

	public static void main(String[] args)
	{
		Square s = new Square(3.0);
		s.calArea();
		System.out.println(s.getArea());

		Bicycle b = new Bicycle();
		System.out.println(b);
		b.changeGear(1);
		b.speedUp(20);
		System.out.println(b);
	}
}

