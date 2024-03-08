public class Opcion {
    private String texto;
    private boolean esCorrecta;

    public Opcion(String texto, boolean esCorrecta) {
        this.texto = texto;
        this.esCorrecta = esCorrecta;
    }

    public String getTexto() {
        return texto;
    }

    public boolean esCorrecta() {
        return esCorrecta;
    }
}
