import java.util.*;

public class TriviaGame {
    private List<Pregunta> preguntas;
    private int puntaje;

    public TriviaGame() {
        preguntas = new ArrayList<>();
        puntaje = 0;
    }

    public void agregarPregunta(String enunciado) {
        preguntas.add(new Pregunta(enunciado));
    }

    public void agregarOpcion(int indicePregunta, String opcion, boolean esCorrecta) {
        preguntas.get(indicePregunta).agregarOpcion(opcion, esCorrecta);
    }

    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);

        // Muestra las preguntas de manera aleatoria
        Collections.shuffle(preguntas);

        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getEnunciado());
            pregunta.mostrarOpciones();

            System.out.print("Ingrese su respuesta (1-" + pregunta.getNumeroOpciones() + "): ");
            int respuestaUsuario = sc.nextInt();

            if (pregunta.verificarRespuesta(respuestaUsuario)) {
                System.out.println("¡Respuesta correcta!");
                puntaje++;
            } else {
                System.out.println("¡Respuesta incorrecta!");
            }
        }

        sc.close();
    }

    public int getPuntaje() {
        return puntaje;
    }
}
