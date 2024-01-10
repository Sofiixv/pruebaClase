import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          reto(3);  


    }

    public static void reto (int tamaño) {
        int tamaño2 = tamaño-1;
        int auxiliar = tamaño + tamaño2; 
        int auxiliar2 = tamaño;

        for (int i = 0; i < auxiliar; i++) {
            for (int j = 0; j < auxiliar; j++) {
                if (tamaño==1) {
                    
                    for (int j2 = 0; j2 < auxiliar; j2++) {
                        if (tamaño==auxiliar2) {
                            System.out.print(tamaño);
                            break;
                        }
                        else {
                            System.out.print(tamaño);
                            tamaño++;
                        }
                    }
                    break;
                }
                else {
                    System.out.print(tamaño);
                    tamaño--;
                }
            }
            System.out.println("");
        }

    }
   
}
