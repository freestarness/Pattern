package PatternDemo.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		switch (shapeType) {
		case "Rectangle":
			return new Rectangle();
		case "Circle":
			return new Circle();
		case "Square":
			return new Square();
		default:
			return null;
		}
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
