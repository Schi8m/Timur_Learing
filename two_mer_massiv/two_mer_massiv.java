import java.util.Scanner;

public class two_mer_massiv{

  public static void main(String[] args) {
    int dlina, visota;
    Scanner scan = new Scanner(System.in);
    System.out.print("Vvidite dliny massiva: ");
    dlina = scan.nextInt();
    System.out.print("Vvidite visota massiva: ");
    visota = scan.nextInt();
    int [][] massiv = new int[dlina][visota];

    for (int i=0; i<dlina; i++ ){
      for(int j=0; j<visota; j++){
        System.out.print("massiv[" + i + "][" + j + "] = ");
        massiv[i][j] = scan.nextInt();
      }
    }
  }
}