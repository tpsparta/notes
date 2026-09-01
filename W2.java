
// MCQ questions.

// How to form a class
// Unit tests via JUnit
// Assertions
// Test-first development - tests can give clues about code, a black-box documentation e.g. expected parameters
// Arrays - used a lot in loops
// Methods
// Many questions - have a look at code, what will happen? Knowledge of syntax
// Method overloading - examples
// Forming classes, constructors (public ClassName)
// Extending classes (extends…)
// Overriding methods (@Override)
// Inheritance (abstract or normal class)
// Extending interactions with constructors (super(), equals, ==)
// Memory model - if a reference type value is deleted, 
// Garbage collector will remove references in memory, and then compress memory to allow for large
// String pool
// Parameterised tests - value source, csvsource
// 4 pillars of object-oriented programming - how to define polymorphism
// Arithmetic operators: +-*/ modulus
// Abstract methods, final


// How to form a class
// Forming classes, constructors (public ClassName)

public class SampleClass {

    private String example_var;

    public SampleClass() {

        this.example_var = "Hello";

    }
    
}


// Unit tests via JUnit
// Assertions
// Parameterised tests - value source, csvsource

public class PersonTest {

    @Test
    @DisplayName("Basic test")
    public void test_1()
    {
        Assertions.assertEquals("blah", Methods.genOutput());
    }

    @ParameterizedTest
    @ValueSource(strings = {"PASS", "word", "chicken", ""})
    @DisplayName("Given any String except password, checkInput returns false")
    public void givenAnyStringExceptPassword_CheckInput_ReturnsFalse(String str)
    {
        boolean result = Methods.checkInput(str);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 2, true",
            "2, 5, false",
            "5, 5, true"
    })
    @DisplayName("Given two numbers X and Y, greaterEqual returns whether X is greater than or equal to Y")
    public void givenTwoNumbersXY_GreaterEqual_ReturnsWhetherXIsGreaterOrEqualToY(int x, int y, boolean expResult)
    {
        Assertions.assertTrue(expResult == Methods.greaterEqual(x, y));
    }

}


// Overloading: same method name and either/all of the following:
// - different parameters
// - returns subclass

class Product {
    
    // Multiplying two integer values
    public int multiply(int a, int b){
        
        int prod = a * b;
        return prod;
    }

    // Multiplying three integer values
    public int multiply(int a, int b, int c){
        
        int prod = a * b * c;
        return prod;
    }

}


// Overriding methods (@Override)
// https://docs.oracle.com/javase/tutorial/java/IandI/override.html

public class SuperClass {

    void doSomething() { return 0; }

}

public class SampleClass extends SuperClass {

    @Override
    void doSomething { return 1; }

}


// Inheritance
// Abstract class: if contains abstract methods, cannot generate objects.
// Abstract method: function signature only. 

public abstract class SuperClass {

    abstract void doSomething();

}

public class SampleClass extends SuperClass {

    abstract void doSomething() { return 1; };

}


// Extending interactions with constructors (super(), equals, ==)

Dog dog1 = new Dog("Rex", "Pug");
Dog dog2 = new Dog("Rex", "Pug");
$ jshell> dog1 == dog2;
false
$ jshell> dog1.equals(dog2);
//  Result depends on how .equals() was implemented.

public Bike(int topSpeed) {
    this.tS = topSpeed;
}

public MountainBike(int topSpeed,
                    int gearsQuant) {
    super(topSpeed);
    this.gQ = gearsQuant;
}   


// Memory model - if a reference type value is deleted.
// String Pool.

//  Reference types (objects) are stored on the heap.
//  Primitives are stored on the stack.
//  Strings are stored in the String Pool (may be reference also on heap).
//  Using 'new' may cause the same string to be stored twice within the String Pool.
//  When objects are no longer used, they can be deleted from the heap.
//  Every edit to a string may create a new string on the String Pool, as string objects are immutable.
//  '==' may compare different Strings within string pool, despite same text.
//  StringBuilder is mutable; less objects created.
//  Garbage collector removes elements from heap, then compresses heap.
//  https://www.baeldung.com/java-string-constant-pool-heap-stack


// 4 pillars of object-oriented programming - how to define polymorphism

//  Abstraction - consistent interface when interacting with object/class from outside.
//  Encapsulation - underlying methods and variables are hidden from user, allowing them to be changed, and controlling access.
//  Inheritence - classes can inherit methods and variables from 1 superclass.
//  Polymorphism - overloading (compile-time), or overriding (dynamic).
//  https://www.baeldung.com/java-oop


// Abstract methods, final

//  Final keyword has different meaning depending upon context, the theme being no further changes permitted.
//  Variables or parameters: constant.
//  Methods: no overriding.
//  Classes: no inheritance.



////////////////////////////////////////////////////////////////////////////////


// Challenges.

// How to get length of something, including string or array
// Method calls, basic stuff (at heart quite easy)
// Common methods of String.java
// Interfaces - creating, using
// Abstract classes (less interesting for the test)


// How to get length of something, including string or array
int[] arr = new int[4];
arr.length;


// Common methods of String.java
//  Note that CharSequence is an interface that is implemented by String (i.e. CharSequence parameters take Strings).
length()
charAt(int index)
equals(Object another)
equalsIgnoreCase(String another)
substring(int beginIndex)  //  Akin to str[b:].
substring(int beginIndex, int endIndex)  //  Akin to str[b:e] - exclusive of position endIndex.
contains(CharSequence s)  //  true/false.
indexOf(String str)  //  First occurence.
toLowerCase()
toUpperCase()
trim()  //  Leading and trailing whitespace removed.
replace(CharSequence target, CharSequence replacement)
split(String regex)
startsWith(String prefix)  //  true/false.
endsWith(String suffix)  //  true/false.
isEmpty() //  true if 0 length.
valueOf(Object obj)  //  Converts to string.


// Interfaces - creating, using

public interface SampleInterface {

   int sampleMethod(int x);

}

public class SampleClass implements SampleInterface {

    int sampleMethod(int x) {...};
    
}


//  Main method

public static void main(String[] args) { }
