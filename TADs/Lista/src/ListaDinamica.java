import java.util.ArrayList;
import java.util.List;

public class ListaDinamica<T> implements Lista<T>{
    private List<T> elementos;
    
    public ListaDinamica() {
        elementos = new ArrayList<>();
    }

    @Override
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T obtener(int i) {
        return elementos.get(i);
    }

    @Override
    public T remover(int i) {
        return elementos.remove(i);
    }

    @Override
    public boolean contiene(T elemento) {
        return elementos.contains(elemento);
    }

    @Override
    public Integer largo() {
        return elementos.size();
    }

    @Override
    public void vaciar() {
        elementos.clear();
    }

    @Override
    public String toString() {
        String lista = "";
        for (T e : elementos){
            lista += e.toString() + " ";
        }
        return lista;
    }
}
