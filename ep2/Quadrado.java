public class Quadrado extends FigurasGeometrica {
		private double l;
		public  Quadrado (double lado){
				this.l = lado;
				
		}
		public double perimetro(){
			double p;
				p=l+l+l+l;
				return p;
		}
		public double area(){
			double a;
				a= Math.pow(l,2);
				return a;
		}


}
