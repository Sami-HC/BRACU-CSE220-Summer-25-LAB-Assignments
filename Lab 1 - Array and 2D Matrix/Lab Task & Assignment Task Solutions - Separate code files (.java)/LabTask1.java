//Lab Task 01: Merge Sorted Array
class LabTask1{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){
      
      Integer [] arrS;
      Integer[] arrL;
      
      if (arr1.length>arr2.length) {
        arrS = arr2;
        arrL = arr1;}
      
      else {
        arrS = arr1;
        arrL = arr2;}
      
      int s = arrS.length;
      int l = arrL.length;
      Integer[] arrN = new Integer [s+l];
      int b = 0;
      int c = 0;
      
      for ( int i = 0; i<s; i++) {
        if (b == l) {
          arrN [c] = arrS [i];
          c = c+1;}
        else if (arrS[i] > arrL[b]) {
          while (arrS[i] > arrL[b]) {
            arrN [c] = arrL[b];
            c = c+1;
            b = b+1;}
          arrN [c] = arrS [i];
          c = c+1;}
        else if (arrS[i] < arrL[b] || arrS[i] == arrL[b]) {
          arrN [c] = arrS [i];
          c = c+1;}}
      if (b<l) {
        for (int i = b; i<l; i++) {
          arrN [c] = arrL [i];
          c = c+1;}}
      

        //TO DO
        //DELETE the following return statement when you're ready to return the newly Created array
        return arrN;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
