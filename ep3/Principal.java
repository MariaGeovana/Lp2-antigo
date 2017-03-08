import java.util.ArrayList;
import java.util.Arrays;
public class Principal{
    public static void main(String[] args){
			Aluno a1 = new Aluno("Adriene",17);
			Aluno a2 = new Aluno("Gabriel",17);
			Aluno a3 = new Aluno("Cristhian",17); 
			Aluno a4 = new Aluno("Wagner",16);
			Aluno a5 = new Aluno("Agnaldo",18);
            ArrayList <Aluno> aluno = new ArrayList<Aluno>();
			 aluno.add(a5);
             aluno.add(a1); 
             aluno.add(a2);
             aluno.add(a3);
             aluno.add(a4);
             System.out.println(a1.nome + " "+ a1.idade);
			 System.out.println(a2.nome + " "+ a2.idade);
			 System.out.println(a3.nome + " "+ a3.idade);
             System.out.println(a4.nome + " "+ a4.idade);
             System.out.println(a5.nome + " "+ a5.idade);

            
	}
}		
     
