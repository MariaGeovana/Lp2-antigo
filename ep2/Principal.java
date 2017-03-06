public class Principal {
	public static void main(String []arg ){
		Triangulo tri = new Triangulo(4,3);
		System.out.println(tri.perimetro(5,3));
		System.out.println(tri.area());
		Circuferencia cir = new Circuferencia(6 , 3.14)	;
		System.out.println(cir.perimetro());
		System.out.println(cir.area());
		Quadrado qua = new Quadrado(5);
		System.out.println(qua.perimetro());
		System.out.println(qua.area());
		Retangulo ret = new Retangulo (6.25 ,4);
		System.out.println(" retangulo" + ret.perimetro());
		System.out.println(ret.area());
		Trapezio tra = new Trapezio(3,8,5);
		System.out.println(" trapezio " + tra.perimetro(5));
		System.out.println(tra.area());
		} 
	}
