public class Disciplina{
	String nome;
	String professor;
public Disciplina(String n,String p){
		this.nome = n;
		this.professor =p;
}
public void setNome(String n){
	this.nome = n;
}
public String getNome(){
	return nome;
}
public void setProfessor(String p){
	this.professor= p;
}
public String getProfessor(){
	return professor;
}

}
