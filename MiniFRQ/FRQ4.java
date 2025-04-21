public class FRQ4 {
    /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
    public static int encodeToNumber(String str) {
        if (str.equals("tree")) {
          return 80;
        } else if (str.equals("book")) {
          return 10;
        } else if (str.equals("door")) {
          return 40;
        } else if (str.equals("desk")) {
          return 50;
        } else if (str.equals("lion")) {
          return 20;
        } else {
          return 0;
        }
    }

    /** Returns an identifier string based on an input string, as described
      * in part (a)
      *
      * Precondition: input is not null.
      */
    public static String generateID(String input) {
       // type your method here 
       if (input.length() % 4 == 0) {
		int counter = 0;
		for (int i = 0; i < input.length(); i = i + 4) {
			counter += encodeToNumber(input.substring(i, i + 4));
		}
		if (counter > 100) {
			input = input + "3";
		} else {
			input = input + "X";
		}
	} else {
		input = "error";
	}
	return input;

    }
}
