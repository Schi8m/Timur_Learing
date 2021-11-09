import java.util.Arrays;
import java.util.Scanner;

public class YmnoshitRandomMatrix{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("matrix_1 width: ");
    int width_1 = scan.nextInt();
    System.out.println("matrix_1 height: ");
    int height_1 = scan.nextInt();
    System.out.println("matrix_2 width: ");
    int width_2 = scan.nextInt();
    System.out.println("matrix_2 height: ");
    int height_2 = scan.nextInt();
    int [][] matrix_1 = new int[height_1][width_1];
    int [][] matrix_2 = new int[height_2][width_2];
    int [][] result = new int[height_2][width_1];
    if (height_1 != width_2) {
      System.out.print("No, no, no");
    }
    // я сделал ввод ширины и высоты для каждой из матриц. Теперь задача состоит в том , чтобы наполнить эти матрицы числами
    // для каждой матрицы следует созвать свой двойной алгоритм типа for(int i; i < ...; i++) {for(int j; j < ...; j++){заполнение матрицы   }} ???
    for (int i=0; i < height; i++){
      for (int j=0; j < width; j++){
       matrix_1[i][j] = (int) (Math.random() * 10);
       matrix_2[i][j] = (int) (Math.random() * 10);
      }
    }
     System.out.println("matrix_1 : " + Arrays.deepToString(matrix_1));
     System.out.println("matrix_2 : " + Arrays.deepToString(matrix_2));
     for (int j=0; j < height; j++){
        for (int i=0; i < width; i++){
         	result[i][j] = 0;
            for (int k=0; k < width & k < height; k++){
              result[i][j] = result[i][j] + matrix_1[i][k] * matrix_2[k][j];
            }
      	}
      }
      System.out.print("result :" + Arrays.deepToString(result));
  }
}