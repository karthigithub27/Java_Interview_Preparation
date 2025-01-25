public class CheckForRotation {

    public static void main(String[] args) {
        String original = "code";
        String rotated = "odec";

        boolean isRotated = checkIfStringIsRotated(original, rotated);

        System.out.println("String is rotated: "+ isRotated);

    }

    private static boolean checkIfStringIsRotated(String original, String rotated) {

        String bind = original+original;

        if(bind.contains(rotated)){
            return true;
        }

        return false;
    }
}
