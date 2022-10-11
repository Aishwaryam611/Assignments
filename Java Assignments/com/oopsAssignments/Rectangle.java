package com.oopsAssignments;


	public class Rectangle extends Shape {
		private double width;
		private double height;
		public Rectangle(double width, double height) {
			super();
			this.width=width;
			this.height=height;
		}
		@Override
		void draw() {
			System.out.println("Drawing a Rectangle..."+width*height);
			
		}

	}


