package builder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cursosEstudiante = new ArrayList<String>();
        cursosEstudiante.add("Afro");
        cursosEstudiante.add("Tropical");
        cursosEstudiante.add("Champeta");

        ArrayList<String> cursosProfesor = new ArrayList<String>();
        cursosProfesor.add("Tropical");
        cursosProfesor.add("Contemporánea");

        Usuario usuario1 = new Usuario.Builder("Juanita", "123", 19, "Bogotá")
                .setEstudiante("Estudiante", cursosEstudiante)
                .build();

        Usuario usuario2 = new Usuario.Builder("Rodrigo", "456", 24, "Bogotá")
                .setProfesor("Profesor", cursosProfesor, 2000000)
                .build();

        Usuario usuario3 = new Usuario.Builder("Carla", "789", 37, "Medellin")
                .setAdministrativo("Administrativo", 3000000)
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
    }


}
