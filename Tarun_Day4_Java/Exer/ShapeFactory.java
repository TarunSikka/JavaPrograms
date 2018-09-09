package day4;

public class ShapeFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapeType){
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new CircleNew();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new RectangleNew();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}
	@Override
	Color getColor(String color){
		return null;
	}

}
