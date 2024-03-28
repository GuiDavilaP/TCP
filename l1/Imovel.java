public class Imovel{
	public int nQuartos;
	public int nBanheiros;
	public boolean temGaragem;
	public String endereco;
	public boolean aluguel;
	public double valorVenda;
	
	public void imprimeDados(){
		System.out.println("Numero de Quartos: " + nQuartos);
		System.out.println("Numero de Banheiros: " + nBanheiros);
		
		if(temGaragem)
			System.out.println("Possui Garagem");
		else
			System.out.println("Sem Garagem");
		if(aluguel)
			System.out.println("Aluguel");
		else
			System.out.println("Venda");
		
		System.out.printf("Valor de venda: R$%,.2f \n\n", valorVenda);
	}
	
	public double calculaImposto(){
		if(aluguel)
			return (valorVenda*0.08);
		else
			return (valorVenda*0.12);			
	}
	
	public void valoriza(double perc){
		valorVenda = valorVenda + valorVenda * perc / 100;
	}
}