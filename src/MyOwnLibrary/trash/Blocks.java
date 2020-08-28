package MyOwnLibrary.trash;

/*

-> regular imports:
      syntax:
        import PackageName.ClassName;  // imports one class from package
        import PackageName.*;  // imports all classes from the package

-> static imports: we can import static variables or methods
      syntax:
        import static PackageName.className.name;  // only imports one static from the class
        import static PackageName.className.*; // imports all static variables and methods from the class

========================================================================================================================

-> two initializer blocks in java:

        -> static initializer block: gets executed as soon as class is loaded, only once
                - designed for initializing static variables
                                static {
                                        statement;
                                }

        -> instance initializer block: belongs to the object, execution depends on the object
                - It will be executed when we object of the class will be created
                - It will be created inside of the class. When we created object of the class in main
                  method then instance block will be executed
                - It is execution depends of the object. If we create 2 object it will run twice
                - designed for initializing instance variables
                                {
                                     statements;
                                }



-> STATIC BLOCK vs INSTANCE BLOCK vs CONSTRUCTOR:
            static block: executed first, one time only, does not depend on the object
            instance block: depends on the object, runs before the constructor
            constructor: depends on the object, runs after the instance block



========================================================================================================================







 */