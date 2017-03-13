import java.util.ArrayList;
import java.util.Collections;
public class Principal{
    public static void main(String[] args){
			Aluno a1 = new Aluno("Adriene",20);
			Aluno a2 = new Aluno("Gabriel",18);
			Aluno a3 = new Aluno("Cristhian",19); 
			Aluno a4 = new Aluno("Wagner",16);
			Aluno a5 = new Aluno("Agnaldo",17);
            ArrayList <Aluno> aluno = new ArrayList<Aluno>();
			aluno.add(a5);
            aluno.add(a1); 
            aluno.add(a2);
            aluno.add(a3);
            aluno.add(a4);
			Collections.sort(aluno);
			for(int i=0 ; i<5;i++){	
            	System.out.println(aluno.get(i).getNome() + " "+ aluno.get(i).getIdade());

			}
			Disciplina d1 = new Disciplina("Matemetica","Hélio");
			Disciplina d2 = new Disciplina("Português" , "keilla");
			Nota n1 = new Nota(8 , a1 ,d1 );
			Nota n2 = new Nota(7 , a1 ,d2);
			Nota n3 = new Nota(6, a2 ,d1 );
			Nota n4 = new Nota(7.5, a2,d2);
			Nota n5 = new Nota( 7.25,a3,d1);
			Nota n6 = new Nota(8.5, a3,d2 );
			Nota n7 = new Nota(8.4, a4,d1);
			Nota n8 = new Nota(6.4, a4,d2);
			Nota n9 = new Nota(8, a5,d1);
			Nota n10 = new Nota( 7.25, a5, d2);
			ArrayList <Nota> notas = new ArrayList<Nota>();
			ArrayList <Disciplina> dis = new ArrayList<Disciplina>();
			Collections.sort(notas);
			for(int i=0 ; i<10 ;i++){	
            	System.out.println(nota.get(i).getValor() + "  " + dis.get(i).getNome());

			}
	}
}		
     
