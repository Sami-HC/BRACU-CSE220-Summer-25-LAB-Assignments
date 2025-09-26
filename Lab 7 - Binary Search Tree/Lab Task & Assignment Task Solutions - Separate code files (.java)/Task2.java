//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        String t = "" + findPathString(root, key, "");
        if (t.equals("")) {
          return "No Path Found";}
        else {
          return t;}
    }
    public static String findPathString( BSTNode root, Integer key, String s ){
      if (root != null && root.elem == key) {
        return s+root.elem;}
      else if (root != null) {
        if (key>root.elem) {
          return findPathString(root.right, key, (s+root.elem+" "));}
        else {
          return findPathString(root.left, key, (s+root.elem+" "));}}
      return "";}
    //============================================================================

}
