package com.bridgelabz.array_handling;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[] arr = new int[]{12,5,16,25,3,19};
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("Smallest element in array is: " + min);
}
}
