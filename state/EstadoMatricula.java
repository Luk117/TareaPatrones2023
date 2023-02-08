package state;

public class EstadoMatricula implements IEstadoEstudiante{

    
    @Override
    public void avanzar(Estudiante estudiante) {
        estudiante.setEstado(new EstadoProcesando());
    }

    @Override
    public void retornar(Estudiante estudiante) {
        
    }

    @Override
    public String consultar() {
        return "Etapa1: Matricula recibida, en unos minutos se procesara toda la informacion.";
        
    }


}
