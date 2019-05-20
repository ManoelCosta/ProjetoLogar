class Usuario {
    static int totalUsuariosLogados;

    public Usuario() {
    }

    Usuario(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void logar(){
        totalUsuariosLogados ++;
    }
    public void deslogar(){
        totalUsuariosLogados --;
    }

}
