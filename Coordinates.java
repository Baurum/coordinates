import java.lang.Math;
public class Coordinates{
	public static void main(String[] args){
		Point p1 = new Point(3,3);
		Point p2 = new Point(3,3);
		// imprime(p1.toString());
		// imprime(p2.toString());
		// imprime("" + p1.distOrigin());
		// imprime("" + p2.distOrigin());
		// imprime("" + p1.distance(p2));
		if(p1.equals(p2)){
			imprime("P1 y P2 son iguales segun equals");

		} else {
			imprime("P1 y P2 son distintos segun equals");
		}
		if(p1 == p2){
			imprime("P1 y P2 son iguales segun ==");

		} else {
			imprime("P1 y P2 son distintos segun ==");
		}

		imprime("" + p1);
		imprime("" + p2);

		String a = "coche";
		String b = "coche";

		if(a.equals(b)){
			imprime("P1 y P2 son iguales segun equals");

		} else {
			imprime("P1 y P2 son distintos segun equals");
		}
		if(a == b){
			imprime("P1 y P2 son iguales segun ==");

		} else {
			imprime("P1 y P2 son distintos segun ==");
		}



	}
	public static void imprime (String s){
		System.out.println(s);
	}
}