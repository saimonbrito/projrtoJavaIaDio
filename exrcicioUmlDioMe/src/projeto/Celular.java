package projeto;

public class Celular  implements Musica ,Telefone, Navegador{
	
	String nome = "motoMlack";
	String modelo = "blackWhite";
	String marca = "sistemTeck";
	
	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Pagina exibida");
		
	}
	@Override
	public void adcionarNovaPagina() {
		// TODO Auto-generated method stub
		System.out.println("Nova Pagina adcionada");
	}
	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Pagina atualizada");
	}
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("telefone Ligando... ");
	}
	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("chamada atendida.");
	}
	@Override
	public void iniciarCorreioDeVoz() {
		// TODO Auto-generated method stub
		System.out.println("correio de voz iniciado");
	}
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("musica tocando... ");
	}
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("musica pauzada");
	}
	@Override
	public void selecionar() {
		// TODO Auto-generated method stub
		System.out.println("musica selecionada");
	}

}
