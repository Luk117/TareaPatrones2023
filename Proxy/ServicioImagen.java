package Proxy;

public class ServicioImagen implements ServidorPagos {
    public void subirImagen(String filePath) {
        if (filePath.endsWith(".jpg") || filePath.endsWith(".png")) {
          // Upload the image to the server
          System.out.println("Imagen de pago cargada correctamente");
        } else {
          System.out.println("Error: solo puede subir su pago en formato JPG o PDF");
        }
      }
}

