//LAB TASK NO NEED TO SUBMIT
// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            return findsum(root, 0);
        }
        
         public static Integer findsum( BTNode root, int lvl){
          int sum = 0;
            if (root != null) {
              if (lvl==0) {
                sum += (int)root.elem;}
              else {
                sum += (int)root.elem%lvl;}
              sum += findsum(root.left, lvl+1);
              sum += findsum(root.right, lvl+1);
              return sum;}
            return sum;
        }
        //============================================================================

}
