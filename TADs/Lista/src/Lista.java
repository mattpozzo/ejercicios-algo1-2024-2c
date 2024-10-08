public interface Lista<T> {
    void agregar(T elemento);
    T obtener(int indice);
    Integer largo();
    T remover(int indice);
    boolean contiene(T elemento);
    void vaciar();
}
