class Person {
    private String name;
    private int age;

    // 1. Using 'this' to refer to the current instance
    public Person(String name, int age) {
        this.name = name; 
        this.age = age; 
    }

    
    public Person(String name) {
        this(name, 0); 
    }

    // 3. Using 'this' to return the current instance
    public Person getPersonInstance() {
        return this; // Returns the current instance of the Person object
    }

    // 4. Using 'this' to pass the current instance as a parameter
    public void displayPersonDetails(Person person) {
        System.out.println("Name: " + person.name + ", Age: " + person.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane");

        // 5. Using 'this' to call a method on the current instance
        person1.displayPersonDetails(person1); // Outputs: Name: John, Age: 30
        person2.displayPersonDetails(person2.getPersonInstance()); // Outputs: Name: Jane, Age: 0
    }
}
