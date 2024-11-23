public class O1sorting {

// BUBBLE SORT

static void printarray(int []arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
static void bubble(int[]arr){
    int n= arr.length;
    boolean flag= false;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
        int temp= arr[j];
        arr[j]=arr[j+1];
        arr[j+1]= temp;
        flag= true;
        }
    }
    if(flag==false)
        return;
    
        
    }
}

//  SELECTION SORT

static void selectionsort(int[]arr){
    int n= arr.length;
    for(int i=0;i<n-1;i++){
        int min_index=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_index])
            min_index=j;
        } 
        
        // swap current element and min_element
    int temp= arr[i];
    arr[i]=arr[min_index];
    arr[min_index]=temp;

    }
 
} 
// INSERTION SORT
static void insertion(int[]arr){
    int n= arr.length;
    for(int i=1;i<n;i++){
        int j=i;
        while(j>0&&arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;

        }
    }
}
static void zeroatend(int[]arr){
    boolean flag=false;
    for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]==0&&arr[j+1]!=0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;

            }
        }
      
    }  
         if(flag==true){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
        }
}
// Griven an array of string having the name of fruits 
// Sort them by the use of selection sort


static void sortstring(String[]s){
    int n= s.length;
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
           
            if(s[j].compareTo(s[min])<0){
                min=j;
            }    

        }
        String temp=s[i];
        s[i]=s[min];
        s[min]=temp;

    }
}
    public static void main(String[] args) {
        int[]arr= {7,6,5,3,2,6};
        int[]arr1= {7,0,5,0,2,6};
        String[] arr3={"Apple","mango","Bannana","Appfngjdi"};
    //    bubble(arr); 
    // selectionsort(arr);
    insertion(arr);
       for(int i:arr)
       System.out.print(i+"  ");
       zeroatend(arr1);
    sortstring(arr3);
    for(String i:arr3)
    System.out.print(i+"  ");
    }
}
