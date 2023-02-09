package Proxy;

public class SubirImagen implements ServidorPagos {
    private ServicioImagen uploadService = new ServicioImagen();
  
    @Override
    public void subirImagen(String imagePath) {
      uploadService.subirImagen(imagePath);
    }
  }