package Abstract;

abstract class shape {
	abstract void draw();
	
}

class rectangle extends shape {
	protected void draw() {
		System.out.println("draw rectangle");
	}
}


class circle extends shape {
	public void draw() {
		System.out.println("draw circle");

	}
}



public class abstract4 {

	public static void main(String[] args) {
            circle c=new circle();
            c.draw();
            System.out.println("*********************");
            
            shape s=new rectangle();
            s.draw();
            System.out.println("*********************");
            
            shape t=c;
            t.draw();
            
           
	}

}
