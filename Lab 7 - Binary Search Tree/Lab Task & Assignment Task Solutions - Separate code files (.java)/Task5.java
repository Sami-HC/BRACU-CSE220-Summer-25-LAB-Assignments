//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
      if (root.left==null || root.right==null) {
        return 0;}
      else {
        return sumsubtree(root.left, root.right);}
    }
    public static Integer sumsubtree( BSTNode root1, BSTNode root2 ){
      if (root1!=null && root2!=null) {
        return root1.elem+root2.elem+sumsubtree(root1.left, root2.right)+sumsubtree(root1.right, root2.left);}
      else {
        return 0;}
    }
    //===============================================================


}
