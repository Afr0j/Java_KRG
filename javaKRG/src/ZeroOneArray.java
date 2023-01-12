public class ZeroOneArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1};
        int i=0;
        int j= arr.length-1;
       for(int x:arr){
           System.out.print(x+" ");
       }
        System.out.print("\n");

        while(i<j){
            if(arr[i]>arr[j] ){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=arr[i];
                i += 1;
                j-=1;

            }
            else if(arr[i]>0 && arr[j]>0) {
                i += 1;
            }
            else if (arr[i]<1 && arr[j]<1)
            j-=1;
            else{
                i+=1;
                j-=1;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
