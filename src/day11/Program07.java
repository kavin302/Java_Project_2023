package day11;

public class Program07 {

	public static void main(String[] args) {
		/*
		54321
		5432
		543
		54
		5
       */
		for(int i=1;i<=5;i++)// 5 4 3 2 1
		{
		for(int j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
		}

	}

}
