import java.util.ArrayList;
import java.util.List;

public class ColaDinamica<T> implements Cola<T>{
    private List<T> elementos;
    
    public ColaDinamica() {
        elementos = new ArrayList<>();
    }

    @Override
    public void encolar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T asomar() {
        if (esVacia()){
            throw new RuntimeException("Cola vacía");
        }
        return elementos.get(0);
    }

    @Override
    public T desencolar() {
        return elementos.remove(0);
    }

    @Override
    public Integer largo() {
        return elementos.size();
    }

    @Override
    public boolean esVacia() {
        return elementos.isEmpty();
    }

    @Override
    public void vaciar() {
        elementos.clear();
    }

    @Override
    public String toString() {
        String cola = "";
        for (T e : elementos){
            cola += e.toString() + " ";
        }
        return cola;
    }
}
