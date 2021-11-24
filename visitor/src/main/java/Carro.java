public class Carro implements Veiculo{

    private String marca;
    private String nome;

    public Carro(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public String getNome(){
        return nome;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirCarro(this);
    }
}
