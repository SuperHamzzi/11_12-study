package ex3_1;

public class Shape {
	private String type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {
		
	}
	public Shape(String type,double height, double width) {
		this.type=type;
		this.height=height;
		this.width=width;
	}
	
	public String information() {
		return "Shape [type=" + type + ", height=" + height + ", width=" + width + ", color=" + color + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
