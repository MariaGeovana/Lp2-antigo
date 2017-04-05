public class FabricaDeCarro{
	private static FabricaDeCarro instancia ;
		private FabricaDeCarro(){
	}
	protected int fiat;
	protected int ford;
	protected int volks;
	
	public static synchronized FabricaDeCarro getInstacia(){
		if(instancia ==null)
			instacia = new FabricaDeCarro() ;
			return instancia;

}
	

}
 
