/*****************************************************************************
* 
*Created by Marcos 07/01/2017
*****************************************************************************/

public class Point{
	/*************************************************************************
	* Point attributes
	*************************************************************************/

	/**
	* Coordenate "X"
	*/
	private double x;
	/**
	* Coordenate "y"
	*/
	private double y;


	/*************************************************************************
	* Constructors
	*************************************************************************/

	/**
	* Default Point (0,0)
	*/
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	/**
	* Point with my coordenates
	*/
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	/*************************************************************************
	* Getters and Setters
	*************************************************************************/

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}

	/*************************************************************************
	* Helpers Methods
	*************************************************************************/

	/**
	*
	*/
	// public String toString(){
	// 	return "(" + this.x + ", " + this.y + ")";
	// }
	/**
	*
	*/
	public boolean equals(Point p){
		// Coordinates.imprime("this.x = " + this.x);
		// Coordinates.imprime("this.y = " + this.y);
		// Coordinates.imprime("p.getX.x = " + p.getX());
		// Coordinates.imprime("p.getY = " + p.getY());
		return (this.x == p.getX()) && (this.y == p.getY());	
	}
	
	/**
	*
	*/
	public double distOrigin(){
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}	

	/**
	*
	*/


	public double distance(Point p){
		return Math.sqrt(Math.pow(this.x - p.getX() , 2) +
						 Math.pow(this.y - p.getY() , 2));
	}
	



}	