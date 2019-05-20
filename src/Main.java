public class Main {
    public static void main(String args[]) {
        Usuario u1 = new Usuario("Manoel");
        Usuario u2 = new Usuario("Pedro");
        Usuario u3 = new Usuario("Carla");
        u1.logar();
        u2.logar();
        u3.logar();
        System.out.println(Usuario.totalUsuariosLogados);

    }
}
