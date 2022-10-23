
public class TestaCliente {
	public static void main(String[] args) {
		Pessoa leo = new Pessoa(32333, 504882);
		Cliente leonardo = new Cliente();
		leo.setTitular(leonardo);
		leo.getTitular().setCPF("xxxxxxx");
		leo.getTitular().setNome("Leonardo Manoel Coelho");
		leo.getTitular().setProfissao("Vendedor");
		System.out.println(leo.getTitular().getNome());
		System.out.println(leo.getTitular().getCPF());
		System.out.println(leo.getTitular().getProfissao());
		leo.deposita(100);
		leo.deposita(200);
		System.out.println(leo.getSaldo());
		leo.saca(100);
		System.out.println(leo.getSaldo());
		
		
		
		Pessoa ContaDaIsabelly = new Pessoa(0001, 123456);
		ContaDaIsabelly.deposita(10000);
		
		ContaDaIsabelly.Transfere(1000, leo);
		System.out.println(ContaDaIsabelly.getSaldo());
		
		if(ContaDaIsabelly.Transfere(1000, leo)) {
			System.out.println("Transferencia feita com sucesso" + "\nSeu saldo atural é de:\n" + ContaDaIsabelly.getSaldo());
		}else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(leo);

}
}
