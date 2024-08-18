import java.util.Scanner;
public class userInput{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : " );
        int r = in.nextInt();

        System.out.print("Enter the number of column : " );
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r * c + " elements " );
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = in.nextInt();
            }
            // printArray(arr);
        }

        for(int i=0; i<r; i++){
            for(int j  =0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

