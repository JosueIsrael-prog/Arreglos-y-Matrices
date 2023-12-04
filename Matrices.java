import java.util.Arrays;

public class Matrices {
    public static void bucleArreglos(String[] arreglo) {

        int total = arreglo.length;
        int contador=0;

        for (int i = 0; i<total; i++){
            for (int j= 0;j<total-1; j++){
                if(arreglo[j+1].compareTo(arreglo[j]) < 0){
                    String auxiliar = arreglo[i];
                    arreglo[i]= arreglo[j+1];
                    arreglo[j+1]= auxiliar;
                }
                contador++;

            }
        }
    }




    public static void main(String[] args) {
        String[] productos = new String[7];
        /*String[] productos = {"Kingstone pendrive 64GB","Samsung Galaxy","Disco duro SSD Samsung",
                "Asus Notebook","Macbook Air","Chromecast 4ta generarión","Bicicleta Oxford"};*/
        int total = productos.length;

        productos[0] = "Kingstone pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generarión";
        productos[6] = "Bicicleta Oxford";

        System.out.println("----- Usando for sin orden------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (productos[j].compareTo(productos[j + 1]) > 0) {
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
            }
        }

        /*//Arrays.sort(productos);
        System.out.println("----- Usando for sin orden------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("----- Usando for con orden------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("----- Usando for al reves------");
        for (int i=total-1; i>=0; i--){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("----- Usando for orden decendente inversa------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[total-1-i]);
        }*/
        System.out.println("----- Usando for con orden------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        System.out.println("Ordenamiento metodo burbuja");

        int contador=0;
        for (int i = 0; i<total; i++){
            for (int j= 0;j<total-1; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i]= productos[j+1];
                    productos[j+1]= auxiliar;
                }
                contador++;

            }
        }


        System.out.println("Iteraciones : "+ contador);




        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = 1;


        System.out.println("\n\n");
        int total1= numeros.length-1;
        int contador1=0;
        for (int i = 0; i<total1; i++){
            for (int j= 0;j<total1-1; j++){
                if( numeros[j+1].compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[i];
                    numeros[i]= numeros[j+1];
                    numeros[j+1]= auxiliar;
                }
                contador1++;

            }
        }

        System.out.println("Iteraciones : "+ contador1);
        System.out.println("\n\n");
        System.out.println("-----Usando For con Orden-----");
        for (int i=0 ; i<total; i++){
            System.out.println("indice" + i +  " : "+ productos[i]);
        }
    }

}