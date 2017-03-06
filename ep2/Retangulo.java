public class Retangulo extends FigurasGeometrica {
		private double b,h, bm;
		public  Retangulo(double base , double altura){
			this.b = base;
			this.h = altura;
	
		}
		public double perimetro(){
			double p;
				p = (2*b)+( 2*h );
				return p;
		}
		public double area(){
			double a;
				a=b*h;
				return a;
		}


}
