package Practice_2021;

public class testets {
    public static void main(String[] args) {



        int arr[]={1,5,8,10,0,40};


        int max1=arr[0];
        int max2=arr[0];
        int max3=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(max1<arr[i]){ // 1<1 , 1<5, 5<8, 8<10, 10<0, 10<40
                max3=max2;// 1, 1, 5, 8,
                max2=max1;// // 1, 5, 8, 10
                max1=arr[i];// 5, 8, 10, 40
            }else if(max2<arr[i]){
                max3=max2;
                max2=arr[i];
            }else if(max3<arr[i]) {
                max3=arr[i];
            }
        }
        System.out.println(max1+max2+max3);


    }
}
class test3{
    public static void main(String[] args) {

        int arr[]={1,5,8,10,0,40};
        int max1=arr[0];
        int max2=arr[0];
        int max3=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(max1<arr[i]){
                max1=arr[i];
            }
            if (max2>max1 && max2>arr[i]){
                max2=arr[i];
            }
            if(max3<max1 && max3<max2 && max3>arr[i]){
                max3=arr[i];
            }



        }
        System.out.println(max1+" "+max2+" "+max3);

    }
}
