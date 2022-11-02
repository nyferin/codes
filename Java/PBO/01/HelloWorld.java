// Hello world
public class HelloWorld {
    public static void main(String[] args) {
      System.out.println("Hello World!");
      TestProtected prot = new TestProtected();
      prot.number = 2;
      System.out.println(prot.number);
    }
}