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
	double a,b,c,d;
	Ponto p1 = new Ponto();
	Ponto p2 =new Ponto();	
	p1.setX(4);
	p1.setY(5);
	p1.getX();
	p1.getY();
	p2.setX(5);
	p2.setY(3);
	p2.getX();
	p2.getY();
  a = p2.getY()-p1.getY();
  b = p2.getX()-p1.getX();
 d= Math.pow(a,2)+Math.pow(b,2);
c=Math.sqrt(d);
System.out.println(c);
}
}
