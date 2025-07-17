import java.util.Scanner;
public class DiagonalSum
{
     public static int digSum(int matrix [][])
    {
       int sum =0;
       for( int i=0;i<matrix.length;i++)
       {
        for (int j = 0; j < matrix[0].length; j++) 
        {
            // PRIMARY DIAGONAL SUM
            if(i==j)
            {
                sum += matrix[i][j];
            }
            if(i+j==matrix.length-1)
            {
                sum += matrix[i][j];
            }
        }
       }

       return sum;
    }
    
    public static void main(String a[])
    {
       
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. of rows :");
        int n=s.nextInt();
        System.out.print("enter no. of c columns :");
        int m=s.nextInt();
        int matrix[][]=new int[n][m];

        System.out.println("Enter element:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=s.nextInt();
            }
        }

       System.out.println("Display Matrix :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
        
        
        int result=digSum(matrix);
        System.out.println("Sum of all diagonal elements  :"+result);

        
    }
    
}
