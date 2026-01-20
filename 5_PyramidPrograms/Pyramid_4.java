package practiceprograms1;

public class pyramid4 {

	public static void main(String[] args) {
		// Outer loop for rows
        for (int r = 5; r >= 1; r--) {

            // Prints spaces before numbers
            for (int s = 1; s <= 5 - r; s++) //Row 1 → 5–5 = 0 spaces
            {
                System.out.print("  ");
            }

            // Print 1s
            for (int c = 1; c <= r; c++) //Prints 1 r times
            {
                System.out.print("1 ");
            }

            // Next line
            System.out.println();
        }
    }
}
