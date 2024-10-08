public class App {
    public static void main(String[] args) throws Exception {
        // Estático
        MapaEstatico p = new MapaEstatico(4);
        
        p.agregar("Primero", "a");
        p.agregar("Segundo", "b");
        p.agregar("Tercero", "c");
        p.agregar("Cuarto", "d");
        p.agregar("Quinto", "e");
        p.agregar("Sexto", "f");

        System.out.println("Remover: " + p.remover("Tercero"));
        System.out.println("Cuarto: " + p.obtener("Cuarto"));
        System.out.println(p.toString());
        
        // Dinámico
        Mapa<String, String> p1 = new MapaDinamico<>();
        
        p1.agregar("Charizard", "Fuego");
        p1.agregar("Pidgey", "Normal");
        p1.agregar("Beedrill", "Bicho");
        p1.agregar("Blastoise", "Agua");
        p1.agregar("Jolteon", "Eléctrico");
        
        System.out.println("Remover: " + p1.remover("Beedrill"));
        System.out.println("Blastoise: " + p1.obtener("Blastoise"));
        System.out.println(p1.toString());
    }
}
