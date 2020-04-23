package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        String str="ilham";
        String reverse1=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        int lastIndex=str.length()-1;

        String reserve2="";
        for(int i=lastIndex; i>=0; i--){
            //System.out.println(str.charAt(i));
            reserve2+=str.charAt(i);
        }
        System.out.println(reserve2);
    }
}
