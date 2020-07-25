package day43_MethodOverriding;


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class methodOverloading{

    public void method(){

    }

    public int method(int a){
        return 10;

    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class Test{

    public void method(){ // overriding the method  1
        System.out.println("Hello");
    }
}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class MethodOverriding extends Test{

    // Method overriding is has to happen in sub class !!!!!
    // Method overriding same method name same parameter, and same return type
    // Method Overriding method access modifier has to be same or more visible
    // ( public, portered ) works with all overriding but if u use differed access modifier it has to be same
    //@Override => Is method overridden or not
    // has to be visible to sub class
    // Only instance method can be overridden

    @Override
    public void method(){ // overriding the method  // 2
        System.out.println("World");
    }

    public static void main(String[] args) {
        // method() ==> same method but doing the different functions
        Test obj1=new Test();
        obj1.method();// Hello

        MethodOverriding obj2=new MethodOverriding();
        obj2.method();// World



    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<