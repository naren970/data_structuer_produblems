class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] a = new int[length];
        int s = k;
        int j=0;
        if(k ==0){
            for(int i=0; i< nums.length; i++){
                nums[i] = nums[i];
            } 
        }else if(length == 2){
           
            int t = nums[0];
            nums[0] = nums[1];
            nums[1] = t;
        }
        else if(k>length ){
            nums[0] = nums[0]; 
            for(int i=0, n= length; i< length/2;i++, n--){
                int t = a[i];
                a[i] = a[n];
                a[n] = t;
            }
        }else if(k < length){
            for(int i = (length)-k; i<length; i++){
                a[j] = nums[i];
                j++;
            }
        
            for(int i=0; i < length-s; i++){
                a[j] = nums[i];
                j++;
            }
            for(int i =0; i< length; i++){
                nums[i] = a[i];
            }
            
        }
    }
}
