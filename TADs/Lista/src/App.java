public class App {
    public static void main(String[] args) throws Exception {
        // Estática
        ListaEstatica p = new ListaEstatica(4);
    
        p.agregar(1);
        p.agregar(2);
        p.agregar(3);
        p.agregar(4);
        p.agregar(1);
        p.agregar(2);
        p.agregar(3);
        p.agregar(4);

        System.out.println("Remover: " + p.remover(2));
        System.out.println("Tercer elemento: " + p.obtener(2));
        System.out.println(p.toString());
        
        // Dinámica
        Lista<Integer> p1 = new ListaDinamica<>();

        p1.agregar(1);
        p1.agregar(2);
        p1.agregar(3);
        p1.agregar(4);
        p1.agregar(5);
        
        System.out.println("Remover: " + p1.remover(2));
        System.out.println("Tercer elemento: " + p1.obtener(2));
        System.out.println(p1.toString());
    }
}
