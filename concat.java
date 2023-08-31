class Main {
  public static void main(String[] args) {

    // createing a string
    String first = "Java";
    System.out.println("First String: " + first);

    // create second
    String second = "Programming";
    System.out.println("Second String: " + second);

    // join two strings with concat function 
    String joinedString = first.concat(second);
    System.out.println("Joined String with concat : " + joinedString);
    // join two strings with + operator 
    System.out.println(first+second);
    System.out.println("Joined String with (+) operator: " + joinedString);
  }
}