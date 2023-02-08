package state;

public class EstadoInscrito implements IEstadoEstudiante{

    @Override
    public void avanzar(Estudiante estudiante) {

    }

    @Override
    public void retornar(Estudiante estudiante) {
    }

    @Override
    public String consultar() {
        return "Etapa3: felicidades ya quedo inscrito en el curso";
    }
}
