
public class getPix {
	public static void main(String[] args) {
		Pessoa ContaDoLeo = new Pessoa(3333, 50482);
		Chaves leonardo = new Chaves();
		ContaDoLeo.setPix(leonardo);

		ContaDoLeo.getPix().setAleatoria("abc123");
		ContaDoLeo.getPix().setCpf("xxxxx");
		ContaDoLeo.getPix().setCelular("123456789");
		ContaDoLeo.getPix().setEmail("leotest@gmail.com");
		
		System.out.println(ContaDoLeo.getPix().getAleatoria());
		System.out.println(ContaDoLeo.getPix().getCpf());
		System.out.println(ContaDoLeo.getPix().getCelular());
		System.out.println(ContaDoLeo.getPix().getEmail());
	}
}
