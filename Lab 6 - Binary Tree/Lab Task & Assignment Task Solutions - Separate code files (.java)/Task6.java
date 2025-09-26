// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return findlevelsum (root, 0);
    }
    public static Integer findlevelsum(BTNode root, int level){
      if (root != null) {
        if (level%2 == 0) {
          return -(int)root.elem + findlevelsum(root.left, level+1) + findlevelsum(root.right, level+1);}
        else {
          return (int)root.elem + findlevelsum(root.left, level+1) + findlevelsum(root.right, level+1);}}
      return 0;}
    //============================================================================

}
