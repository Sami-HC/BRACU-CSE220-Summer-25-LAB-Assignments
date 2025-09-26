//Assignment Task 02: Row Rotation Policy
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
  
  
  //
  //
  //
  //--Assignment-Task-02----------------------------------------
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){
      
      int row = matrix.length;
      int col = matrix[0].length;
      Integer num = -1;
      
      for (int i = 1; i<examWeek; i++) {
      
        for(int c = 0; c<col; c++) {
          String first = "";
          for(int r = (row-1); r>-1; r--) {
          
            if (r==(row-1)) {
              first = matrix[r][c];}
          
            else if (r==0) {
              matrix[r+1][c] = matrix[r][c];
              matrix[r][c] = first;}
          
            else {
              matrix[r+1][c] = matrix[r][c];}}}}
      
        for(int r = 0; r<row; r++) {
          System.out.print("| ");
          for(int c = 0; c<col; c++) {
            
            if (matrix[r][c]=="AA") {
              num = r+1;}
            
            if (matrix[r][c].length()==2) {
              System.out.print(matrix[r][c]+" | ");}
            
            else {
              System.out.print(matrix[r][c]+"  | ");}}
          
            System.out.println("");}
        return num;}

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}