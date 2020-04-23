package SELF_PRACTICE.Replit_Practice;

public class Replit156_MethodsReturn {

    public static void main(String[] args) {
        String []names={"a","foo","bar","foo","bla","foo","foo" };
        String word="foo";

        int countWords=count_appearance( names, word);
        System.out.println(countWords);
    }

    public static int  count_appearance(String[] arr, String t)
    {

        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase(t)){
                arr[i]=arr[i].replaceFirst(t, "");
                count++;
            }
        }
        return count;

    }
}
