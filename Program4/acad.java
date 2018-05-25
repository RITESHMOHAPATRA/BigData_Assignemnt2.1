import java.util.Scanner;
class acad
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 nos");
        //Input
        int min = scan.nextInt();
        int max = scan.nextInt();
		if(min>max){
			int t = min;;
                        min = max;
                        max = t;
		}
		System.out.println("Odd Numbers: ");
		for(int i=min;i<=max;i++){
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("Even Numbers: ");
		for(int i=min;i<=max;i++){
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
    }
}
