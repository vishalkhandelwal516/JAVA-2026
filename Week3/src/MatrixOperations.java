import java.util.*;
public class MatrixOperations {
    
    static int[] rowSums(int[][] matrix)
    {
        int sum[]= new int[matrix.length];
        int rowSum=0;
        for (int i=0; i<matrix.length; i++)
        {   
            rowSum = 0;
            for (int j=0;j<matrix[i].length;j++)
            {
                rowSum = rowSum + matrix[i][j];
            }
            sum[i] = rowSum;
        }
        return sum;
    }


    static int[] columnSums(int[][] matrix)
    {   
        int columnSum=0; 
        int sum[]= new int[matrix[0].length];
        for (int j=0; j<matrix[0].length; j++)
        {
            columnSum=0;
            for (int i=0; i<matrix.length; i++)
            {
                columnSum = columnSum + matrix[i][j];
            }
            sum[j]=columnSum;
        }
        return sum;
    }


    static int[][] add(int[][] first, int[][] second)
    {
        // returns null if dimension are not same
        if (first.length != second.length || first[0].length != second[0].length)
        {
            System.out.println("Matrix dimensions doesn't match!");
            return null;
        }

        int resultant[][]= new int[first.length][first[0].length];
        for (int i=0; i<first.length; i++)
        {
            for (int j=0; j<first[0].length; j++)
            {
                resultant[i][j] = first[i][j] + second[i][j];
            }
        }
        return resultant;
    }


    static int[][] transpose(int[][] matrix)
    {
        int temp[][]= new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                temp[j][i]=matrix[i][j];
            }
        }
        return temp;
    }
    static int[][] multiply(int[][] first, int[][] second, int m, int n, int p)
    {
        // (m x n) & (n x p) = (m x p) is the resultant matrix.
        int[][] c = new int[m][p];
        for (int k=0; k<m; k++)
        { 
            for (int i=0; i<p; i++)
            {
                int sum=0;
                for (int j=0; j<n; j++)
                {
                    sum+=first[k][j] * second[j][i];
                }
                c[k][i] = sum;

            }
        }
        return c;
    }

    static Scanner ob = new Scanner(System.in);
    static void input(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter [" + i + "][" + j + "] Element: ");
                matrix[i][j] = ob.nextInt();
            }
        }
    }
    
    static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int m,n,p;
        System.out.print("Enter rows for A: ");
        m = ob.nextInt();
        System.out.print("Enter columns for A: ");
        n = ob.nextInt();
        System.out.print("Enter columns for B: ");
        p = ob.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        System.out.println("==== Enter Matrix A ====");
        input(A, m, n);
        System.out.println("==== Enter Matrix B ====");
        input(B, n, p);

        System.out.println("==== Displaying Matrix A ====");
        printMatrix(A);
        System.out.println("==== Displaying Matrix B ====");
        printMatrix(B);

        System.out.println("==== Row Sums(for A) ====");
        int[] rs = rowSums(A);
        for (int i = 0; i < rs.length; i++) {
            System.out.print(rs[i] + " ");
        }
        System.out.println();

        System.out.println("==== Column Sums(for B)  ====");
        int[] cs = columnSums(B);
        for (int i = 0; i < cs.length; i++) {
            System.out.print(cs[i] + " ");
        }
        System.out.println();

        System.out.println("==== Add ====");
        int[][] a= add(A, B);
        if (a!=null){
            printMatrix(a);
        }

        System.out.println("==== Transpose ====");
        int[][] t = transpose(A);
        printMatrix(t);

        System.out.println("==== Multiply A x B ====");
        int[][] mult = multiply(A, B, m,n,p);
        printMatrix(mult);







        
    }


}
