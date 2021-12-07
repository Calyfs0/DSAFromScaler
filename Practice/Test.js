int[] arr = new int[N+1];

for(int i=0;i<N+1;i++){
    arr[i] = i;
}

for(int j = 2;j*j<N;j++){

    if(arr[j] == j){
        for(int k = j*j;j<=N;j++){
            if(arr[k] == k){
                arr[k] = i;
            }
            
        }
    }
    
}