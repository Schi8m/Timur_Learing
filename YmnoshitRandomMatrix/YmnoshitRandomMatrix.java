import java.util.Arrays;
import java.util.Scanner;

public class YmnoshitRandomMatrix{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("matrix_1 width: ");
    int width_1 = scan.nextInt();
    System.out.print("matrix_1 height: ");
    int height_1 = scan.nextInt();
    System.out.print("matrix_2 width: ");
    int width_2 = scan.nextInt();
    System.out.print("matrix_2 height: ");
    int height_2 = scan.nextInt();
    int [][] matrix_1 = new int[width_1][height_1];
    int [][] matrix_2 = new int[width_2][height_2];
    int [][] result = new int[width_1][height_2];
    if (height_1 != width_2) {
      System.out.print("No, no, no");
    }
    for (int i=0; i < width_1; i++){
      for (int j=0; j < height_1; j++){
       matrix_1[i][j] = (int) (Math.random() * 10);
      }
    }
    for (int i=0; i < width_2; i++){
      for (int j=0; j < height_2; j++){
       matrix_2[i][j] = (int) (Math.random() * 10);
      }
    }
     System.out.println("matrix_1 : " + Arrays.deepToString(matrix_1));
     System.out.println("matrix_2 : " + Arrays.deepToString(matrix_2));
     for (int j=0; j < height_2; j++){
        for (int i=0; i < width_1; i++){
         	result[i][j] = 0;
            for (int k=0; k < width_1 | k < height_2; k++){
              result[i][j] = result[i][j] + matrix_1[i][k] * matrix_2[k][j];
            }
      	}
      }
      System.out.print("result :" + Arrays.deepToString(result));
  }
}