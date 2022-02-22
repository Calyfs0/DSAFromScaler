function DistanceBetweenNodesInBST(A,B,C){
    if(B>C){
        swap(B,C);

        function FindDistance(current_node){
            if(current_node == null) return 0;

            if(current_node.data > B && current_node.data > C){
                return FindDistance(A.left);
            }
            if(current_node.data < B && current_node.data < C){
                return FindDistance(A.right);
            }

            if(current_node.data >= B && current_node.data <= C){
                return CalculateDistanceFromLCA(current_node,B) + CalculateDistanceFromLCA(current_node,C);
            }
        }

        function CalculateDistanceFromLCA(current_node,num){
            if(current_node.data == num) return 0;
            if(current_node.data > num){
                return 1 + CalculateDistanceFromLCA(current_node.left,num);
            }
            else{
                return 1 + CalculateDistanceFromLCA(current_node.right,num);
            }

        }

        function swap(B,C){
            let temp = B;
            B = C;
            C = temp;
        }
    }

}