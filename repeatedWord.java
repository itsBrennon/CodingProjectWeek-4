package week04;

public class repeatedWord {
		    public static void main(String[] args) {
	//7. String, word, and an int, n, as arguments to return the word concatenated to itself n number of times
		        String repeatedWord = repeatWord("Hello", 3);
		        System.out.println("Repeated word: " + repeatedWord);

	//8. Two Strings first + last = fullName 
		        String fullName = createFullName("Tragedy", "GOAT");
		        System.out.println("Full name: " + fullName);
		        
	//9. Method takes array and returns true	        
		        int[] intArray = {20, 30, 60};
		        boolean isSumGreaterThan100 = isSumGreaterThan100(intArray);
		        System.out.println("Is sum greater than 100? " + isSumGreaterThan100);
		        
   //10. An array of double, Method prints out the avg of all elements in array
		        double[] doubleArray = {1.5, 2.0, 3.5, 4.0};
		        double average = calculateAverage(doubleArray);
		        System.out.println("Average of elements in the array: " + average);
		        
  //11. Method takes two arrays of double and return true if avg of elements in 1st array > the avg of the 2nd arrays element 
		        double[] array1 = {1.5, 2.0, 3.5};
		        double[] array2 = {2.0, 3.0, 4.0};
		        boolean isFirstArrayAverageGreater = compareAverages(array1, array2);
		        System.out.println("Is average of array1 greater than array2? " + isFirstArrayAverageGreater);
		        }
		    
 
	
			// Customized Method to repeat a word n times
		    public static String repeatWord(String word, int n) {
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < n; i++) {
		            result.append(word);
		        }
		        return result.toString();
		    }

		    // Customized Method used to create full name
		    public static String createFullName(String firstName, String lastName) {
		        return firstName + " " + lastName;
		    }

		    // Custom Method checks sum of ints in an array is greater than 100
		    public static boolean isSumGreaterThan100(int[] arr) {
		        int sum = 0;
		        for (int num : arr) {
		            sum += num;
		        }
		        return sum > 100;
		    }

		    // Custom Method calculates average of elements in a double array
		    public static double calculateAverage(double[] arr) {
		        double sum = 0;
		        for (double num : arr) {
		            sum += num;
		        }
		        return sum / arr.length;
		    }

		    // Method compares averages of two double arrays
		    public static boolean compareAverages(double[] arr1, double[] arr2) {
		        double avg1 = calculateAverage(arr1);
		        double avg2 = calculateAverage(arr2);
		        return avg1 > avg2;
		    }

	}

