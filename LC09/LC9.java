
public class LC9 {
    public static void main(String args[]) {
        System.out.println(isPalindrome(121));
        // Result should be true

        System.out.println(isPalindrome(-121));
        // Result should be false

        System.out.println(isPalindrome(10));
        // Result should be false
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String myX = Integer.toString(x);
        int pointerA = 0;
        int pointerB = myX.length() - 1;

        while (pointerA < pointerB) {
            if (myX.charAt(pointerA) != myX.charAt(pointerB)) {
                return false;
            }
            pointerA++;
            pointerB--;
        }
        return true;
    }
}
