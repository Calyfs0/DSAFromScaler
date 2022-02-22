function LeastCommonAncestor(A,B,C){
    if(A == null) return false;

    let leftNode = LeastCommonAncestor(A.left,B,C);
    let rightNode = LeastCommonAncestor(A.right,B,C);


    // if both nodes are found
    if(leftNode && rightNode){
        ans = A.data;
    }

    //if one value is current node and the other is coming either from left or right
    if((leftNode || rightNode) && (A.data == B || A.data == C)){
        ans = A.data;
    }

    //if both values are same and found
    if(A.data == B && A.data == C){
        ans = A.data;
    }

    //if either is found return true
    if(A.data == B || A.data == C) return true;

    return leftNode || rightNode;
}