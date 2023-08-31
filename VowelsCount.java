class Main{  
public static void main(String args[]){  
String name="Suvojit";
char ch;
int  count =0;
//___________________________________________
for(int i=0;i<name.length();i++)
{
  ch=name.charAt(i); 
  if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
  {
      System.out.println(ch);
      count++;
       
  }
  System.out.println(ch);
}
//___________________________________________
System.out.println("the total ::"+count); 
}
    
}