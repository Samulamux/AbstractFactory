package ejbuilder;

public class MensajeBuilder {
    private String contenido;

    public MensajeBuilder setContenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public Mensaje build() {
        return new Mensaje(contenido);
    }
}
