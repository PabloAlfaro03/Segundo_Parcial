import java.util.Scanner;

public class MainArrays {
    public static void main(String[] args) {
        class Arreglos {
            Scanner scan = new Scanner(System.in);
            public String imprimirArreglo() {

                String name[];
                name = new String[20];
                name[0] = "Francisco";

                int i;
                for (i = 0; i <= name.length - 1; i++) {
                    System.out.println(name[i]);
                }
                return (name[i-1]);
            }


            public String value() {
                System.out.println("Introduzca un número:");
                String answer = "";
                int enteros[];
                enteros = new int[15];
                enteros[9] = 5;
                int search = scan.nextInt();
                int bandera = 1;

                for (int i = 0; i <= enteros.length - 1; i++) {
                    if (search == enteros[i]) {
                        answer = "Su numero esta en: " + i;
                        bandera = 1;
                        break;
                    } else {
                        bandera = 0;
                    }

                }
                if (bandera == 0) {
                    answer = "no se encontro el valor del numero";
                }


                return (answer);
            }

            public String delete() {
                System.out.println("Introduzca nuevo numero:");
                int ent[];
                ent = new int[15];
                ent[9] = 5;

                int delete = scan.nextInt();
                for (int i = 0; i <= ent.length - 1; i++) {
                    if (delete == ent[i]) {
                        for (int j = i; j <= ent.length - 2; j++) {
                            ent[j] = ent[j + 1];
                        }
                    }
                }
                ent[14] = 0;
                System.out.println("nuevo arreglo: ");
                return (java.util.Arrays.toString(ent));
            }


        }
    }
}
