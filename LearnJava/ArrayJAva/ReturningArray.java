class ReturningArray{



    static int[] getArray(){
        return new int[]{3,54,5,3,53};
    }
    public static void main(String[] args) {
        int b[]=getArray();

        //traversing
        for(int i:b){
            System.out.println(i);
        }

        // for(int i=0; i<=b.length;i++) this 
       // {
        //     System.out.println(b[i]);
        // }
    }

}