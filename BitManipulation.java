class BitManipulation {
    // Method to clear the ith bit of a number
    public static int clearBit(int number, int i) {
        // Create a mask with 1 at the ith position
        int mask = 1 << i;
        // Invert the mask to have 0 at the ith position
        mask = ~mask;
        // Apply the mask to the number
        return number & mask;
    }

    public static void main(String[] args) {
        int number = 13; // Example number (1111 in binary)
        int i = 2;       // Bit position to clear (0-based index)

        // Clear the ith bit
        int result = clearBit(number, i);

        // Print the result
        System.out.println("Original number: " + number);  // Output: 15
        System.out.println("Number after clearing the " + i + "-th bit: " + result);  // Output: 11 (1011 in binary)
    }
}