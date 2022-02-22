function KthSmallestElementInBst(A,B){
    let output = [];
    InorderTraversal(A);
    return output[B-1];
    function InorderTraversal(A){
        if (A == null) return;

        InorderTraversal(A.left);
        output.push(A.data);
        InorderTraversal(A.right);
    }
}