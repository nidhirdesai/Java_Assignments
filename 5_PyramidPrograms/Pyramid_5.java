package practiceprograms1;

public class pyramid5 {

	public static void main(String[] args) {
		  // Loop for rows
        for (int r = 1; r <= 5; r++) {

            // Prints number r times
            for (int c = 1; c <= r; c++) 
            {
                System.out.print(r + " "); //r = 3 → print 3 three times
            }

            // Move to next line
            System.out.println();
        }
    }
}
