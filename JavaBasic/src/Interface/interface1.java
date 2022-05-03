package Interface;


interface i1 {
	
	
}


interface drawable {
	int salary=25000;
	void draw();
		
}


class rectangle implements drawable {
	
	public void draw() {
		System.out.println("drawing rectangle");
	}
}


class circle implements drawable {
	
	public void draw() {
		System.out.println("drawing circle");
	}
}


class round extends circle {
	
	public void shape() {
		System.out.println("shape is round");
	}
}


public class interface1 {

	public static void main(String[] args) {
		
		System.out.println(drawable.salary);
		round r = new round();
		r.draw();
		r.shape();
		
		System.out.println("************************");
		
		circle c=new circle();
		c.draw();
		
		System.out.println("*************************");
		
		rectangle r1=new rectangle();
	    r1.draw();
	    
	    System.out.println("*************************");
	    
	    drawable d=r;
	    d.draw();

	}

}
