public class Greeter
{
  #some comment
  public Greeter(String aName)
  {
    name = aName;
  }

  public String sayHello()
  {
    return "Hello, " + name + "!";
  }

  private String name;
}
