public class Main
{
public static void main(String[] args) {
String s = "A Complete List of GitHub Profile Badges and Achievements - GitHub - drknzz/GitHub-Achievements: A Complete List of GitHub Profile Badges and";
int lc=0,Uc=0,no=0,sc=0,sp=0;

for ( int i =0 ; i<s.length(); i++)
{
   char at = s.charAt(i);
   if(at >='a' && at <='z')
   {
    lc++;  
   }
   else if(at >='A' && at <='Z')
   {
    Uc++;  
   }
   else if(at >= '0' && at <= '9')
   {
    no++;  
   }
   else if(at >= '!' && at <= '/')
   {
    sc++;  
   }
   else if(at == ' ')
   {
    sp++;  
   }
   
   
   
}
System.out.println("found\n lower"+lc+"\nU="+Uc+"\nno="+no+"\nSchar="+sc+"\nSace="+(sp));
}
}