package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		switch (colorType) {
		case "Red":
			return new Red();
		case "Blue":
			return new Blue();
		case "Green":
			return new Green();
		default:
			return null;
		}
	}
}
