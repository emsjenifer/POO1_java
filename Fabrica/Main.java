package Fabrica;

public class Main {
    public static void main(String[] args) {

		Carro meuCarro = new Carro();

		meuCarro.setCor("preto");
		meuCarro.setNumPortas(4);
		meuCarro.setPlaca("MHX 1234");
		meuCarro.setTipo("Esportivo");

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Emily");
		pessoa.setIdade(25);

		pessoa.setCarro(meuCarro);

		pessoa.ligarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(3);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(0);
        pessoa.frearCarro();
        pessoa.desligarCarro();

		System.out.println("Cor: "+meuCarro.getCor());
		System.out.println("Número de portas: "+meuCarro.getNumPortas());
		System.out.println("Placa: "+meuCarro.getPlaca());
		System.out.println("Tipo: "+meuCarro.getTipo());
		System.out.println("Pertence a:"+meuCarro.getDono().getNome());
    }
}

