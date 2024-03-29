package day54_Map;

public class GarbageCollector {
    public static void main(String[] args) {

        // Object dosent have reference type then that object will be collected by GarbageCollector

        GarbageCollector obj =  new GarbageCollector(); // will not be collected by garbage collector
        new GarbageCollector(); // will be collected by garbage collector

        System.out.println("Done");



        // unreference an object:
        String str = new String("Cybertek"); // will be collected by garbage collector
        str = new String("MIT");

        System.out.println(str);


        Integer num = new Integer(123);
        num =  new Integer(124);

        //123 will be collected by garbage collector

        Double n = new Double(0.5);
        n = null;

        System.out.println(n);


        GarbageCollector obj3 = new GarbageCollector();
        //   obj3.finalize();



    }

}
