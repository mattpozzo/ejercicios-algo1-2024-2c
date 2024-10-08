import java.util.Arrays;

public class ListaEstatica implements Lista<Integer> {
    private static final int AUMENTO_CAPACIDAD = 5;
    private Integer[] elementos;
    private int tamanio;

    public ListaEstatica() {
        this(10);
    }

    public ListaEstatica(int capacidad) {
        elementos = new Integer[capacidad];
        tamanio = 0;
    }

    @Override
    public void agregar(Integer e) {
        if (estaLlena()) {
            elementos = Arrays.copyOf(elementos, tamanio + AUMENTO_CAPACIDAD);
        }
        elementos[tamanio++] = e;
    }

    private boolean estaLlena() {
       return tamanio >= elementos.length;
    }

    public Integer obtener(int i) {
        if (i < 0 || i >= tamanio) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        return elementos[i];
    }

    @Override
    public Integer remover(int i) {
        if (i < 0 || i >= tamanio) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        Integer removido = elementos[i];
        for (int j = i; j < tamanio - 1; j++) {
            elementos[j] = elementos[j + 1];
        }
        tamanio--;
        if (tamanio < elementos.length / 2) {
            elementos = Arrays.copyOf(elementos, tamanio + AUMENTO_CAPACIDAD);
        }
        return removido;
    }

    @Override
    public boolean contiene(Integer e) {
        for (int i = 0; i < tamanio; i++) {
            if (elementos[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer largo() {
        return tamanio;
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
        String lista = "";
        for (int i = 0; i < tamanio; i++){
            lista += elementos[i] + " ";
        }
        return lista;
    }
}