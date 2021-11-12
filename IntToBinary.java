import java.util.Scanner;
public class IntToBinary{
	public static void main(String[] args) {
		Scanner x= new Scanner (System.in);
		System.out.print("Enter any Integer");
		int i= x.nextInt();
		String s= Integer.toBinaryString(i);
		System.out.print("the Integer in base 2 is " +i+ " is "+s);
	}
	
}
