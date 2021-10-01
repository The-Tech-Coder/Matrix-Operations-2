import java.util.Scanner;

public class matrixOperations {

    public static void main(String[] args) {

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the elements for 1st matrix row-wise:");
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                a[i][j] = x.nextInt(); 
            }    
                System.out.println();
        }    

        System.out.println("Enter the elements for 2nd matrix row-wise:");
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                b[i][j] = x.nextInt(); 
            }    
                System.out.println();
        }    

        x.close();        
        int c[][] = new int[3][3];
        
        System.out.println("Matrix Addition:");
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=a[i][j]+b[i][j];   
                System.out.print(c[i][j]+" ");    
            }    
                System.out.println();
        }    

        System.out.println("Matrix Subtraction:");
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=a[i][j]-b[i][j];   
                System.out.print(c[i][j]+" ");    
            }    
                System.out.println();
        }    

        System.out.println("Matrix Multiplication:");
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=a[i][j]*b[i][j];   
                System.out.print(c[i][j]+" ");    
            }    
                System.out.println();
        }    
    }
}
