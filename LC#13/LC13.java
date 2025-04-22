
import java.util.HashMap;


public class LC13 {
    public static void main(String args[]) {
        System.out.println(romanToInt("III"));
        // Result should be 3

        System.out.println(romanToInt("LVIII"));
        // Result should be 58

        System.out.println(romanToInt("MCMXCIV"));
        // Result should be 1994
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>();
        myHashMap.put('I', 1);
        myHashMap.put('V', 5);
        myHashMap.put('X', 10);
        myHashMap.put('L', 50);
        myHashMap.put('C', 100);
        myHashMap.put('D', 500);
        myHashMap.put('M', 1000);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 >= s.length()) {
                result = result + myHashMap.get(s.charAt(i));
            } else {
                switch (s.charAt(i)) {
                    case 'I' -> {
                        if (s.charAt(i + 1) == 'V') {
                            result = result - myHashMap.get(s.charAt(i));
                            continue;
                        }
                        if (s.charAt(i + 1) == 'X') {
                            result = result - myHashMap.get(s.charAt(i));
                            continue;
                        }
                        result = result + myHashMap.get(s.charAt(i));
                    }

                    case 'X' -> {
                        if (s.charAt(i + 1) == 'L') {
                            result = result - myHashMap.get(s.charAt(i));
                            continue;
                        }
                        if (s.charAt(i + 1) == 'C') {
                            result = result - myHashMap.get(s.charAt(i));
                            continue;
                        }
                        result = result + myHashMap.get(s.charAt(i));
                    }

                    case 'C' -> {
                        if (s.charAt(i + 1) == 'D') {
                            result = result - myHashMap.get(s.charAt(i));
                            continue;
                        }
                        if (s.charAt(i + 1) == 'M') {
                            result = result - myHashMap.get(s.charAt(i));
                            continue;
                        }
                        result = result + myHashMap.get(s.charAt(i));
                    }
                    default -> {
                        result = result + myHashMap.get(s.charAt(i));
                    }

                }

            }
        }

        return result;
    }
}
