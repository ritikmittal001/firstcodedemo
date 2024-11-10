class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int remen=x%10;
            sum=sum*10+remen;
            x/=10;
        }
        return temp==sum;
    }
}