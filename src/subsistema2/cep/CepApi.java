package subsistema2.cep;

public class CepApi {
 private static CepApi instancia = new CepApi();
 
 public CepApi() {
	// TODO Auto-generated constructor stub
}
 public static CepApi getIntancia() {
	 return instancia;
 }
 
 public String recuperarCidade(String cep) {
	 return "Araraquara";
 }
 public String recuperarEstado(String cep) {
	 return "Sp";
 }
}
