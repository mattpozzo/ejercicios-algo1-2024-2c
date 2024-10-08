import java.util.Arrays;

public class ColaEstatica implements Cola<Integer> {
    private static final int AUMENTO_CAPACIDAD = 5;
    private Integer[] elementos;
    private int tamanio;

    public ColaEstatica() {
        this(10);
    }

    public ColaEstatica(int capacidad) {
        elementos = new Integer[capacidad];
        tamanio = 0;
    }

    @Override
    public void encolar(Integer e) {
        if (estaLlena()) {
            elementos = Arrays.copyOf(elementos, tamanio + AUMENTO_CAPACIDAD);
        }
        elementos[tamanio++] = e;
    }

    private boolean estaLlena() {
       return tamanio >= elementos.length;
    }

    @Override
    public Integer asomar() {
        if (esVacia()) {
            throw new RuntimeException("Cola vacía");
        }
        return elementos[0];
    }

    @Override
    public Integer desencolar() {
        Integer tope = asomar();
        for (int i = 0; i < tamanio - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanio--;
        if (tamanio < elementos.length / 2) {
            elementos = Arrays.copyOf(elementos, tamanio + AUMENTO_CAPACIDAD);
        }
        return tope;
    }

    @Override
    public Integer largo() {
        return tamanio;
    }

    @Override
    public boolean esVacia() {
      return tamanio == 0;
    }

    @Override
    public void vaciar() {
        elementos = new Integer[10];
        tamanio = 0;
    }
    
    public void vaciar(int capacidad) {
        elementos = new Integer[capacidad];
        tamanio = 0;
    }

    @Override
    public String toString() {
        String cola = "";
        for (int i = 0; i < tamanio; i++){
            cola += elementos[i] + " ";
        }
        return cola;
    }
}