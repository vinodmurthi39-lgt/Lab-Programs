import java.util.Scanner;
public class Lab1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Size of the Matrix:");
        int n=sc.nextInt();

        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] c=new int[n][n];

        System.out.println("Enter the frist matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("1st matrix elements are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2nd matrix elements are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Resultant Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();


    }
}
