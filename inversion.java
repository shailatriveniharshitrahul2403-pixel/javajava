import java.util.Scanner;

class inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print the very first star of the row without any spaces
            System.out.print("*");
            
            // Inner loop prints the remaining stars, placing the space BEFORE the star
            for (int j = 2; j <= i; j++) {
                System.out.print(" *");
            }
            
            // Move to the next row (no trailing space at the end)
            System.out.println();
        }
       
        sc.close();
    }
}
