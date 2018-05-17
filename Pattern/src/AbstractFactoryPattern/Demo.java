package AbstractFactoryPattern;

public class Demo {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		Shape square = shapeFactory.getShape("Square");
		square.draw();
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Color red = colorFactory.getColor("Red");
		red.fill();
		Color blue = colorFactory.getColor("Blue");
		blue.fill();
		Color green = colorFactory.getColor("Green");
		green.fill();

	}

}
