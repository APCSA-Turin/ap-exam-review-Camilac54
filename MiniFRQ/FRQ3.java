public class FRQ3 {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
    public static int countRepeat(String largeStr, String smallStr) {
         // type your method here
        int counter = 0;
        for (int i = 0; i + smallStr.length() <= largeStr.length(); i ++) {
            if (largeStr.substring(i, i + smallStr.length()).equals(smallStr)) {
                counter ++;
                i = i + smallStr.length() - 1;
            }
        }
        return counter;
    }
}  