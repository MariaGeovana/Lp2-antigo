public class Aluno{
	String nome;
	int idade;
public Aluno(String n,int i){
		this.nome = n;
		this.idade = i;
}
public void setNome(String n){
	this.nome = n;
}
public String getNome(){
	return nome;
}
public void setIdade(int i){
	this.idade = i;
}
public int getIdade(){
	return idade;
}
}
