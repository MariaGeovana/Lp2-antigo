public class FabricaDeCarro{
	private static FabricaDeCarro instancia ;
		private FabricaDeCarro(){
	}
	protected int fiat;
	protected int ford;
	protected int volks;
	
	public static synchronized FabricaDeCarro getInstancia(){
		if(instancia ==null)
			instancia = new FabricaDeCarro() ;
			return instancia;

}
	

}
 
