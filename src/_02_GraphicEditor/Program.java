package _02_GraphicEditor;

import _02_GraphicEditor.Interface.Shape;
import _02_GraphicEditor.Model.*;

public class Program {
	public static void main(String[] args) {
		
		GraphicEditor graphicEditor = new GraphicEditor();
		Shape circle = new Circle();
		Shape rect = new Rectangle();
		Shape square = new Square();
		
		graphicEditor.drawShape(circle);
		graphicEditor.drawShape(rect);
		graphicEditor.drawShape(square);
	}
}
