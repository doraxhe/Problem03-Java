package cd.get.ready.algorithms;

public class ArrayRotator {

    public int[] rotateLeft(int[] arr, int n){

        int mod = n % arr.length;
        int[] result = new int[arr.length];

        for (int i = 0; i < result.length; i++) {
            if (i + mod <= result.length - 1) {
                result[i] = arr[i + mod];
            } else {
                result[i] = arr[i + mod - arr.length];
            }
        }

        return result;
    }
}
