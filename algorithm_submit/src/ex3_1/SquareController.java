package ex3_1;

public class SquareController {
	Shape s = new Shape();
	
	public double calcPerimeter(double height , double width) {
		return height*2+width*2;
	}
	public double calcArea(double height, double width) {
		return height*width;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return s.getType()+s.information();
	}

}
