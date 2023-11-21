class AA
{
   public void methodAA()
   {
      System.out.println("method of Class A");
   }
}
class B extends AA
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C extends AA
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends AA
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
class JavaExample
{
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     //All classes can access the method of class A
     obj1.methodAA();
     obj2.methodAA();
     obj3.methodAA();
  }
}