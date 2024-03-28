public class ProgramaPrincipal{
	public static void main(String[] args){
		Imovel im1;
		im1 = new Imovel();
		
		im1.nQuartos = 2;
		im1.nBanheiros = 1;
		im1.temGaragem = false;
		im1.endereco = "Rua dos Fulanos, n. 0";
		im1.aluguel = true;
		im1.valorVenda = 142000;
		
		im1.imprimeDados();
		im1.valoriza(3.2);
		im1.imprimeDados();
		
		System.out.println("Valor do imposto: " + im1.calculaImposto());
		
		Imovel im2;
		im2 = new Imovel();
		
		im2.nQuartos = 2;
		im2.nBanheiros = 1;
		im2.temGaragem = false;
		im2.endereco = "Rua dos Fulanos, n. 0";
		im2.aluguel = true;
		im2.valorVenda = 142000;
		
		if (im1 == im2){
			System.out.println("Mesmos imoveis!");
		}
		else{
			System.out.println("\nImoveis distintos!\n");
		}
		/* Esse codigo retorna que os imoveis são distintos, pois o operador '==' testa se a referencia dos objetos
		é a mesma, ou seja, se apontam para o mesmo objeto. Isso nao eh o caso, apesar dos atributos de ambos
		os objetos serem os mesmos, porque são instancias diferentes.*/
		
		Imovel im3 = im1;
		im3.valorVenda = 0;
		im3.imprimeDados();
		im1.imprimeDados();
		/* Ambos imoveis tem o valor alterado para 0. Isso ocorre pois a variavel im1 guarda a referencia
		do objeto instanciado, portanto o codigo "im3 = im1" faz com que im3 aponte para a mesma instancia da
		clase. Por isso, alterar im3 também altera im1.*/
		
	}
}