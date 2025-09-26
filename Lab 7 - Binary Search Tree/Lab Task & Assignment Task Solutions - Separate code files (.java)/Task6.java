//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        int count = counttree(root);
        int check = checkBST(root);
        if (count==check){
          return true;}
        else {
          return false;}
    }
    public static int counttree( BSTNode root ){
      if (root!=null) {
        return 1+counttree(root.left)+counttree(root.right);}
      else {
        return 0;}
    }
    public static int checkBST( BSTNode root ){
      if (root!=null) {
        if (root.right!=null && root.elem>=root.right.elem) {
          return 0;}
        else if (root.left!=null && root.elem<=root.left.elem) {
          return 0;}
        else {
          return 1+checkBST(root.right)+checkBST(root.left);}}
      else {
        return 0;}
    }
    //===============================================================


}
