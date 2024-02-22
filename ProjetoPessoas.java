package classeabstratamod13;

public class ProjetoPessoas {
    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica(30, "123.456.789-00");
        PessoaJuridica p2 = new PessoaJuridica("Paulosa Inc", "Rua tal tal, Bloco taltal");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("O CPF de " + p1.getNome() + " é " + p1.getCpf());
        System.out.println("O CNPJ de " + p2.getNome() + " é " + p2.getCnpj());

    }
}
