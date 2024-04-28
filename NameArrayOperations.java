package week04;
public class NameArrayOperations {
    public static void main(String[] args) {
        //2. Create an array of String called "names" with the given values
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.printf("Average number of letters per name: %.2f%n", averageLetters);

        // b. Concatenate all the names together, separated by spaces
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("All names concatenated: " + concatenatedNames.toString().trim());

   
        // 3. Access the last element of any array using arrayName[arrayName.length - 1]
        String lastElement = names[names.length - 1];
        System.out.println("Last element of the array: " + lastElement);

        // 4. Access the first element of any array using arrayName[0]
        String firstElement = names[0];
        System.out.println("First element of the array: " + firstElement);
        
       //5. New array of int called nameLengths (extra 's' so names dont get confused) 
        /*Write a loop to iterate over the previously created names 
         * add the length of each name to the nameLengths array.
         */
        String[] namess = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

                // Create a new array of int called "nameLengths"
                int[] nameLengths = new int[namess.length];

                // Iterate over the names in the array and added the length of each name to nameLengths
                for (int i = 0; i < namess.length; i++) {
                    nameLengths[i] = namess[i].length();
                }

       //6.
       //Calculated the sum of all elements in nameLengths
              int sumNameLengths = 0;
                for (int length : nameLengths) {
                    sumNameLengths += length;
                }

                System.out.println("Sum of name lengths: " + sumNameLengths);
            }

    }

