/*****************************************************************************
*
* Created by Marcos
*****************************************************************************/

public class Graph{
	/*************************************************************************
	* Atributes
	*************************************************************************/

	/*
	* Max value for x
	*/
	private int maxX;

	/*
	* Max value for y 
	*/
	private int maxY;

	/*
	* Min value for x
	*/
	private int minX;

	/*
	* Min value for y
	*/
	private int minY;

	/*
	* Array unidimensional Point
	*/
	private Point[] content;

	
	/*************************************************************************
	*Constructors
	*************************************************************************/
	/**
	* Graph
	*/
	public Graph(){
		this.minX = -10;
		this.minY = -10;
		this.maxX = 10;
		this.minY = 10;
		this.content = new Point[10];
		initContent();
	}

	
		
	/**
	*Graph
	*/
	public Graph(int x, int y){
		this.minX = -x;
		this.minY = -y;
		this.maxX = x;
		this.maxY = y;
		this.content = new Point[10];
		initContent();
	}


	/*
	* Graph
	*/
	public Graph(int minX, int minY, int maxX, int maxY){
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
		this.content = new Point[10];
		initContent();
	}

	/*
	* Graph
	*/
	public Graph(int minX, int minY, int maxX, int maxY, Point[] content){
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
		this.content = content;
	}
	
	/*************************************************************
	* Getters and Setters
	*************************************************************/

	public int getMinX(){
		return this.minX;
	}

	public int getMinY(){
		return this.minY;
	}

	public int getMaxX(){
		return this.maxX;
	}

	public int getmaxY(){
		return this.maxY;
	}

	public Point[] getContent(){
		return this.content;
	}


	public void setMinX(int minX){
		this.minX = minX;
	}

	public void	setMinY(int minY){
		this.minY = minY;
	}

	public void setMaxX(int maxX){
		this.maxX = maxX;
	}

	public void setMaxY(int maxY){
		this.maxY = maxY;
	}

	public void setContent(Point[] content){
		this.content = content;
	}
	/*************************************************************************
	* Helpers Methods
	*************************************************************************/
	/*
	* Initializes the content array to some default points
	*/
	private void initContent(){
		for(int i = 0; i < this.content.length; i++){
			this.content[i] = new Point(1.0, 1.0);
		}
	}


	public void paint(){
		//create a temporary String to store the results
		String result = "";

		//boolean that indicates whether we have found a point
		boolean hasPoint = false;

		for (int j = maxY; j > minY - 1; j-- ) {
			for (int i = minX; i < maxX + 1; i++ ) {
				hasPoint = false;
				
				// check if there is any point in these coordinates
				for(int k = 0; k < this.content.length; k++){
					Point p = new Point((double) i,(double) j);
					
					if(this.content[k].equals(p) == true){
						//if theres a point we add the char 'x' to the results
						// String
						result = result + "x";
						hasPoint = true;
						break;
					}
				}

				//if we have already painted a point don't check anything else
				if(!hasPoint){ 
						//if we are in the origin we add the char "+"
					if(i == 0 && j == 0){
						result = result + "+";

						//if there is a vertical axis we add the char | to the 
						//results String the vertical axis is at x == 0, 
						//or i == 0 in this case
					} else if(i == 0){						
						result = result + "|";		
										 
						//if there is no vertical axis but there is horizontal 
						//axis (j == 0) we add the char - to the results String
					}else if(j == 0){
						result = result +"-";

						//in any other case we simply add a " " char to it
					}else{
						result = result + " ";
					}
				}

				//if we are on the right edge of the graph, we add a 
				//new line char "\n" to it (this happens when j == maxX)
				if(i == this.maxX){
					result = result + "\n";
				}					 

				
			}
			
		}
		//print the results
		System.out.println(result);
		
	}	 

}