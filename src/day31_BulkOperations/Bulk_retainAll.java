package day31_BulkOperations;
import java.util.ArrayList;
import java.util.Arrays;
public class Bulk_retainAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(1,2,3,4,5,6,1,2,3) );
        // only keep 1,2,3

        list.retainAll( Arrays.asList(1,2,3) );
        //{4,5,6}, {1,2,3, 1,2,3}

        System.out.println(list);
    }
}
