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
		// if(p1.equals(p2)){
		// 	imprime("P1 y P2 son iguales segun equals");

		// } else {
		// 	imprime("P1 y P2 son distintos segun equals");
		// }
		// if(p1 == p2){
		// 	imprime("P1 y P2 son iguales segun ==");

		// } else {
		// 	imprime("P1 y P2 son distintos segun ==");
		// }

		// imprime("" + p1);
		// imprime("" + p2);

		// String a = "moto";
		// String b = "moto";

		// if(a.equals(b)){
		// 	imprime("P1 y P2 son iguales segun equals");

		// } else {
		// 	imprime("P1 y P2 son distintos segun equals");
		// }
		// if(a == b){
		// 	imprime("P1 y P2 son iguales segun ==");

		// } else {
		// 	imprime("P1 y P2 son distintos segun ==");
		// }
		Point[] points = new Point[5];
		points[0] = new Point(-2.0,-2.0);
		points[1] = new Point(-4.0,1.0);
		points[2] = new Point(-4.0,-1.0);
		points[3] = new Point(-2.0,2.0);
		points[4] = new Point(-6.0,0.0);

		Graph g = new Graph(-10, -10, 10, 10, points);
		
		g.paint();


	}

	public static void imprime (String s){
		System.out.println(s);
	}
}