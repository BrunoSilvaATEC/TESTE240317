package Model;

public class Exposicao {

	private String nomeEx;
	private String dataInicio;
	private String dataFim;
	private int quantVisitantes;
	private int preco;
	private String obras;
	
	public String getNomeEx() {
		return nomeEx;
	}

	public void setNomeEx(String nomeEx) {
		this.nomeEx = nomeEx;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public int getQuantVisitantes() {
		return quantVisitantes;
	}

	public void setQuantVisitantes(int quantVisitantes) {
		this.quantVisitantes = quantVisitantes;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getObras() {
		return obras;
	}

	public void setObras(String obras) {
		this.obras = obras;
	}

	public Exposicao(String nomeEx, String dataInicio, String dataFim, int quantVisitantes, int preco, String obras) {
		super();
		this.nomeEx = nomeEx;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.quantVisitantes = quantVisitantes;
		this.preco = preco;
		this.obras = obras;
	}
	
	
	
}