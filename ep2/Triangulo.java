public class Triangulo extends FigurasGeometricas {
		private float b,h;
		public Triangulo(float base , float altura){
				this.b = base;
				this.h = altura;
		}
		public float perimetro(float lado1, float lado2 , float lado3){
			public float p;
				p=lado1+lado2+lado3;
				return p;
		}
		public float area(){
			public float a;
				a=(b*h)/2;
				return a;
		}


}
