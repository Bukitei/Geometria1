package dad.javafx.shapes;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

public class Triangle extends Polygon {
	
	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty height = new SimpleDoubleProperty();

	public Triangle(double base, double height) {
		super();
		
		this.base.set(base);
		this.height.set(height);
		
		createPoints();
		this.base.addListener((o, n, nv) -> createPoints());
		this.height.addListener((o, n, nv) -> createPoints());
		
	}
	
	public Triangle() {
		this(0.0, 0.0);
	}
	
	private void createPoints() {
		
		getPoints().clear();
		getPoints().addAll(getBase() / 2, 0.0);
		getPoints().addAll(getBase(), getHeight());
		getPoints().addAll(0.0, getHeight());
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getBase() {
		return this.baseProperty().get();
	}
	

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}
	

	public final DoubleProperty heightProperty() {
		return this.height;
	}
	

	public final double getHeight() {
		return this.heightProperty().get();
	}
	

	public final void setHeight(final double height) {
		this.heightProperty().set(height);
	}
	
	
}
