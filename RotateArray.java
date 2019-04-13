/**
Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
How many different ways do you know to solve this problem?
**/

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
          /** 
            In the approach 1 swapping last element to last but one element and doing three(k steps) iterations.
            for example
                 Step 1:                 Step 2                Step 3
(Given Number)  1 2 3 4 5 6 7          7 1 2 3 4 5 6        6 7 1 2 3 4 5 
                1 2 3 4 5 7 6          7 1 2 3 4 6 5        6 7 1 2 3 5 4
                1 2 3 4 7 5 6          7 1 2 3 6 4 5        6 7 1 2 5 3 4
                1 2 3 7 4 5 6          7 1 2 6 3 4 5        6 7 1 5 2 3 4
                1 2 7 3 4 5 6          7 1 6 2 3 4 5        6 7 5 1 2 3 4
                1 7 2 3 4 5 6          7 6 1 2 3 4 5        6 5 7 1 2 3 4
                7 1 2 3 4 5 6          6 7 1 2 3 4 5        5 6 7 1 2 3 4
          **/
          approach1();
        
    }
    
    private static void approach1(){
        System.out.println("Enter numbers for array....");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("Enter steps to to rotate array....");
        int steps = Integer.parseInt(br.readLine());
        String[] values = str.split("\\s");
        int valueInt[] = new int[values.length];
        for(int i=0; i<values.length;i++){
            valueInt[i] = Integer.parseInt(values[i]);
        }
        int j=0;
        while(j<steps){
            for(int i=0;i<valueInt.length-1;i++){
                int temp = valueInt[valueInt.length-1-i];
                valueInt[valueInt.length-1-i] = valueInt[valueInt.length-2-i];
                valueInt[valueInt.length-2-i] = temp;
            }
            j++;
        }
        System.out.println("After " +steps +" to rotate array....");
        for(int i: valueInt){
            System.out.print(i+" ");
        }
        
    }
}
