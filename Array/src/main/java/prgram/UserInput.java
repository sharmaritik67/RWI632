package prgram;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
	
		int arr[]=new int[5];
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int first=arr[0];
		int second=arr[1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first=arr[i];
			}else if(arr[i]>second&&arr[i]!=first) {
				second =arr[i];
			}
		}
		System.out.println("the second largest elemnt: +second");
	}

}
