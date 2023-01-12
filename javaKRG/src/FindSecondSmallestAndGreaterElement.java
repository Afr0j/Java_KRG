public class FindSecondSmallestAndGreaterElement {
    public static void main(String[] args) {
        int arr[]={14,3,12,44,22,55,29,42};

        int Min=Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;


        int SecondMin=Integer.MAX_VALUE;
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){

            if(arr[i]>Max){
                Max=arr[i];
            }

            if(arr[i]<Min){
                Min=arr[i];
            }
        }

//        int arr[]={14,3,12,44,22,55,29,42};

        for(int i=0; i<arr.length;i++){
            int p=arr[i];
            if(Max>SecondMax){
                SecondMax=arr[i];
            }

            if(SecondMin>Min){
                SecondMin=arr[i];
            }
        }
        System.out.println(Max+" "+Min);
        System.out.println(SecondMax+" "+SecondMin);

        int a=0;int b=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                a=arr[i];
            }
        }
//        System.out.println(a);

    }
}
