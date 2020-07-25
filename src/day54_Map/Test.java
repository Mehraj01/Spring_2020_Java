package day54_Map;

public class Test {

    public static void main(String[] args) {

        //Red, Green, Blue
        Color myFaveColor1 = Color.Blue;
        //  Color myFaveColor2 = Color.Yellow;
        //  Color myFaveColor3 = Color.White;
        // we cant add any data type that we didnt create inside the enum

        System.out.println( myFaveColor1 );


        Browsers browseName = Browsers.Chrome; // custom. Only accepts Chrome, Firefox, Edge

        System.out.println(browseName);


    }

}
