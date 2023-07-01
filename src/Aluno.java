
public class Aluno {
private int presencas;
private String nome;
private boolean aprovado;

public Aluno () {
	
}

public int getPresencas () {
	return presencas;
}
public void setPresencas (int presencas) {
	this.presencas = presencas;
}
public String getNome () {
	return nome;
}
public void setNome (String nome) {
	this.nome = nome;
}
public boolean getAprovado () {
	return aprovado;
}
public void setAprovado1 (boolean aprovado) {
	this.aprovado = aprovado; 
} 
public void addPresencas (int num) {
	this.presencas += num;
}
public void setAprovado (boolean aprovado) {
	if (this.presencas >= 113) {
		this.aprovado = true;
	} else {
		this.aprovado = false;
	}
}
}
