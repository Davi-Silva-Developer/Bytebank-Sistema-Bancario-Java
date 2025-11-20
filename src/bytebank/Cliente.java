package bytebank;

public class Cliente  {
    private String nome;
    private String cpf;
    private String profissao;

    //--- CONSTRUTOR ----
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Temos mais um novo cliente!! Seja bem vindo " + this.nome);
    }

    // Getters e Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }
}
