import java.util.Scanner;

public class two_mer_massiv{

  public static void main(String[] args) {
    int width, height;
    Scanner scan = new Scanner(System.in);
    System.out.print("Vvidite width massiva: ");
    width = scan.nextInt();
    System.out.print("Vvidite height massiva: ");
    height = scan.nextInt();
    int [][] massiv = new int[width][height];

    for (int i=0; i<width; i++){
      for(int j=0; j<height; j++){
        massiv[i][j]=(int) Math.random() * 10;
        System.out.println("massiv[" + i + "][" + j + "] = " + massiv[i][j] );
      }
    }
  }
}