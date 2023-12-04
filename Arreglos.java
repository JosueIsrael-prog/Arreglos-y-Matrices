public class Arreglos
{
    public static void main(String[] args)
    {
      String [] productos = new String [7];

      int total = productos.length;

      productos[0] = "Kingstone pendrive 64GB";
      productos[1] = "Samsung Galaxy";
      productos[2] = "Dsico duro SSD Samsung";
      productos[3] = "Asus Notebook";
      productos[4] = "Macbook air";
      productos[5] = "Chromecast 4ta generacion";
      productos[6] = "Bicicleta Oxford";

        //Arrays.sort(productos);
        System.out.println("----- Usando for------");
        for (int i=0; i<= total; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }
    }
}
