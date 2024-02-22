package classeabstratamod13;

public class PessoaFisica extends Pessoa{
   private int idade;
   private String cpf;

    public PessoaFisica(int idade, String cpf) {
            super("Paulo", "Rua tal, bloco 2");
            this.setCpf("123.456.789-00");
            }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
