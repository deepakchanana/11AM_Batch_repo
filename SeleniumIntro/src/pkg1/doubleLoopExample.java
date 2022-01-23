package pkg1;

public class doubleLoopExample 
{
 public static void main(String[] args)
 {
   for(int i=1;i<=6;i++)  // outer loop for rows
   {
	for(int j=1;j<=i;j++) // inner loop for columns
	{
		System.out.print("*"); // 2 star in same line
	}
	System.out.println(); // will move cursor to the next liine
   }
 }
}
