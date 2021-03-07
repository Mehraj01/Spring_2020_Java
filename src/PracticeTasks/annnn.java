package PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class annnn {

    public static void main(String[] args) {

        String arr[] = {"zzzz","doce", "code","aaa", "ecod","bbbb", "famer","frame", "aba", "baa" };
        ArrayList<String> ff=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                char c[]=arr[i].toCharArray();
                char []cc=arr[j].toCharArray();
                Arrays.sort(c);
                Arrays.sort(cc);
                String e=Arrays.toString(c);
                String ww=Arrays.toString(cc);
                if(e.equals(ww)&&!ff.contains(arr[i])){
                   System.out.println(e);
                    ff.add(arr[i]);
                }
                break;
            }
        }
        System.out.println(ff);


    }
}
