package classeabstratamod13;

public class PessoaJuridica extends Pessoa{
    private String representante;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco) {
        super(nome, endereco);
        this.setCnpj("112344560001/00");
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
