public class task {
  
  public static void task0a (int [][] adjmat, String [] vertex) {
    System.out.print("   ");
    for (int i = 0; i<adjmat.length; i++) {
      System.out.print(" "+vertex[i]+" ");}
    System.out.println();
    for (int r = 0; r<adjmat.length; r++) {
      System.out.print(" "+vertex[r]+" ");
      for (int c = 0; c<adjmat.length; c++) {
        System.out.print(" "+adjmat[r][c]+" ");}
      System.out.println();}}
  
  public static void task0b (edge [] adjlist, String [] vertex) {
    for (int i = 0; i<adjlist.length; i++) {
      System.out.print(vertex[i]+"-->");
      edge temp = adjlist[i];
      while (temp!=null) {
        System.out.print(vertex[temp.to]+"("+temp.weight+")"+"-->");
        temp = temp.next;}
      System.out.println("null");}}
  
  public static int task1a (int [][] adjmat) {
    int maxdegree = 0;
    for (int r = 0; r<adjmat.length; r++) {
      int count = 0;
      for (int c = 0; c<adjmat.length; c++) {
        if (adjmat[r][c]!=0) {
          count++;}}
      if (count > maxdegree) {
        maxdegree = count;}}
    return maxdegree;}
  
  public static int task1b (edge [] adjlist) {
    int maxdegree = 0;
    for (int i = 0; i<adjlist.length; i++) {
      int count = 0;
      edge temp = adjlist[i];
      while (temp!=null) {
        count++;
        temp = temp.next;}
      if (count > maxdegree) {
        maxdegree = count;}}
    return maxdegree;}
  
  public static void task2a (int [][] adjmat, String [] vertex) {
    int maxweight = 0;
    int maxvertex = -1;
    for (int r = 0; r<adjmat.length; r++) {
      int totalweight = 0;
      for (int c = 0; c<adjmat.length; c++) {
        if (adjmat[r][c]!=0) {
          totalweight += adjmat[r][c];}}
      if (totalweight > maxweight) {
        maxweight = totalweight;
        maxvertex = r;}}
    System.out.println("Vertex whose sum of edge weights is maximum: "+ vertex[maxvertex] +" (Sum: "+maxweight+")");}
  
  public static void task2b (edge [] adjlist, String [] vertex) {
    int maxweight = 0;
    int maxvertex = -1;
    for (int i = 0; i<adjlist.length; i++) {
      int totalweight = 0;
      edge temp = adjlist[i];
      while (temp!=null) {
        totalweight += temp.weight;
        temp = temp.next;}
      if (totalweight > maxweight) {
        maxweight = totalweight;
        maxvertex = i;}}
    System.out.println("Vertex whose sum of edge weights is maximum: "+ vertex[maxvertex] +" (Sum: "+maxweight+")");}
  
  public static int task3a1 (int [][] adjmat) {
    int maxdegree = 0;
    for (int r = 0; r<adjmat.length; r++) {
      int count = 0;
      for (int c = 0; c<adjmat.length; c++) {
        if (adjmat[r][c]!=0) {
          count++;}}
      if (count > maxdegree) {
        maxdegree = count;}}
    return maxdegree;}
  
  public static void task3a2 (int [][] adjmat, String [] vertex) {
    int maxweight = 0;
    int maxvertex = -1;
    for (int r = 0; r<adjmat.length; r++) {
      int totalweight = 0;
      for (int c = 0; c<adjmat.length; c++) {
        if (adjmat[r][c]!=0) {
          totalweight += adjmat[r][c];}}
      if (totalweight > maxweight) {
        maxweight = totalweight;
        maxvertex = r;}}
    System.out.println("Vertex whose sum of edge weights is maximum: "+ vertex[maxvertex] +" (Sum: "+maxweight+")");}
  
  public static int task3b1 (edge [] adjlist) {
    int maxdegree = 0;
    for (int i = 0; i<adjlist.length; i++) {
      int count = 0;
      edge temp = adjlist[i];
      while (temp!=null) {
        count++;
        temp = temp.next;}
      if (count > maxdegree) {
        maxdegree = count;}}
    return maxdegree;}
  
  public static void task3b2 (edge [] adjlist, String [] vertex) {
    int maxweight = 0;
    int maxvertex = -1;
    for (int i = 0; i<adjlist.length; i++) {
      int totalweight = 0;
      edge temp = adjlist[i];
      while (temp!=null) {
        totalweight += temp.weight;
        temp = temp.next;}
      if (totalweight > maxweight) {
        maxweight = totalweight;
        maxvertex = i;}}
    System.out.println("Vertex whose sum of edge weights is maximum: "+ vertex[maxvertex] +" (Sum: "+maxweight+")");}
  
  public static int[][] task4a (int [][] adjmat) {
    for (int r = 0; r<adjmat.length; r++) {
      for (int c = 0; c<adjmat.length; c++) {
        if (adjmat[r][c]!=0) {
          adjmat[c][r] = adjmat[r][c];}}}
    return adjmat;}
  
  public static edge[] task4b (edge [] adjlist) {
    for (int i = adjlist.length-1; i>=0; i--) {
      edge temp = adjlist[i];
      while (temp!=null) {
        if (adjlist[temp.to]==null) {
          adjlist[temp.to] = new edge (i);
          adjlist[temp.to].weight = temp.weight;}
        else {
          edge temp2 = adjlist[temp.to];
          while (temp2.next!=null) {
            temp2 = temp2.next;}
          temp2.next = new edge (i);
          temp2.next.weight = temp.weight;}
        temp = temp.next;}}
    return adjlist;}
}