import java.util.HashMap;
import java.util.Map;

/*  https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
*/
public class CountingDuplicates {

  public static int duplicateCount(String text) {
    Map<Character, Integer> map = new HashMap<>();
    //for each char,
    //put 0 first time,
    //put 1 if more.
    for (int i = 0; i < text.length(); i++) {
      char c = Character.toLowerCase(text.charAt(i));
      if (map.containsKey(c) && map.get(c) == 0) {
        map.put(c, 1);
      } else if (!map.containsKey(c)) {
        map.put(c, 0);
      }
    }

    int res = 0;
    for (Character c : map.keySet()) {
      res += map.get(c);
    }

    return res;
  }
}
