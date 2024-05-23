class Stringbuffer {
  static void case1()
  {
    String s1="hello";
    String s2="hello";
    if(s1==s2)
    {
      System.out.println("equal"+" s1="+s1.hashCode()+" s2="+s2.hashCode());
    }
    else
    {
      System.out.println("not equal");
    }
  }
  static void case2()
  {
    String s1="hello";
    String s2=new String("hello");
    if(s1==s2)
    {
      System.out.println("equal"+"s1="+s1.hashCode()+"s2="+s2.hashCode());
    }
    else
    {
      System.out.println("not equal");
    }
  }
  static void case3()
  {
    String s1="hello";
    String s2=new String("hello");
    if(s1.equals(s2))
    {
      System.out.println("equal"+" s1="+s1.hashCode()+" s2="+s2.hashCode());
    }
    else
    {
      System.out.println("not equal");
    }
  }
  static void case4()
  {
    String s1="hello";
    if(s1.equals("hello"))
    {
      System.out.println("equal "+" s1="+s1.hashCode()+" hello "+"hello".hashCode());
    }
    else
    {
      System.out.println("not equal");
    }
  }
  public static void main(String[] args) {
    case4();
  

  }
}
