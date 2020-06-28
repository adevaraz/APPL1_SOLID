package _02_GraphicEditor.Model;

import _02_GraphicEditor.Interface.Shape;

public class GraphicEditor {
	public void drawShape(Shape shape) {
		System.out.println(shape.draw());
	}
}
