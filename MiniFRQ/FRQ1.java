public class FRQ1
{
  /** Returns the String that results when letter and pattern are
    * compared, as described in part (a)
    *
    * Precondition: letter consists of one uppercase letter.
    *     pattern has at least 2 letters and all letters are uppercase
    *     and unique.
    */
    public static String letterAndPattern(String letter, String pattern) { 
    /* to be implemented in part (a) */ 
        String result = "";
        for (int i = 0; i < pattern.length() - 1; i ++) {
            if (pattern.substring(i, i + 1).equals(letter)) {
                result = pattern.substring(i, i + 1);
            }
        }
        if (result.equals("")) {
            String reversed = "";
            for (int j = pattern.length() - 1; j >= 0; j --) {
                reversed += pattern.substring(j, j + 1);
            }
            result = reversed;

        }
        return result;
    }   

  // There may be variables and methods that are not shown.
}
