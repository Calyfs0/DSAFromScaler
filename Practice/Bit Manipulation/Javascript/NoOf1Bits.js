module.exports = { 
    //param A : integer
    //return an integer
       numSetBits : function(A){
           if(A == 0)
               return 0
          count = 0
          while(A>1){
              
              if(Math.floor(A%2) == 1){
                  count++
              }
              
              A = A/2
          }
          if(count == 0)
           return 1
          return count
   }
   }