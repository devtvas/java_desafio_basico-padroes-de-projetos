package subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		// TODO Auto-generated constructor stub
	}
	public static void gravarCliente(String nome, String cep, String cidade,String estado) {
		System.out.println("Cliente salvo sistema [CRM]");
		System.out.println("Nome: "+nome);
		System.out.println("Cep: "+cep);
		System.out.println("Cidade: "+cidade);
		System.out.println("Estado: "+estado);
	}
}
