package state;

public interface IEstadoEstudiante {
    void avanzar (Estudiante estudiante);
    void retornar (Estudiante estudiante);
    String consultar();
}
