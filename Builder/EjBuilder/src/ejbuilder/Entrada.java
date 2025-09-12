package ejbuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
    private BufferedReader br;
    public Entrada() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public Entrada(String rutaArchivo) throws IOException {
        br = new BufferedReader(new FileReader(rutaArchivo));
    }

    public String leerLinea() {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cerrar() {
        try {
            if (br != null) br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

