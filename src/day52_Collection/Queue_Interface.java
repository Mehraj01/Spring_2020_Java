package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

/*
==> Iterable(I): root interface. super-type of all interfaces in collections framework.
     ==> Collection (I): ==> extended by by List(I), Set(I), Queue(I)

           Queue(I) >> class ==> PriorityQueue
           Queue(I) >> interface ==> DeQueue --> class ArrayDequeue


Queue(I): does not have index numbers, size is dynamic, accepts duplicates, First in first out order

					Poll(): removes the first object in the queue.

 */

public class Queue_Interface {
    public static void main(String[] args) {


        // does not have index numbers, size is dynamic, accepts duplicates
        // First in first out order
        java.util.Queue<String> q = new PriorityQueue<>(); // FIFO
        q.add("D");
        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q);

        //Poll(): removes the first object in the queue.
        String str =  q.poll(); //A
        System.out.println(str );

        System.out.println(q);

        //System.out.println(q.get(0));



    }
}
