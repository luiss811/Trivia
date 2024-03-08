
import java.util.*;

public class Pregunta {
    private String enunciado;
    private List<Opcion> opciones;

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
        this.opciones = new ArrayList<>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void agregarOpcion(String opcion, boolean esCorrecta) {
        opciones.add(new Opcion(opcion, esCorrecta));
    }

    public void mostrarOpciones() {
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i).getTexto());
        }
    }

    public boolean verificarRespuesta(int indiceRespuestaUsuario) {
        if (indiceRespuestaUsuario < 1 || indiceRespuestaUsuario > opciones.size()) {
            return false;
        }
        return opciones.get(indiceRespuestaUsuario - 1).esCorrecta();
    }

    public int getNumeroOpciones() {
        return opciones.size();
    }
}
