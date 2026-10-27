package ihablab3;

public class UML {

	int GCD(int a,int b) {
		
		if(a>b) {
		return	GCD(a-b,b);
		}
		if(a<b) {
			return GCD(a,b-a);
		}
	    return a;
		}
	
	int factorial(int n) {
		if(n>0) {
			return n*factorial(n-1);
		}
		
		return 1;
	}
	int fibonacci(int n){
		if(n>=2) {
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		return n;
	}
	double power(double x,int n) { 
		if(n<0) {
			return power(1/x,-n);
		}
		return 1;
	}
	int sumofdigits(int n) {
		
		if(n>10) {
			return n%10+sumofdigits(n/10);
		}
		else {
			return n;
		}
	}
	void recursivelinearsearch(int[] arr,int index,int x) {
		
		if(arr[0] != x) {
			recursivelinearsearch(arr,index+1,x);
		}
		if(arr[index]==x) {
			System.out.println(x+" is found at index "+index);
		}
		else {
			System.out.println("-1");
		}
	}
	void  BinarySearch(int[] arr, int left, int right, int x) {
	int mid=left+(right-left)/2;
	arr[mid]=x;
	if(x<arr[mid]) {
		BinarySearch(arr,left,mid-1,x);
	}
	else {
		BinarySearch(arr,mid+1,right,x);
	}
}
	boolean issorted(int[] arr,int n) {
		if(arr[n-1]<arr[n]) {
			return true;
		}
		else {
			return false;
		}
	}
	int arraysum(int[]arr , int n){
		if(n>=0) {
			return (arr[n]+arr[n-1]);
		}
		else{
		return 1;
		}
	}
	
	
	
	
}