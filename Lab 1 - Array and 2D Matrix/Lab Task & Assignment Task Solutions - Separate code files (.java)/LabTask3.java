//Lab Task 03: Decryption Process
class LabTask3{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
      int row = matrix.length;
      int col = matrix[0].length;
      
      Integer [] arr = new Integer [col];
      Integer [] farr = new Integer [col-1];
      
      for (int c = 0; c<col; c++) {
        int a = 0;
        for (int r = 0; r<row; r++) {
          a = a + matrix[r][c];}
        arr [c] = a;}
      
      for (int i = 1; i<arr.length; i++) {
        farr [i-1] = arr[i] - arr[i-1];}

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]

        //TO DO
        //DELETE the following return statement when you're ready to return the 2D array
        return farr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}