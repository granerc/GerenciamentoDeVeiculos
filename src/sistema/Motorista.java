package sistema;

public class Motorista {
	String nome;
	int idade;
	String licenca;
	
	public Motorista(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }
	
    public Motorista(String nome, int idade, String licenca) {
        this.nome = nome;
        this.licenca = licenca;
        setIdade(idade);
    }

    public void setIdade(int idade) {
        if (idade >= 18) {
            this.idade = idade;
        } else {
            this.idade = 0;
            System.out.println("Idade insuficiente para dirigir.");
        }
    }
	
	public int getIdade() {
		return this.idade;
	}
	
    public String getNome() {
        return this.nome;
    }

    public String getLicenca() {
        return this.licenca;
    }

	public void exibirInformacoes() {
		System.out.println("Nome: " + nome + ", Idade: " + idade + ", Licença: \n" + licenca);
		
	}
	
	

}
