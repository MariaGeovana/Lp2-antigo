public class Principal{
	public static void main(String[] args){
		FabricaDeCarro f1= FabricaDeCarro.getInstancia();
		FabricaDeCarro f2= FabricaDeCarro.getInstancia();
		FabricaDeCarro f3= FabricaDeCarro.getInstancia();
		FabricaDeCarro f4= FabricaDeCarro.getInstancia();
		f1.fiat=+10;
		System.out.println(f3.fiat);
	}


 }

