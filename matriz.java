public class matriz {


    public static int[][] mutiplicacionDeMatriz(int[][] matriz_1, int [][] matriz_2) {

        int i;
        int j;
        int k;
        int fila_1 = matriz_1.length;
        int columna_1 = matriz_1[0].length;
        int columna_2 = matriz_2[0].length;
        int [][] resultado = new int[fila_1][columna_2];

        for(i = 0; i < fila_1; i++){
            for(j = 0; j < columna_2; j++){
                for(k = 0; k < columna_1; k++){

                }
            }

        }
        return (resultado);
    }

    public static int[][] traspuestaDeUnaMatriz(int[][] matriz_3){

        int i;
        int j;
        int fila_2 = matriz_3.length;
        int columna_3 = matriz_3[0].length;
        int[][] resultado_2 = new int[columna_3][fila_2];

        for (i = 0; i < fila_2; i++){
            for (j = 0; j < columna_3; j++){

            }
        }
        return (resultado_2);
    }
    public static int sumaDiagonalDeMatriz(int[][] matriz_4){

        int i;
        int sum = 0;
        int diagonal = matriz_4.length;

        for (i = 0; i < diagonal; i++){
            sum += matriz_4[i][i];
        }
        return (sum);
    }

    public static int maximoDeUnaMatriz(int[][] matriz_5){

        int max = matriz_5[0][0];

        for (int[] fila_3 : matriz_5){
            for (int elemnto : fila_3){
                if(elemnto > max){
                    max = elemnto;
                }
            }
        }
        return (max);
    }

    public static int[][] sumaDeDosMatrices(int[][] matriz_6, int[][] matriz_7){
        int i;
        int j;
        int fila_4 = matriz_6.length;
        int columna_4 = matriz_6.length;
        int[][] resultado_3 = new int[fila_4][columna_4];

        for (i = 0; i < fila_4; i++){
            for (j = 0; j < columna_4; j++){
                resultado_3[i][j] = matriz_6[i][j] + matriz_7[i][j];
            }
        }
        return (resultado_3);
    }

    public static int[][] multiplicacionPorUnEscalar(int[][] matriz_8, int escalar){

        int i;
        int j;
        int fila_5 = matriz_8.length;
        int columnas_5 = matriz_8[0].length;
        int [][] resultado_4 = new int[fila_5][columnas_5];

        for (i = 0; i < fila_5; i++){
            for (j = 0; j < columnas_5; j++){
                resultado_4[i][j] = matriz_8[i][j] * escalar;
            }
        }
        return (resultado_4);
    }
}
