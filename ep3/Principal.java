import java.util.ArrayList;
import java.util.Collections;
public class Principal{
    public static void main(String[] args){
			Aluno a1 = new Aluno("Adriene",20);
			Aluno a2 = new Aluno("Gabriel",18);
			Aluno a3 = new Aluno("Cristhian",19); 
			Aluno a4 = new Aluno("Wagner",16);
			Aluno a5 = new Aluno("Agnaldo",17);
			Disciplina d1 = new Disciplina("Web","Marcelo");
			Disciplina d2 = new Disciplina("Lp2","Hebert");
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
			ArrayList<Nota> notas = new ArrayList<Nota>();
			notas.add(n1);
			notas.add(n2);
			notas.add(n3);
			notas.add(n4);
			notas.add(n5);
			notas.add(n6);
			notas.add(n7);
			notas.add(n8);
			notas.add(n9);
			notas.add(n10);
			Collections.sort(notas);	
            	System.out.println(notas.get(0).getValor() + "  " + notas.get(0).getDisciplina().getNome() + "  " + notas.get(0).getAluno().getNome());
		

		for(int i=0; i<10; i++){
			if (notas.get(i).getDisciplina().getNome().compareTo("Lp2")==0){
				System.out.println(notas.get(i).getValor()+" "+notas.get(i).getAluno().getNome());
				i=10;
			}
		}
				


	}
}		
     
