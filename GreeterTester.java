public class GreeterTester
{
  public static void main(String[] args)
  {
    Greeter worldGreeter = new Greeter("World");
    #some comment
    String greeting = worldGreeter.sayHello();
    System.out.println(greeting);
  }
}
