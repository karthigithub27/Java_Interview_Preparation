public class StringRotation {

    public static void main(String[] args) {
        String str = "codedecode";
        int n = 3;

        String left = stringLeftRotation(str,n);
        String right = stringRightRotation(str,n);

        System.out.println("Left Rotate: "+left);
        System.out.println("Right Rotate: "+right);
    }

    private static String stringRightRotation(String str, int n) {
        return str.substring(str.length() - n,str.length()) + str.substring(0,str.length()-n);
    }

    private static String stringLeftRotation(String str, int n) {
        return str.substring(n) + str.substring(0,n);
    }
}
