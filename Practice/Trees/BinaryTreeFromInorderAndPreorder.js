const BinaryTreeFromInorderAndPreorder = (A,B) => {



    const Construct = (A,s,e, B, i, j) => {
        

        let index = -1;
        for(let k=i;k<=j;k++){
            if(B[k] == A[s]){
                index = k;
                break;
            }
        }
        let x = index - i;
        let root = new TreeNode(A[s]);
        root.left = Construct(A,s+1,s+x,B,i,index -1);
        root.right = Construct(A,s+x+1,e,B,index+1,j);
        return root;
    }
}