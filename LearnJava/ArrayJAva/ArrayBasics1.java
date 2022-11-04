public class ArrayBasics1 {
    
    static void findMin(int a[]){

            int min=a[0];
          //  int minarraySorted[]= new int[a.length];
            for(int i=0; i<a.length;i++){

                if(min>a[i]) // we have to find the index at where the element must less than the 0th element
                {
                    min=a[i];
                }
              //  minarraySorted[i]=min;
            }
            System.out.println(min +" this is the min no in array");

            // for(int i:minarraySorted){
            //     System.out.print(" "+i);
            // }

    }
    public static void main(String[] args) {
        int arr[]={45,23,24,10,22,44,7};

        ArrayBasics1.findMin(arr);
    }
}
