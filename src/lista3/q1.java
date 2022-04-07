package lista3;

public class q1 {
    String nome;
    Integer idade;

    public String getNome(String next) {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Integer getIdade() {

        return idade;
    }

    public void setIdade(Integer idade) {

        this.idade = idade;
    }

    public String toString() {
        return "nome: " + nome + '\'' +
                ", idade: " + idade;
    }

}
