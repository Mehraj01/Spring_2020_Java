package day37_Constructors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsObject {

    public static void main(String[] args) {
        Student student1 = new Student("Marina", 34, 'F', "Cybertek");

        //student1.setInfo("Marina", 34, 'F', "Cybertek");

        System.out.println( student1 );
        Student student2 = new Student("Alla",35,'M',"Harvard");
        Student student3 = new Student("Alla",35,'M',"Harvard");

        System.out.println(student2);


        // Sorting objects that we created
        List<Student>list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list, Comparator.comparing(Student::toString));
        list.sort(Comparator.comparing(Student::toString));
        System.out.println(list);

    }
}
