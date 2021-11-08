import java.util.Arrays;

public class YmnoshitRandomMatrix{
  public static void main(String[] args){
		int width = (int) ((Math.random() * 10) + 1);
    int height = (int) ((Math.random() * 10) + 1);
    int [][] matrix_1 = new int[height][width];
    int [][] matrix_2 = new int[height][width];
    int [][] result = new int[height][width];
    System.out.print("matriza : "+ "\n" +" width: "+ width + "\n" + "height: " + height + "\n");
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