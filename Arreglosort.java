public class Arreglosort
{
    public static void main(String[] args)
    {
        String [] productos = new String [7];


        int total = productos.length;

        productos[0] = "Kingstone pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        //Arrays.sort(productos);
        System.out.println("----- Usando for sin ordenacion------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        System.out.println("----- Usando for con ordenacion------");
        for (int i=0; i<= total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        System.out.println("----- Usando for con ordenacion descendente------");
        for (int i=6; i<= total-1; i--){
            System.out.println("para el indice " + i + " : " + productos[total-i]);
        }

        System.out.println("----- Usando for con ordenacion descendente inversa------");
        for (int i=0; i< total-1; i++){
            System.out.println("para el indice " + i + " : " + productos[total-1-i]);
        }

    }
}
