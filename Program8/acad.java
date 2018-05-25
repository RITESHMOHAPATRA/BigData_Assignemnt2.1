import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class acad
{
    public static void main(String args[])  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of elemnts in the array");
        int n = scan.nextInt();
        System.out.println("Enter elements");
        Integer a[] = new Integer[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());//Inbuilt function used to sort array in decreasing order
        System.out.println("After sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
