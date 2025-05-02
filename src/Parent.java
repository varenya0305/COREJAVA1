public class Parent {
    int value = 10;

    void display() {
        System.out.println("This is the display method.");
    }

    class Child extends Parent {
        String str = "java";

        void greeting() {
            System.out.println("This is the greeting method.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Parent
        Parent parent = new Parent();

        // Create an instance of the inner class Child
        Parent.Child example = parent.new Child();

        // Call methods and access fields
        example.greeting();
        example.display();

        System.out.println("String is: " + example.str);
        System.out.println("Value is: " + example.value);
    }
}
