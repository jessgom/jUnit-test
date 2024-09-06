// Jessie Gomez
/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {
	// double division
	public static double divide(double number1, double number2) {
		if(number2==0) {
		return Double.POSITIVE_INFINITY;
	}
	return number1/number2;
}
	// integer division
	public static int divide(int number1, int number2) {
		if(number2==0) {
			throw new ArithmeticException("Dividing by zero");
		}
		return number1 / number2;
	}
	// divisible possibility
	public static boolean isDivisibleBy7(int number) {
		if(number % 7 != 0) {
			return false;
		}
		return true;
	}
	//main
	public static String main(String input) {
		String result = "Overloaded main method was passed \"" + input +"\".";
		
		return result;
	}
	//min for integers
	public static int findMin(int number1, int number2, int number3) {
		return Math.min(number1, Math.min(number2, number3));
	}
	
	//min for array
	public static int findMin(int[] array) {
		int min = array[0];
		for(int value : array) {
			if(value<min) {
				min = value;
			}
		}
		return min;
	}
	// average in array
	public static double average(int[]array) {
		int sum = 0;
		for(int value:array) {
			sum+=value;
		}
		return (double) sum / array.length;
	}
	//change to lowercase
	public static void toLowerCase(String[] toLower) {
		for(int p = 0;p<toLower.length;p++) {
			
			toLower[p] = toLower[p].toLowerCase();
		}
	}
	//copy of lowercase
	public static String[] toLowerCaseCopy(String[] strings) {
		String[] result = new String[strings.length];
		for(int i = 0; i < strings.length; i++) {
			result[i] = strings[i].toLowerCase();
		}
		
		return result;
	}
	//removing extra numbers
	public static void removeDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) continue; 
            
            boolean hasDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0; 
                    hasDuplicate = true;
                }
            }
            if (hasDuplicate) {
                array[i] = 0; 
            }
        }
	}
    

	public static void main(String[] args) {
	}
}
	
		