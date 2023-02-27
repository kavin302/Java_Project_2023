package day12;

public class Program05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		for(int i=1;i<=15;i++)
		{
			
			System.out.println(x);
			int z=x+y;
			x=y;
			y=z;
		}

	}

}
