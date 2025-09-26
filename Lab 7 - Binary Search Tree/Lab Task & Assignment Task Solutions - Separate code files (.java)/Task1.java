//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
      if (! (findroot(root, x) && findroot(root, y)) ) {
        return null;}
      else if ( findinpath(root, x, y) ) {
          return y;}
      else if ( findinpath(root, y, x) ) {
          return x;}
        else {
          return matchpath(root, x, y);}
    }
    public static boolean findroot( BSTNode root, int x){
      if (root!=null) {
        if (root.elem == x) {
        return true;}
        if (x>root.elem) {
          return findroot(root.right, x);}
        else if (x<root.elem) {
          return findroot(root.left, x);}
        else {
          return false;}}
      return false;
    }
    public static boolean findinpath( BSTNode root, Integer x, Integer y ){
      if (root.elem == y) {
        return true;}
      else if (root.elem == x) {
        return false;}
      else if (root != null) {
        if (x>root.elem) {
          return findinpath(root.right, x, y);}
        else if (x>root.elem){
          return findinpath(root.left, x, y);}
        else {
          return false;}}
      return false;
    }
    public static Integer matchpath ( BSTNode root, Integer x, Integer y ){
      if (root.left!=null && checkxy(root.left, x, y)) {
        return matchpath(root.left, x, y);}
      else if (root.right!=null && checkxy(root.right, x, y)) {
        return matchpath(root.right, x, y);}
      else {
        return root.elem;}
    }
    public static boolean checkxy( BSTNode root, Integer x, Integer y ){
      return findroot(root, x) && findroot(root, y);
    }
    //==================================================

}
