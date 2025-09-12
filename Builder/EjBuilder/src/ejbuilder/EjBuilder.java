package ejbuilder;

public class EjBuilder {
    public static void main(String[] args) {
        try {
            Entrada entrada = new Entrada();
            Salida salida = new Salida();

            salida.escribirLinea("Escribe un mensaje:");
            String texto = entrada.leerLinea();

            Mensaje mensaje = new MensajeBuilder()
                                    .setContenido(texto)
                                    .build();

            salida.escribirLinea("Tu mensaje es: " + mensaje.getContenido());

            // Opción archivo
            Salida salidaArchivo = new Salida("salida.txt");
            salidaArchivo.escribirLinea("Mensaje guardado: " + mensaje.getContenido());
            salidaArchivo.cerrar();

            salida.escribirLinea("Mensaje también guardado en salida.txt");

            entrada.cerrar();
            salida.cerrar();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


