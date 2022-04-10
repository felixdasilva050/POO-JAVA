package lista4.questao2;

public class Setor {
    private static Integer codigoSetor = 0;
    private String nome;

    Setor(String nome){
        codigoSetor++;
        this.nome = nome;
    }

    public static Integer getCodigoSetor() {
        return codigoSetor;
    }

    public String getNome() {
        return nome;
    }
}
