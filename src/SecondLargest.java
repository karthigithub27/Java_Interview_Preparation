
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,9,45,99,99};

        int secondLargest = findSecondLargest(arr);

        System.out.println("Second Largest: "+ secondLargest);
        }

    private static int findSecondLargest(int[] arr) {

        if(arr.length<=1){
            System.out.println("Invalid Array: The array does not have second largest element");
    }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num: arr){
            if(num>largest){
                second = largest;//update second largest
                largest = num; //update largest

            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return second;
}
}