import java.util.ArrayList;
import java.util.*;

public class MultiAl {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
/*
 * 2D ArrayList 
 * 
 * ArrayList<Integer> list = new ArrayList<>();
 * this will take an Integer type value
 * 
 * But if we do like this
 * 
 * ArrayList<ArrayList<Interger>> list = new ArrayList<>();
 * this will take an ArrayList Of Integer Type as Input Only
 */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialsation
        for(int i=0; i<2 ; i++) // Outer arrayList Size
        {
            list.add(new ArrayList<>());

        }

        // Add Elements
        for(int i=0; i<list.size() ;i++) // row
        {
            for ( int j=0 ; j<3; j++) // j<3 for size of inner ArrayList
            {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);

    }
}
