public class MaxSum {

    
   // public static void maxsSumSubofArray(int number[]){
       // int currSum=0;
       // int maxSum=Integer.MIN_VALUE;

      /*  #####################   general methgod   ######################
        for (int i = 0; i < number.length; i++) {
            int start=i;
            for (int j = i; j < number.length; j++) {
                int end=j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum +=number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum =currSum;
                }  
            }  
        }
        System.out.println("max Sum  : "+maxSum);
    }

         ######################  PREFIX METHOD  #####################
        
            int preFix[]=new int[number.length];
            preFix[0]=number[0];
            for(int i=1;i<preFix.length;i++){
                preFix[i]=preFix[i-1]+number[i];
            }

            for (int i = 0; i < number.length; i++) {
            int start=i;
                for (int j = i; j < number.length; j++) {
                    int end=j;
                    currSum= start==0?preFix[end]:preFix[end]-preFix[start-1];

                    if(maxSum<currSum){
                        maxSum=currSum;
                    }
                 }  
            }  
        
        System.out.println("max Sum  : "+maxSum);
    }
      
    */

        public static void kadanes(int number[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;
            for (int i = 0; i < number.length; i++) {
                cs +=number[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);   
            }
            System.out.println("max Sum :  "+ms);

        }



    public static void main(String[] args) {
       int number[]={-2,-3,4,-1,-2,1,5,-3};
       //maxsSumSubofArray(number);
       kadanes(number);
    }
}
