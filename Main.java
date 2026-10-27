package ihablab3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		UML u=new UML();
		System.out.println(u.GCD(3,6));
		System.out.println(u.factorial(4));
        System.out.println(u.fibonacci(6));
        System.out.println(u.power(2.5, 6));
        System.out.println(u.sumofdigits(123));
        System.out.println();
        System.out.println("Enter the size of the array: ");
        int n = c.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	System.out.println("Enter element "+(i+1)+" of the aray: ");
        	arr[i]=c.nextInt();
        }
        System.out.println("Enter the element of search: ");
        int x=c.nextInt();
        u.recursivelinearsearch(arr, n, x);
        u.BinarySearch(arr, x, n, x);
        u.issorted(arr, n);
        u.arraysum(arr, n);
       
	}

}
