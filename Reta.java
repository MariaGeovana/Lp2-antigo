	public class Reta{
	private Ponto p1,p2;
	public void setP1(Ponto p){
		this.p1 =p;
	}
       	public Ponto getP1(){
		return this.p1;
       	}
	public void setP2(Ponto p){
		this.p2=p;
	}
	public Ponto getP2(){
		return this.p2;
	}
	public  double Area(double a, double b, double c, double d){ 
		double e = c-a;
		double f = d-b;
		double tri =( e*f) / 2;
		double re= e*b;
		double soma = tri + re;
		return soma;
	}
}
