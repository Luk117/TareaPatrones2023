package state;

public class EstadoProcesando implements IEstadoEstudiante {
   
    @Override
    public void avanzar(Estudiante estudiante) {
        estudiante.setEstado(new EstadoInscrito());
    }

    @Override
    public void retornar(Estudiante estudiante) {
        estudiante.setEstado(new EstadoMatricula());
    }

    @Override
    public String consultar() {
        return "Etapa2: Estamos revisando su proceso de inscripcion...[validando datos personales], [Procesando pago]";
    }
}
