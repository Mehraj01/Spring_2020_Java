package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Return_DuplicateValues {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        ArrayList<String>dup=new ArrayList<>();

        for(int s=0; s<list.size()-1;s++){
            int count=0;
            for(int a=0; a<list.size()-1;a++){
                if(list.get(a)==list.get(s)){
                    count++;
                }
            }
            if(count>1){
                System.out.println(list.get(s));
                System.exit(0);
            }
        }






    }
}
