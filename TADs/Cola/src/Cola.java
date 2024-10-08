public interface Cola<T> {
    void encolar(T elemento);
    T desencolar();
    T asomar();
    Integer largo();
    boolean esVacia();
    void vaciar();
}
