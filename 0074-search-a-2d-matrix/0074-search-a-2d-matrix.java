class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //check null
        if(matrix==null||matrix.length==0 ||matrix[0].length==0){
            return false;
        }
        int row=matrix.length;
        int cols=matrix[0].length;
        //Binary search
        int left=0;
        int right=row*cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            //convert 1d to 2d 
            int midvalue=matrix[mid/cols][mid%cols];

            //compare the target
            if(midvalue==target){
                return true;
            }
            else if(midvalue<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        } 
        return false;
    }
}