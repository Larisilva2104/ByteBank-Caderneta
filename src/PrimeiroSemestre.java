
public class PrimeiroSemestre {
	public static void main(String[] args) {
		Aluno sergio = new Aluno ();
	sergio.setNome("Sergio Alura");
	sergio.setPresencas(120);
	sergio.setAprovado(true);
	
	System.out.println(sergio.getNome());
	System.out.println(sergio.getAprovado());
	
	if (sergio.getAprovado()) {
		System.out.println("O aluno foi aprovado."); 
	} else {
		System.out.println("O aluno foi reprovado.");
	}
		System.out.println(sergio.getPresencas());
	
		System.out.println(sergio.getNome() +  " teve " + sergio.getPresencas() + " presencas.");
		
		sergio.addPresencas (2);
		sergio.addPresencas (3);
		
		System.out.println(sergio.getPresencas());
	}

}