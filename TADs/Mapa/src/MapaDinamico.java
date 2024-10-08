import java.util.HashMap;
import java.util.Map;

public class MapaDinamico<K, V> implements Mapa<K, V> {
    private Map<K, V> mapa;

    public MapaDinamico() {
        mapa = new HashMap<>();
    }

    @Override
    public boolean contieneClave(K clave) {
        return mapa.containsKey(clave);
    }

    @Override
    public boolean contieneValor(V valor) {
        return mapa.containsValue(valor);
    }

    @Override
    public void agregar(K clave, V valor) {
        mapa.put(clave, valor);
    }

    @Override
    public V obtener(K clave) {
        return mapa.get(clave);
    }

    @Override
    public V remover(K clave) {
        return mapa.remove(clave);
    }

    @Override
    public Integer largo() {
        return mapa.size();
    }

    @Override
    public String toString() {
        return mapa.toString();
    }
}