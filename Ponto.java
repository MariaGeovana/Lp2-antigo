public class Ponto{
private	double x,y;
public void setX (double x){
	this.x = x;
}
public double getX(){
	return x;
}
public void setY(double y){
	this.y=y;
}
public double getY(){
	return y;
}
public static void  main (String [] args){
	Ponto p1 = new Ponto();
	Ponto p2 =new Ponto();	
	p1.setX(10.0);
	p1.setY(20.0);
	p1.getX();
	p1.getY();
	p2.setX(20.0);
	p2.setY(10.0);
	p2.getX();
	p2.getY();
	Ponto p3 = new Ponto ();
		p3.x=50; p3.y=70;
		p1=p3;
	System.out.println(p3.x +","+ p3.y);
		Ponto p4=p3;
	System.out.println(p4.x+","+p4.y);

}


}
