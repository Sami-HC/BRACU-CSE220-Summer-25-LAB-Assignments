//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    
  //
  //
  //
  //--Assignment-Task-01----------------------------------------
  public static void mostWater( Integer[] height ){
      
      int l = height.length;
      int maxm = 0;
      
      for (int i = 0; i<l; i++) {
        for (int j = 0; j<l; j++) {
          int dis = 0;
          int lower = 0;
          
          if (i==j) {
            continue;}
          else if (i>j) {
            dis = i-j;}
          else if (j>i) {
            dis = j-i;}
          
          if (height[i]>height[j]) {
            lower = height[j];}
          else {
            lower = height[i];}
          
          int mul = lower * dis;
          if (mul>maxm) {
            maxm = mul;}}}
      
      System.out.println(maxm);}

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
 System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
