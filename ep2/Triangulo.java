public class Triangulo extends FigurasGeometrica{
		private double b,h;
		public Triangulo(double base , double altura){
				this.b = base;
				this.h = altura;
		}
		double perimetro(double lado1, double lado2){
			 double p;
				p=lado1+lado2+b;
				return p;
		}
		double area(){
			 double a;
				a=(b*h)/2;
				return a;
		}


}
