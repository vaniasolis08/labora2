package laboratorio2;

public class Laboratorio2 {

    public static void main(String[] args) {
         int notas [][]= {{5, 7, 9},{4, 2, 1}, {1 ,1 ,1}};
        System.out.println("la diagonal principal es" + diagonalprincipal(notas));
    }

    public static String diagonalprincipal(int matriz[][]) {
        String resultado = "";
        for (int i = 0; i < matriz.length; i++) {
            resultado = resultado + String.valueOf(matriz[i][i] + " | ");
        }
            return resultado;
    }
        }
 
            
      
    

