package structural_patterns.decorator_pattern;
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
          super();
          this.decoratedShape = decoratedShape;
    }
}