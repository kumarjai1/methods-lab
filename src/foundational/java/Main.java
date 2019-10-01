package foundational.java;


public class Main {

    public static void main(String[] args) {
        System.out.println(maxOfTwoNumbers(4,1));
        System.out.println(maxOfThree(5, 8, 7));
        System.out.println(isCharacterAVowel('e'));
        System.out.println(numberOfArgs("test", "tested", "check", "what"));
        System.out.println(reverseString("testing"));
    }

    public static float maxOfTwoNumbers(float a, float b) {
        if (a > b) {
            return  a;
        } else {
            return b;
        }
    }

    public static float maxOfThree(float a, float b, float c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b> c) {
            return b;
        } else {
            return c;
        }
    }

    public static boolean isCharacterAVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static int numberOfArgs(String...args) {
        return args.length;
    }

    public static java.lang.String reverseString(String str) {
        StringBuilder sb = new StringBuilder((CharSequence) str);
        return sb.reverse().toString();
    }
}
