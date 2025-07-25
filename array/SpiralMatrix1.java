import java.util.Scanner;
public class SpiralMatrix1
{

     public static  void printSpiral(int matrix[][])
    {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol)
        {
            // top
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.print(matrix[startRow][j]+"  ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            if(startRow<endRow)
            {
                for(int j=endCol-1;j>=startCol;j--)
                {
                    System.out.print(matrix[endRow][j]+" ");
                }
            }    
            //left
            if (startCol<endCol) 
            {

                 for(int i=endRow-1;i>=startRow+1;i--)
                 {

                    System.out.print(matrix[i][startCol]+" ");
                 }
             }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        System.out.println();
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
        

        System.out.println("Spiral Elements :");
        printSpiral(matrix);
    }
}
    

