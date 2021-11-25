A = [0, 1, 0, 2]

Max_left_array = [A[0]]
Max_right_array = []
Max_right_array[A.length-1] = A[A.length-1]
Total_water = 0
for(i=1;i<A.length;i++){
Max_left_array[i] = Math.max(A[i],Max_left_array[i-1])
}

for(i=A.length-2;i>=0;i--){
Max_right_array[i] = Math.max(A[i],Max_right_array[i+1])
}

for(i=0;i<A.length;i++){
Total_water += Math.min(Max_left_array[i],Max_right_array[i]) - A[i]
}

console.log(Total_water)