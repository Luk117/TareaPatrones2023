package Proxy;

public class Main {
    public static void main(String[] args) {
      ServidorPagos imageServer = new SubirImagen();
      imageServer.subirImagen("comprobantebancolombia.jpg");
      imageServer.subirImagen("comprobantefeb12.png");
      imageServer.subirImagen("comprobante.bmp");
    }
  }
