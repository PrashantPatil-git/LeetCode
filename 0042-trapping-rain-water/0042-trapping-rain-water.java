class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int totalwater=0;
        int max=0;
        int maxIndex=0;

        for(int i=0;i<n;i++){
            if(height[i] > max){
                max=height[i];
                maxIndex=i;
            }
        }

      
        int leftMax=0;
        for(int i=0;i<maxIndex;i++){
            leftMax=Math.max(leftMax,height[i]);
            int water=Math.min(leftMax,max)-height[i]; // min(left,max)-current height
            totalwater+=water;

        }

        leftMax=0;
        for(int i=n-1;i>maxIndex;i--){
            leftMax=Math.max(leftMax,height[i]);
            int water=Math.min(leftMax,max)-height[i];
            totalwater+=water;
        }

        return totalwater;
    }
}