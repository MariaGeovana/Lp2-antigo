import java.util.Arrays;
public class Aluno implements Comparable <Aluno>{
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
public int compareTo(Aluno outro){
	if(this.idade < outro.getIdade()){
		return 1;
	}else if (this.idade > outro.getIdade()){
		return -1;
	}else{
		return 0;
	}
}
}
