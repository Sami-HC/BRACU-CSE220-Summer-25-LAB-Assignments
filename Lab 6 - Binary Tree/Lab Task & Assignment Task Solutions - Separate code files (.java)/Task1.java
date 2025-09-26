//LAB TASK NO NEED TO SUBMIT
// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror( BTNode root ){
        BTNode rtnew = null;
        if (root != null) {
            rtnew = new BTNode (root.elem);
            rtnew.right = convertMirror(root.left);
            rtnew.left = convertMirror(root.right);}
        return rtnew;
    }
    //==================================================

}
