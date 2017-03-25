/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
            if(root != null) {
            return checkBST_rec(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
            }
            return false;
            }

            boolean checkBST_rec(Node root, int max, int min) {

            boolean result = true;
            if(root != null) {
            //System.out.println(root.data);
            if(root.data >= max || root.data <= min) {
            result = false;
            } else {
            result = root.left != null ? checkBST_rec(root.left, root.data, min) : true;
            if(!result) {
            return false;
            }
            result = root.right != null ? checkBST_rec(root.right, max, root.data) : true;
            //System.out.println(max + " " + min + " " +result);
            }
            }
            return result;
            }
