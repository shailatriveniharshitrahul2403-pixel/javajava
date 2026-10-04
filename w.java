public class w{
    public static void main(String[] args) {
        // ANSI escape codes for watch colors
        String RESET = "\u001B[0m";
        String SILVER = "\u001B[37m";     // Steel case/bracelet tint
        String BLUE = "\u001B[34m";       // Dark blue dial background
        String RED = "\u001B[31m";        // Dial accent colors (12, 6, 9 numbers)
        
        // Custom texture mappings representing the watch aesthetics
        String S = SILVER + "█" + RESET;  // Outer links and bezels
        String B = BLUE + "▓" + RESET;    // Watch dial core textures
        String R = RED + "▒" + RESET;     // Chronograph hands/accents
        String _ = " ";                   // Gaps

        // 6-row high multi-colored composite block font
        String[][] watchAlphabet = {
            // V (0)
            {S+B+S+"     "+S+B+S, S+B+S+"     "+S+B+S, " "+S+B+S+"   "+S+B+S+" ", "  "+S+B+S+" "+S+B+S+"  ", "   "+S+R+B+R+S+"   ", "    "+S+B+S+"    "},
            // I (1)
            {S+S+S+S+S+S+S+S+S, "   "+S+B+S+"   ", "   "+S+B+S+"   ", "   "+S+B+S+"   ", "   "+S+B+S+"   ", S+S+S+S+S+S+S+S+S},
            // J (2)
            {"   "+S+S+S+S+S+S, "      "+S+B+S, "      "+S+B+S, "      "+S+B+S, S+B+S+"   "+S+B+S, " "+S+S+S+S+S+S+S+" "},
            // A (3)
            {"   "+S+S+S+S+"   ", "  "+S+B+B+B+B+S+"  ", " "+S+B+S+"  "+S+B+S+" ", S+R+R+R+R+R+R+R+R+S, S+B+S+"    "+S+B+S, S+B+S+"    "+S+B+S},
            // Y (4)
            {S+B+S+"    "+S+B+S, " "+S+B+S+"  "+S+B+S+" ", "  "+S+B+B+B+B+S+"  ", "   "+S+S+S+S+"   ", "   "+S+B+S+"   ", "   "+S+B+S+"   "},
            // E (5)
            {S+S+S+S+S+S+S+S+S+S, " "+S+B+S+"      ", " "+S+S+S+S+S+S+S+"  ", " "+S+B+S+"      ", " "+S+B+S+"      ", S+S+S+S+S+S+S+S+S+S},
            // T (6)
            {S+S+S+S+S+S+S+S+S+S, "   "+S+S+S+S+"   ", "   "+S+B+S+"   ", "   "+S+B+S+"   ", "   "+S+B+S+"   ", "   "+S+B+S+"   "},
            // Space (7)
            {_, _, _, _, _, _},
            // P (8)
            {S+S+S+S+S+S+S+S+S+" ", " "+S+B+S+"   "+S+B+S, " "+S+S+S+S+S+S+S+S+S, " "+S+B+S+"      ", " "+S+B+S+"      ", " "+S+B+S+"      "},
            // N (9)
            {S+B+S+"    "+S+B+S, S+S+B+S+"   "+S+B+S, S+S+S+S+S+S+S+S+S+" ", S+B+S+" "+S+S+S+S+S+S, S+B+S+"  "+S+S+S+S+S, S+B+S+"    "+S+B+S},
            // D (10)
            {S+S+S+S+S+S+S+S+"  ", " "+S+B+S+"   "+S+B+S+" ", " "+S+B+S+"    "+S+B+S, " "+S+B+S+"    "+S+B+S, " "+S+B+S+"   "+S+B+S+" ", S+S+S+S+S+S+S+S+"  "}
        };

        // Execution order indices to build: V I J A Y E T A [space] P A N D E Y
        int[] nameIndices = {0, 1, 2, 3, 4, 5, 6, 3, 7, 8, 3, 9, 10, 5, 4};

        // Build the text canvas matrix horizontally
        for (int row = 0; row < 6; row++) {
            for (int index : nameIndices) {
                System.out.print(watchAlphabet[index][row] + "  ");
            }
            System.out.println();
        }
    }
}
