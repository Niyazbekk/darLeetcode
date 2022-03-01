class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int arrSize = 1;
        while (arrSize <= arr.length) {
            for (int i = 0; i < arr.length - (arrSize - 1); i++) {
                for (int j = i; j < i + arrSize; j++) {
                    sum += arr[j];
                }
            }
            arrSize = arrSize + 2;
        }
        return sum;
    }
    }
