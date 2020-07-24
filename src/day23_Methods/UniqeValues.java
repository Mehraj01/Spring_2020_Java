package day23_Methods;

public class UniqeValues {
    public static void main(String[] args) {
        /*
        1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */

        String[]arr={ "A", "B", "A","C"};



        for(int k=0; k<arr.length; k++ ){
            int count1=0;
            for(int i=0; i<arr.length;i++){
                if(arr[i].equals(arr[k])){
                    count1++;
                }
            }
            if(count1==1){
                //System.out.print(count1);
                System.out.print(arr[k]);

            }


        }




        System.out.println("============================================================");

// Solution 2:
        for(String each2: arr){ //4 times will be executed

            int count=0;
            for(String each: arr){
                if(each.equals(each2)){
                    count++;
                }
            }

            if(count==1){// if the character is unique
                System.out.println(each2+count);
                //System.out.println(count);

            }
        }






    }
}
