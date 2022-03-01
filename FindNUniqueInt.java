class Solution {
    public int[] sumZero(int n) {
        int[] q = new int[n];
        for(int i =1;i<n;i+=2){
            q[i-1]=-i;
            q[i]=i;
        }
        if(n % 2 == 1){
            q[n-1] = 0;
        }

        return q;
    }
}
