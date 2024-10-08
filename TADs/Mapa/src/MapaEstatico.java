import java.util.Arrays;

public class MapaEstatico implements Mapa<String, String> {
    private static final int AUMENTO_CAPACIDAD = 5;
    private String[] claves;
    private String[] valores;
    private int tamanio;

    public MapaEstatico() {
        this(10);
    }

    public MapaEstatico(int capacidad) {
        claves = new String[capacidad];
        valores = new String[capacidad];
        tamanio = 0;
    }

    @Override
    public boolean contieneClave(String clave) {
        for (int i = 0; i < tamanio; i++) {
            if (claves[i].equals(clave)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contieneValor(String valor) {
        for (int i = 0; i < tamanio; i++) {
            if (valores[i].equals(valor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void agregar(String clave, String valor) {
        if (contieneClave(clave)) {
            throw new RuntimeException("Clave duplicada");
        }
        if (tamanio >= claves.length) {
            claves = Arrays.copyOf(claves, tamanio + AUMENTO_CAPACIDAD);
            valores = Arrays.copyOf(valores, tamanio + AUMENTO_CAPACIDAD);
        }
        claves[tamanio] = clave;
        valores[tamanio++] = valor;
    }

    @Override
    public String obtener(String clave) {
        for (int i = 0; i < tamanio; i++) {
            if (claves[i].equals(clave)) {
                return valores[i];
            }
        }
        throw new RuntimeException("Clave no encontrada");
    }

    @Override
    public String remover(String clave) {
        for (int i = 0; i < tamanio; i++) {
            if (claves[i].equals(clave)) {
                String removido = valores[i];
                for (int j = i; j < tamanio - 1; j++) {
                    claves[j] = claves[j + 1];
                    valores[j] = valores[j + 1];
                }
                tamanio--;
                if (tamanio < claves.length / 2) {
                    claves = Arrays.copyOf(claves, tamanio + AUMENTO_CAPACIDAD);
                    valores = Arrays.copyOf(valores, tamanio + AUMENTO_CAPACIDAD);
                }
                return removido;
            }
        }
        throw new RuntimeException("Clave no encontrada");
    }

    @Override
    public Integer largo() {
        return tamanio;
    }

    @Override
    public String toString() {
        String mapa = "";
        for (int i = 0; i < tamanio; i++){
            mapa += "\"" + claves[i] + "\": \"" + valores[i] + "\",\n";
        }
        return mapa;
    }
}