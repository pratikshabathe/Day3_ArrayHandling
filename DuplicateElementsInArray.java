package com.bridgelabz.array_handling;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,2,3,4,5,8,4,5,6};
        System.out.println("Duplicate element are: ");
        for(int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
