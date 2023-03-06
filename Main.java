import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

            int[][] matriz_1 = {{3, 5}, {8, 7}};
            int[][] matriz_2 = {{7, 1}, {6, 4}};
            int[][] resultado_1 = matriz.mutiplicacionDeMatriz(matriz_1, matriz_2);
            System.out.println("matriz 1:" + Arrays.deepToString(matriz_1));
            System.out.println("matriz 2:" + Arrays.deepToString(matriz_2));
            System.out.println("resultado:" + Arrays.deepToString(resultado_1));

            //#########################################################################

            int[][] matriz_3 = {{5, 2}, {4, 1}, {1, 2}};
            int[][] resultado_2 = matriz.traspuestaDeUnaMatriz(matriz_3);
            System.out.println("matriz 3:" + Arrays.deepToString(matriz_3));
            System.out.println("resultado:" + Arrays.deepToString(resultado_2));

            //#########################################################################

            int[][] matriz_4 = {{7, 2, 6}, {4, 6, 2}, {1, 0, 2}};
            int resultado_3 = matriz.sumaDiagonalDeMatriz(matriz_4);
            System.out.println("matriz 4:" + Arrays.deepToString(matriz_4));
            System.out.println("resultado:" + (resultado_3));

            //#########################################################################

            int[][] matriz_5 = {{7, 2, 6}, {4, 6, 2}, {1, 0, 2}};
            int resultado_4 = matriz.maximoDeUnaMatriz(matriz_5);
            System.out.println("matriz 5:" + Arrays.deepToString(matriz_5));
            System.out.println("resultado:" + (resultado_4));

            //#########################################################################

            int[][] matriz_6 = {{3, 5}, {8, 7}};
            int[][] matriz_7 = {{7, 1}, {6, 4}};
            int[][] resultado_5 = matriz.sumaDeDosMatrices(matriz_6, matriz_7);
            System.out.println("matriz 6:" + Arrays.deepToString(matriz_6));
            System.out.println("matriz 7:" + Arrays.deepToString(matriz_7));
            System.out.println("resultado_5 = " + Arrays.deepToString(resultado_5));

            //#########################################################################

            int[][] matriz_8 = {{7, 6}, {9, 1}};
            int escalar_1 = 6;
            int[][] resultado_6 = matriz.multiplicacionPorUnEscalar(matriz_8, escalar_1);
            System.out.println("matriz 8:" + Arrays.deepToString(matriz_8));
            System.out.println("Escalar 1:" + escalar_1);
            System.out.println("resultado 6:" + Arrays.deepToString(resultado_6));


        }
    }
