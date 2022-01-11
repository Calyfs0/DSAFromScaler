A = [1, 5, 4, 3];

function MaxArea(A){
    if(A<2) return 0;
        let i = 0;
        let j = A.length -1;
        let max_area = 0;
        while(i<j){
            let curr_area = (j-i) * Math.min(A[i],A[j]);
            max_area = Math.max(curr_area,max_area);
            if(A[i] < A[j]){
                i++;
            }
            else j--;
        }

        return max_area;

}

console.log(MaxArea(A));