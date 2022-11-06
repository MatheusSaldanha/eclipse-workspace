package arrays.classes;



public class equalsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Matheus Saldanha";
        u1.email = "matheus.saldanha@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Matheus Saldanha";
        u2.email = "matheus.saldanha@gmail.com";
        
        System.out.print("\033[H\033[2J"); 
        
        System.out.println("\n"+u1.equals(u2));
        

    }
}
