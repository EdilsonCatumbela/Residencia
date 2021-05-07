package Models;

public class Residencia {
	private String nomeAdmin;
	private String nomePessoa;
	private String nCasa;
	private String bairro;
	private String nomeDistrito;
	private String municipio;
	private String provincia;
	private String efeito;
	
	
	public String getNomeAdmin() {
		return nomeAdmin;
	}
	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getnCasa() {
		return nCasa;
	}
	public void setnCasa(String nCasa) {
		this.nCasa = nCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNomeDistrito() {
		return nomeDistrito;
	}
	public void setNomeDistrito(String nomeDistrito) {
		this.nomeDistrito = nomeDistrito;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getEfeito() {
		return efeito;
	}
	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public void print(){
		System.out.println("\n++++++++++++++++++ ATESTADO DE RESIDÊNCIA +++++++++++++++++++");
		System.out.println("Nome do Administrador: " + this.nomeAdmin);
		System.out.println("Nome do Solicitante: " + this.nomePessoa);
		System.out.println("Número da casa: " + this.nCasa);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Nome do destrito/comuna: " + this.nomeDistrito);
		System.out.println("Município: " + this.municipio);
		System.out.println("Província: " + this.provincia);
		System.out.println("Efeito: " + this.efeito);
	}
	
	
	
	

}
