public class FRQ2 {
  /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
  public static int transform(String str) {
      if (str.equals("orang")) {
        return 2;
      } else if (str.equals("epear")) {
        return 6;
      } else if (str.equals("bl")) {
        return 5;
      } else if (str.equals("ah")) {
        return 4;
      } else {
        return 0;
      }
  }

  /** Returns an integer based on two input strings, as described in part (a)
    *
    * Precondition: input and op are not null.
    *               The length of input is even.
    *               op is either "$$", "^^", or "##".
    */
    public static int compute(String input, String op) {
      // type your method here
      int middle = (input.length()) / 2;
        String one = input.substring(0, middle);
        String two = input.substring(middle);
        int value1 = transform(one);
        int value2 = transform(two);
        if (op.equals("$$")) {
            return value1 + value2;
        } else if (op.equals("^^")) {
            return value1 * value2;
        } else {
            return value1 - value2;
        }
    }
}