package lista6.questao1;

public class Pessoa {
    private String nome, sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public  String getNomeCompleto(){
        return ("Nome Completo: " + nome + " " + sobrenome);

    }

    Pessoa (){

    }
    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
