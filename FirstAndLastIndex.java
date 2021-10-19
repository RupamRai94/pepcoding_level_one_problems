//LeetCode 34
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = initialIndex(nums, target);
        result[1] = finalIndex(nums, target);
        return result;
    }
    
    private int initialIndex(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int initialIndex = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(target > nums[mid]){
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                initialIndex = mid;
                high = mid - 1;
            }
        }
        return initialIndex;
    }
        
                    
    private int finalIndex(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int finalIndex = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(target > nums[mid]){
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                finalIndex = mid;
                low = mid + 1;
            }
        }
        return finalIndex;
    }
}