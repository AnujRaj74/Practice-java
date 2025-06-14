import java.util.Scanner;
public class Search
{
    public static boolean stairCaseSearch(int matrix[][] , int key)
    {
        int row=0,col=matrix[0].length-1;

        while(row < matrix.length && col >= 0 )
        {
            {
                if(matrix[row][col]== key)
                {
                    System.out.println(" found key at ("+ row +","+ col+") index .");
                    return true;
                }
                else if(key <matrix[row][col])
                {
                    col--;
                }
                else
                {
                    row++;
                }

            }

        }
      
        System.out.println("Key not found !");
        return false;

    }
      public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. of rows :");
        int n=s.nextInt();
        System.out.print("enter no. of columns :");
        int m=s.nextInt();
        System.out.print("Element to be searched : ");
        int key =s.nextInt();
        int matrix[][]=new int[n][m];
       

        System.out.println("Enter element in sorted order :");
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
        
        
        stairCaseSearch(matrix,key);
        
    }
    
}
