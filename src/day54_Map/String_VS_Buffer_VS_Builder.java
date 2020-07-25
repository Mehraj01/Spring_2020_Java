package day54_Map;

public class String_VS_Buffer_VS_Builder {
    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat(" School");  // "Cybertek School"

        System.out.println(str1);   // Cybertek

        System.out.println("===============================================");

        // StringBuilder: mutable version char sequences, not synchronized
        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");

        System.out.println(builder);

        System.out.println("================================================");
        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");

        System.out.println(buffer);

        System.out.println("============================================");

        String word = "ABCD";


        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(sb);

        word = sb.toString();

        System.out.println(word);






    }
}
