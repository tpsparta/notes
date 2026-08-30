// MCQ
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
// Abstract methods - final


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

public class PersonTest {

    @ParameterizedTest
    @DisplayName("Test")
    public void test_1(String str)
    {
        Assertions.assertEquals("blah", str);
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


// Memory model - if a reference type value is deleted, 
