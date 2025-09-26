public class undirected_graph_weighted {
  
  public static int[][] getadjmat () {
    int [][] adjmat = new int [10][10];
    
    adjmat[0][1] = 1;
    adjmat[0][2] = 2;
    
    adjmat[1][2] = 3;
    adjmat[1][3] = 4;
    
    adjmat[2][3] = 5;
    adjmat[2][4] = 6;
    
    adjmat[3][4] = 7;
    adjmat[3][5] = 8;
    
    adjmat[4][5] = 9;
    adjmat[4][6] = 1;
    
    adjmat[5][6] = 2;
    adjmat[5][7] = 3;
    
    adjmat[6][7] = 4;
    adjmat[6][8] = 5;
    adjmat[6][9] = 6;
    
    adjmat[7][8] = 7;
    adjmat[7][9] = 8;
    
    for (int r = 0; r<10; r++) {
      for (int c = 0; c<10; c++) {
        if (adjmat[r][c]!=0) {
          adjmat[c][r] = adjmat[r][c];}}}
    
    return adjmat;}
  
  public static edge[] getadjlist () {
    
    int [][] adjmat = undirected_graph_weighted.getadjmat();
    edge [] adjlist = new edge [10];
    
    for (int r = 0; r<10; r++) {
      for (int c = 0; c<10; c++) {
        if (adjmat[r][c]!=0) {
          if (adjlist[r]==null) {
            adjlist[r] = new edge (c);
            adjlist[r].weight = adjmat[r][c];}
          else {
            edge temp = adjlist[r];
            while (temp.next!=null) {
              temp = temp.next;}
            temp.next = new edge (c);
            temp.next.weight = adjmat[r][c];}}}}
    
    return adjlist;}
}