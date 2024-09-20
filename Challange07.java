import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Challange07{
    // Function that return maximum and minimum no from array
    static int[] maximumandminimum(int[] arr){
int max= Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
    if(arr[i]<min)
    min=arr[i];

}

int ans[]={max,min};
return ans;
    }
    public static void main(String[]args){
 
  int[]arr={10,32,353,56,565,43};
  int[]result=maximumandminimum(arr);
  System.out.print(Arrays.toString(result));
    }
}