public class RevarseNumber {
   public static void main(String[] args) {

    int num = 1234;
    int reversed = 0;

    System.out.println("Original Number: " + num);

    // Convert the number to a string to determine the length
    String numString = Integer.toString(num);
    int length = numString.length();

    // Iterate through each digit using a for loop
    for (int i = length - 1; i >= 0; i--) {
      // Get the digit at the current position
      int digit = numString.charAt(i) - '0';
      reversed = reversed * 10 + digit;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
