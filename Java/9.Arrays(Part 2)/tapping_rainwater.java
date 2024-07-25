public class tapping_rainwater {
 public static int trappedRainWater(int height[]) {
  int n=height.length;
  // max left bound
  int max_left[]=new int[n];
  max_left[0]=height[0];
  for(int i=1;i<n;i++){
   max_left[i]=Math.max(height[i], max_left[i-1]);
  }
  // max Right bound
  int max_right[]=new int[n];
  max_right[n-1]=height[n-1];
  for(int i=n-2;i>=0;i--){
   max_right[i]=Math.max(height[i], max_right[i+1]);
  }
  // loop
  int trappedwater=0;
  for(int i=0;i<n;i++){
   // calculate waterlevel : min(max left,max right)
   int waterlevel=Math.min(max_left[i], max_right[i]);
   // calculate trapped water : waterlevel-height[i] 
   trappedwater+=waterlevel-height[i];
  }
  return trappedwater;
 }
 public static void main(String[] args) {
  int height[]={4,2,0,3,2,5};
  System.out.println(trappedRainWater(height));
 }
}
