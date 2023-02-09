package builder;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String cedula;
    private int edad;
    private String sedeUbicado;
    private String cargo;

    private ArrayList<String> cursos;
    private double sueldo;

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", sede donde está ubicado='" + sedeUbicado + '\'' +
                ", cargo='" + cargo + '\'' +
                ", cursos Actuales=" + cursos +
                ", sueldo='" + sueldo + '\'' +
                '}';
    }

    public static class Builder {
        private Usuario usuario;

        public Builder(String nombre, String cedula, int edad, String sedeUbicado) {
            usuario = new Usuario();
            usuario.nombre = nombre;
            usuario.cedula = cedula;
            usuario.edad = edad;
            usuario.sedeUbicado = sedeUbicado;
        }

        public Builder setEstudiante(String cargo, ArrayList<String> cursos) {
            if (!"Estudiante".equals(cargo)) {
                throw new IllegalArgumentException("Datos no autorizados");
            }
            usuario.cargo = cargo;
            usuario.cursos = cursos;
            usuario.sueldo = 0;
            return this;
        }

        public Builder setProfesor(String cargo, ArrayList<String> cursos, double sueldo) {
            if (!"Profesor".equals(cargo)) {
                throw new IllegalArgumentException("Datos no autorizados");
            }
            usuario.cargo = cargo;
            usuario.cursos = cursos;
            usuario.sueldo = sueldo;
            return this;
        }

        public Builder setAdministrativo(String cargo, double sueldo) {
            if (!"Administrativo".equals(cargo)) {
                throw new IllegalArgumentException("Datos no autorizados");
            }
            usuario.cargo = cargo;
            usuario.cursos = null;
            usuario.sueldo = sueldo;
            return this;
        }

        public Usuario build() {
            return this.usuario;
        }
    }

}
