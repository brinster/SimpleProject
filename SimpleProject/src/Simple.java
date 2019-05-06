import java.util.Scanner;

public class Simple {

	public static void main(String[] args) 
	{
		System.out.println("Please type your name.");
		Scanner scan = new Scanner( System.in );
		String name = scan.next();
		String rev = "";
		for( int i = name.length(); i > 0; i-- )
		{
			rev = rev + name.charAt( i );
		}
		System.out.println( rev );
		
	}

}
