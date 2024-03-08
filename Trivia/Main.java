import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriviaGame juegoTrivia = new TriviaGame();
        inicializarJuego(juegoTrivia);
        jugar(juegoTrivia);
    }

    private static void inicializarJuego(TriviaGame juegoTrivia) {
        juegoTrivia.agregarPregunta("\n¿Cuál es la capital de Francia?");
        juegoTrivia.agregarOpcion(0, "París", true);
        juegoTrivia.agregarOpcion(0, "Londres", false);
        juegoTrivia.agregarOpcion(0, "Roma", false);
        juegoTrivia.agregarOpcion(0, "Madrid", false);

        juegoTrivia.agregarPregunta("\n¿Cuál es el río más largo del mundo?");
        juegoTrivia.agregarOpcion(1, "Amazonas", true);
        juegoTrivia.agregarOpcion(1, "Nilo", false);
        juegoTrivia.agregarOpcion(1, "Mississippi", false);
        juegoTrivia.agregarOpcion(1, "Yangtsé", false);

        juegoTrivia.agregarPregunta("\n¿En qué año comenzó la Primera Guerra Mundial?");
        juegoTrivia.agregarOpcion(2, "1914", true);
        juegoTrivia.agregarOpcion(2, "1918", false);
        juegoTrivia.agregarOpcion(2, "1939", false);
        juegoTrivia.agregarOpcion(2, "1945", false);

        juegoTrivia.agregarPregunta("\n¿Quién escribió la obra 'Don Quijote de la Mancha'?");
        juegoTrivia.agregarOpcion(3, "Miguel de Cervantes", true);
        juegoTrivia.agregarOpcion(3, "Gabriel García Márquez", false);
        juegoTrivia.agregarOpcion(3, "William Shakespeare", false);
        juegoTrivia.agregarOpcion(3, "Friedrich Nietzsche", false);

        juegoTrivia.agregarPregunta("\n¿Cuál es el país más grande del mundo por área terrestre?");
        juegoTrivia.agregarOpcion(4, "Rusia", true);
        juegoTrivia.agregarOpcion(4, "Canadá", false);
        juegoTrivia.agregarOpcion(4, "China", false);
        juegoTrivia.agregarOpcion(4, "Estados Unidos", false);

        juegoTrivia.agregarPregunta("\n¿Qué famoso pintor neerlandés cortó parte de su oreja?");
        juegoTrivia.agregarOpcion(5, "Vincent van Gogh", true);
        juegoTrivia.agregarOpcion(5, "Pablo Picasso", false);
        juegoTrivia.agregarOpcion(5, "Leonardo da Vinci", false);
        juegoTrivia.agregarOpcion(5, "Claude Monet", false);

        juegoTrivia.agregarPregunta("\n¿Cuál es el océano más grande del mundo?");
        juegoTrivia.agregarOpcion(6, "Océano Pacífico", true);
        juegoTrivia.agregarOpcion(6, "Océano Atlántico", false);
        juegoTrivia.agregarOpcion(6, "Océano Índico", false);
        juegoTrivia.agregarOpcion(6, "Océano Antártico", false);

        juegoTrivia.agregarPregunta("\n¿Quién fue el primer presidente de Estados Unidos?");
        juegoTrivia.agregarOpcion(7, "George Washington", true);
        juegoTrivia.agregarOpcion(7, "Thomas Jefferson", false);
        juegoTrivia.agregarOpcion(7, "Abraham Lincoln", false);
        juegoTrivia.agregarOpcion(7, "John Adams", false);

        juegoTrivia.agregarPregunta("\n¿En qué año se proclamó la independencia de Estados Unidos?");
        juegoTrivia.agregarOpcion(8, "1776", true);
        juegoTrivia.agregarOpcion(8, "1789", false);
        juegoTrivia.agregarOpcion(8, "1812", false);
        juegoTrivia.agregarOpcion(8, "1836", false);

        juegoTrivia.agregarPregunta("\n¿Cuál es el metal más abundante en la corteza terrestre?");
        juegoTrivia.agregarOpcion(9, "Aluminio", true);
        juegoTrivia.agregarOpcion(9, "Hierro", false);
        juegoTrivia.agregarOpcion(9, "Cobre", false);
        juegoTrivia.agregarOpcion(9, "Plata", false);
    }

    private static void jugar(TriviaGame juegoTrivia) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de trivia!");
        juegoTrivia.iniciarJuego();
        System.out.println("¡Juego terminado! Puntaje final: " + juegoTrivia.getPuntaje());

        sc.close();
    }
}
