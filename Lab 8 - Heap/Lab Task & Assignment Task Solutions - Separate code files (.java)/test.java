public class test {
  
  public static int[] task3 (int [] arr, int m) {
    MinHeap marr = new MinHeap (m);
    for (int i = 0; i<arr.length; i++) {
      if (i<m) {
        marr.insert(arr[i]);}
      else {
        marr.insert( marr.extractMin() + arr[i] );}}
      return marr.getheap();
  }
  
  public static int[] task4 (int [] arr, int k) {
    MaxHeap karr = new MaxHeap (arr.length);
    for (int i = 0; i<arr.length; i++) {
      karr.insert(arr[i]);}
    int [] output = new int [k];
    for (int i = 0; i<output.length; i++) {
      output[i] = karr.extractMax();}
    return output;
  }
}