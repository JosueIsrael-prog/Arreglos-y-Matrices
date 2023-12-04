import java.util.Arrays;

public class Arreglosconsort {
    public static void main(String[] args) {
        String[] productos = new String[7];

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
        System.out.println("----- Usando for sin ordenacion------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("----- Usando for con ordenacion------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("----- Usando for a la inversa------");
        for (int i=total-1; i>=0; i--){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("----- Usando for orden decendente inversa------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[total-1-i]);
        }*/
        System.out.println("----- Usando for con ordenacion------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

    }
}    