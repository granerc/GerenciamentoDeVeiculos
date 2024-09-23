package sistema;

public class Veiculo {
	String modelo;
	int ano;
	int velocidade;
	Motorista motorista;
	
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public Veiculo(String modelo, int ano, int velocidade) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    
    public void aumentarVelocidade(int valor) {
        this.velocidade += valor;
        if (this.velocidade >= 120) {
            System.out.println("Velocidade acima do limite, por favor reduza!\n");
        }
    }

    public void diminuirVelocidade(int valor) {
        this.velocidade -= valor;
        if (this.velocidade < 0) {
            this.velocidade = 0; 
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }


    public void setMotorista(Motorista motorista) {
        if (motorista.getIdade() >= 18) {
            this.motorista = motorista;
        } else {
            System.out.println("Motorista não tem idade suficiente para dirigir.\n");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Velocidade Atual: " + velocidade + " km/h\n");
        if (motorista != null) {
            motorista.exibirInformacoes();
        } else {
            System.out.println("Sem motorista associado.\n");
        }
    }

}
