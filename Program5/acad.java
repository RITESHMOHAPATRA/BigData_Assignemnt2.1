import java.util.Scanner;
class acad
{
	public static void main(String args[]) {
		System.out.println("Enter a no : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//input
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	}
}
