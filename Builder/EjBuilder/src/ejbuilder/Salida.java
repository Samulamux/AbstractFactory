package ejbuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Salida {
    private BufferedWriter bw;
    public Salida() {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public Salida(String rutaArchivo) throws IOException {
        bw = new BufferedWriter(new FileWriter(rutaArchivo, true)); // true = append
    }

    public void escribirLinea(String mensaje) {
        try {
            bw.write(mensaje);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            if (bw != null) bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
