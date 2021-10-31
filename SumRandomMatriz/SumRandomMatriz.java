 public class SumRandomMatriz { 

   public static void main(String[] args){
      int width = (int) ((Math.random() * 10) + 1);
      int height = (int) (Math.random() + 1);
      System.out.print("width: " + width + "\n" + "height: " + height);
      int [][] matrix_1 = new int[width][height];
      int [][] matrix_2 = new int[width][height];
      int [][] sumMatrix = new int[width][height];
      for (int i = 0; i < width; i++){
        for (int j = 0; j < height; j++){
          matrix_1[i][j]=(int) Math.random() * 100;
          matrix_2[i][j]=(int) Math.random() * 100;
          sumMatrix[i][j]=matrix_1[i][j] + matrix_2[i][j];
          System.out.print(matrix_1[i][j]); 
      }
      System.out.print("");
    }
  }
}    