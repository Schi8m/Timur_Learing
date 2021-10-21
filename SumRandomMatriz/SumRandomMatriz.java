import java.util.Random;

public class SumRandomMatriz {

    public static void main(String[] args){
     	Random random= new Random();
     	int width,height,perehod;
        width= random.nextInt(5);
        height= random.nextInt(5);
        // if (width<0) {    /// созданно на случай , если рандомное число < 0 !Спросить у Паши
        //     width = width * (-1);
        // }
        // if (height<0) {
        //     height = height * (-1);
        // }
        perehod = width - 1;
        System.out.print("matriza_1 : "+ "\n" +" width: "+ width + "\n" + "height: " + height + "\n");
     	int [][] matriza = new int[height][width];
     	for (int i=0; i<height; i++ ){
          for(int j=0; j<width; j++){
            matriza[i][j] = random.nextInt(10);
             System.out.print("matriza_1 [" + (i+1) + "]" + (j+1) + "] = " + matriza[i][j] + "  " ); 
            if (j==perehod){
              System.out.print("\n");
            }

            }
            



        }
    }    
}     	

     


