public class directed_graph_unweighted {
  
  public static int[][] getadjmat () {
    int [][] adjmat = new int [10][10];
    
    adjmat[0][1] = 1;
    adjmat[0][2] = 1;
    
    adjmat[1][2] = 1;
    adjmat[1][3] = 1;
    
    adjmat[2][3] = 1;
    adjmat[2][4] = 1;
    
    adjmat[3][4] = 1;
    adjmat[3][5] = 1;
    
    adjmat[4][5] = 1;
    adjmat[4][6] = 1;
    
    adjmat[5][6] = 1;
    adjmat[5][7] = 1;
    
    adjmat[6][7] = 1;
    adjmat[6][8] = 1;
    adjmat[6][9] = 1;
    
    adjmat[7][8] = 1;
    adjmat[7][9] = 1;
    
    return adjmat;}
  
  public static edge[] getadjlist () {
    
    int [][] adjmat = directed_graph_unweighted.getadjmat();
    edge [] adjlist = new edge [10];
    
    for (int r = 0; r<10; r++) {
      for (int c = 0; c<10; c++) {
        if (adjmat[r][c]!=0) {
          if (adjlist[r]==null) {
            adjlist[r] = new edge (c);}
          else {
            edge temp = adjlist[r];
            while (temp.next!=null) {
              temp = temp.next;}
            temp.next = new edge (c);}}}}
    
    return adjlist;}
}