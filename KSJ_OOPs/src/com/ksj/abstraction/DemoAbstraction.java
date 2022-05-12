package com.ksj.abstraction;

public class DemoAbstraction {


		public static void main(String[] args) {

			GraphicObject circle = new Circle();
			circle.draw();
			circle.resize();
			
			
			GraphicObject rectangle = new Rectangle();
			rectangle.draw();
			rectangle.resize();
		}

	}