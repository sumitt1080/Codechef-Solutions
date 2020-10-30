import java.util.Scanner;
public class s
{

public static void main(String[] args)
{

     Scanner k=new Scanner(System.in);
     System.out.println("Enter the length of the Array:");
     int n=k.nextInt();
     int[] array=new int[n];
     int i,j,c=0;
     System.out.println("Enter elements in the Array:-");
     for(i=0;i<n;i++)
        array[i]=k.nextInt();
     
     while(n!=1)
     {
        j=0;
        for(i=0;i<n;i+=2)
        {
           
           if(i==n-1)
           array[j]=array[i];
           else {
     array[j]=Math.max(array[i],array[i+1]);c++;}
            j++;
        }
        
   
       n=j;
     }
     System.out.println("Last array is:");
     for(i=0;i<n;i++)
        System.out.println(array[i]);
     System.out.println("Comparisons"+c);
     }
}