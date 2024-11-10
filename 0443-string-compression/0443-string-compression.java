class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            char current=chars[i];
            int count=0;
            //count the ocurence of the current character
            while(i<chars.length&&chars[i]==current){
                i++;
                count++;
            }
            //write the character to the char array
            chars[index++]=current;

            //if count contains more than 1 write each digit of the count
            if(count>1){
                String countstr=Integer.toString(count);
                for(char c:countstr.toCharArray()){
                    chars[index++]=c;
                }
            }
        }
        //return the new length
        return index;
    }
}