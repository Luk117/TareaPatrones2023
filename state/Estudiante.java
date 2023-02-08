package state;

public class Estudiante {
   
    private IEstadoEstudiante estado = new EstadoMatricula();

    public void siguienteEtapa() {
        System.out.println(estado.consultar());
        estado.avanzar(this);
        System.out.println(estado.consultar());
        estado.avanzar(this);
        System.out.println(estado.consultar());
        
    }

    public void anteriorEtapa() {
        estado.retornar(this);
    }


    public IEstadoEstudiante getEstado() {
        return estado;
    }

    public void setEstado(IEstadoEstudiante estado) {
        this.estado = estado;
    }

}

    

   

