function RecoverBinarySearchTree(A){
        let curr = A;
        let prev = null;
        let first_val = null;
        let second_val = null;
        while(curr!=null){
            if(!curr.left){
                if(prev!= null && prev.data > curr.data){
                    if(first_val == null) first_val = prev.data;
                    second_val = curr.data;
                }
                prev = curr;
                curr = curr.right;
            }
    
            else{
                let rightPredecessor = curr.left;
                while(rightPredecessor.right!= null && rightPredecessor.right!=curr){
                    rightPredecessor = rightPredecessor.right;
                }
    
                if(rightPredecessor.right == null){
                    rightPredecessor.right = curr;
                    curr = curr.left;
                }
                else{
                    rightPredecessor.right = null;
                    if(prev.data > curr.data){
                        if(first_val == null) first_val = prev.data;
                        second_val = curr.data;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
        }
        

        return [second_val,first_val];

}