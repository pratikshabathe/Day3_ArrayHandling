package com.bridgelabz.array_handling;

public class LargestElement {

	public static void main(String[] args) {
		
		 int[] arr = new int[]{12,5,16,25,3,19};
	        int max = arr[0];
	        for(int i = 1; i < arr.length; i++){
	            if(arr[i] > max){
	                max = arr[i];
	            }
	        }
	        System.out.println("Largest element in array is: " + max);
	    }
	}
