public class Circuferencia extends FigurasGeometrica {
		private double r,pi;
		public  Circuferencia (double raio, double pi){
				this.r = raio;
				this.pi = pi;
		}
		public double perimetro(){
			 double p;
				p=pi*(2*r);
				return p;
		}
		public double area(){
			double a;
				a=pi* Math.pow(r,2);
				return a;
		}


}
