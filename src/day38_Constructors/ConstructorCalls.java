package day38_Constructors;

/*
Rules:
1. only constructor can call another constructor
2. In order to call a constructor in another constructor ==> MUST use this() keyword (this() is used to call constructors)
    this(): can only be used in a constructor calling another constructor (DO NOT USE NAME OF CONSTRUCTOR)
3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
5. A Constructor can NOT call ITSELF. If it calls itself ==> Compiler error
6. A Constructor can NOT contain itself ==> Meaning if a constructor called another, the latter can not call the first (because of rule 5)
 */

public class ConstructorCalls {

    public ConstructorCalls(){// constructor can call other methods
        //constructor only can constructor

    }

    public ConstructorCalls(int a){// constructor method overloading
        //to call constructor method inside other constructor method we use this() key word
       //ConstructorCalls();
        this();
    }

    public  static void method1(){// static method only accepts static method
       // method2(); we cant call void method inside the static method
    }

    public void method2(){ // void method can call static method
        method1();
    }

}
