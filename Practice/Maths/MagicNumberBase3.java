public void MagicNumber() {
    int[] A = {2,1,2};


    int l = A.length/2;
    int first =0;
    int count1 = 0;
    for(int i=0;i<A.length;i++) {
        if(count1 == 0) {
            first = A[i];
            count1++;
        }
        else if(first == A[i]) {
            count1++;
        }

        else{
            count1--;
        }

    }

    count1 =0;
    for(int i=0;i<A.length;i++) {
        if(A[i] == first) count1++;
    }
    if(count1 > l) System.out.println(first);
}