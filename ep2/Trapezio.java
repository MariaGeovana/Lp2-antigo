public class Trapezio extends FigurasGeometrica {
		private double b,h, bm;
		public Trapezio (double basem ,double baseM, double altura){
			this.b = baseM;
			this.h = altura;
			this.bm = basem;
	
		}
		public double perimetro(double lado){
			 double p;
				p = bm+b+ h+lado
  ;
				return p;
		}
		public double area(){
			 double a;
				a=(b+bm)*h/2;
				return a;
		}


}
