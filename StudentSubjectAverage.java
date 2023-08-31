import java.util.Scanner;

class Main{
    
    public static void main(String args[]){
        
       
       Scanner sc=new Scanner(System.in);
      
       
      System.out.println("Enter no of students : ");    
        int students=sc.nextInt(); ; //enter student and subject nos
      System.out.println("Enter no of subjects : ");  
      int sujects =sc.nextInt();
      int twoD[][]=new int[students][sujects];
        
          
        for(int i=0; i<students;i++)
         {    System.out.println("studen no "+i+" 5 suject no::");       
            for(int j=0; j<sujects;j++)
            {   System.out.print("suject no"+j+"value="); 
                twoD[i][j]=sc.nextInt();
            }
         }
        
        for(int i=0; i<students;i++)
         {     
            for(int j=0; j<sujects;j++)
            {
                System.out.print(" "+twoD[i][j]); 
            }
            System.out.println(); 
         }
        
        
        
         int sum=0;
         //--------------------------------------------
         for(int i=0; i<sujects;i++)  /* the student and suject interchanged to prevent arry index out of bound */
         {         
            for(int j=0; j<students;j++)
            {  
               sum += twoD[j][i];
             }
               System.out.println("Subject no :"+i+" sum ="+sum);
               System.out.println("Average of subject="+(sum/students));
               sum=0;
   }
  sc.close(); // close the object optional 
}
}