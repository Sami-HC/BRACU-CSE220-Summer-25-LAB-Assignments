public class undirected_graph_unweighted {
  
  public static int[][] getadjmat () {
    int [][] adjmat = directed_graph_unweighted.getadjmat();
    for (int r = 0; r<10; r++) {
      for (int c = 0; c<10; c++) {
        if (adjmat[r][c]!=0) {
          adjmat[c][r] = adjmat[r][c];}}}
    return adjmat;}
  
  public static edge[] getadjlist () {
    
    int [][] adjmat = undirected_graph_unweighted.getadjmat();
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