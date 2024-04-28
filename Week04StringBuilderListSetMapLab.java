//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		        //1. Create an array of int called "ages" with the given values
		        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

		        // a. Subtract the first element from the last element
		        int resultA = ages[ages.length - 1] - ages[0];
		        System.out.println("Result of subtraction (last - first): " + resultA);

		        // b. Create a new array "ages2" with 9 elements
		        int[] ages2 = new int[9];
		        // Initialize the first 8 elements with the same values as in "ages"
		        for (int i = 0; i < ages.length; i++) {
		            ages2[i] = ages[i];
		        }
		        // Additional element added to "ages2"
		        ages2[8] = 100;

		        // Repeat the subtraction from Step 1.a. for ages2
		        int resultB = ages2[ages2.length - 1] - ages2[0];
		        System.out.println("Result of subtraction for ages2 (last - first): " + resultB);

		        // c. Calculate the average age using a loop
		        int totalAge = 0;
		        for (int age : ages2) {
		            totalAge += age;
		        }
		        double averageAge = (double) totalAge / ages2.length;
		        System.out.printf("Average age: %.2f%n", averageAge);
		    }
		}

	

	
