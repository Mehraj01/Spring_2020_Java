package InterviewCoding_Tasks_Solutions.Map;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter_String {

    public static void main(String[] args) {


        String str="accabbcdU";
        Map<Character, Integer>unique=new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if (count==1){
                unique.put(str.charAt(i),count);
            }
        }

        System.out.println(unique);

    }


}
