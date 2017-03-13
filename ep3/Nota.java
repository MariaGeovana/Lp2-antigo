import java.util.Arrays;
public class Nota{
	private double valor;
	private Aluno aluno;
	private Disciplina disciplina;
public Nota( double v ,Aluno a,Disciplina d){
		this.valor = v;
		this.aluno = a;
		this. disciplina =d;
}

public void setValor(double v){
	this.valor=v;
}
public double getValor(){
	return valor;
}
public void setAluno(Aluno a){
	this.aluno=a;
}
public Aluno getAluno(){
	return aluno;
}
public void setDisciplina( Disciplina d){
	this.disciplina=d;
}
public Disciplina getDisciplina(){
	return disciplina;
}
public int compareTo(Nota outro){
	if(this.valor < outro.getValor()){
		return 1;
	}else if (this.valor > outro.getValor()){
		return -1;
	}else{
		return 0;
	}
}
}
