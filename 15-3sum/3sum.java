class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i =0 ;i< n - 2;i++){
            
            int j = i+1;
            int k = n - 1;
            while(j<k){
                int s = nums[i] + nums[j] + nums[k];

                if(s > 0){
                    k--;
                }
                else if(s<0){
                    j++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }
        }

        return new ArrayList<>(res);
    }
}