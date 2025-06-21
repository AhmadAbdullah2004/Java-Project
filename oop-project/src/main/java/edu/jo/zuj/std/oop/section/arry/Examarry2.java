package edu.std.oop.session.project.arry;




public class Examarry2 {
    public static void main(String[] args) {
 
       int arr[]={5,5,8,9,4};
       int sum =0;
       int avg=0;
   
       for(int i=0;i<arr.length;i++)
       {
          
            sum=sum+arr[i];
            avg=sum/arr.length;
       }
        
       System.out.println("sum of array ="+ sum);
        System.out.println("avg="+avg);

    }
}
           
        
    
    

