public class O3sorting {



static void printarray(int[]arr){
    for(int i:arr)
        System.out.print(i+" ");
}

static void swap(int[] arr,int a, int b){
    int temp= arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}

static int partition(int[]arr, int st, int end){
    int pivot=arr[st];
    int ct=0;
    for(int i=st+1;i<=end;i++)
    if(arr[i]<=pivot) ct++;
    int pivotidx=st+ct;
    swap(arr,st,pivotidx);
    int i=st,j=end;
    while(i<pivotidx&&j>pivotidx){
        while (arr[i]<=pivot) {
            i++;
        }
        while (arr[j]>pivot) {
            j--;
        }


        if(i<pivotidx&&j>pivotidx){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    return pivotidx;
}


static void quicksort(int[]arr, int st, int end){
    if(st>=end)return;
    int pi= partition(arr,st,end);
    quicksort(arr, st, pi-1);
    quicksort(arr, pi+1, end);
}

    public static void main(String[] args) {


        int []arr={2,43,2,1,432,343,65,32};
        System.out.println("Array before sort:");
        printarray(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array after sorting: ");
        printarray(arr);

    }
}
