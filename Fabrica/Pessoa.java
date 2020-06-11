package Fabrica;

class Pessoa {
    String nome;
    int idade;
    String sexo;
    Carro carro;

    String getNome() {
        return nome;
    }
    
    void setNome(String nome) {
        this.nome = nome;
    }
    
    int getIdade() {
        return idade;
    }
    
    void setIdade(int idade) {
        this.idade = idade;
    }

    String getSexo() {
        return sexo;
    }
    
    void setSexo(String sexo) {
        this.sexo = sexo;
    }

    Carro getCarro() {
        return carro;
    }

    void setCarro (Carro carro) {
        this.carro = carro;
    }

    void ligarCarro() {
        carro.ligar();
    }

    void desligarCarro() {
        carro.desligar();
    }

    void acelerarCarro() {
        carro.acelerar();
    }

    void frearCarro() {
        carro.frear();
    }

    void setCambioCarro(int marcha) {
        carro.setCambio(marcha);
    }
}