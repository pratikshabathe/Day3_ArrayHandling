package com.bridgelabz.array_handling;

public class EvenPosition {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr.length; i = i + 2){
            System.out.println("Index: " + i + "," + "value: " + arr[i]);
        }
    }
}
