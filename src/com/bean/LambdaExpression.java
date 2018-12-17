package com.bean;

//with out Using Lambda Expression
/*interface Darwable {
	public void draw();

}

public class LambdaExpression {
	public static void main(String[] args) {
		int width = 10;
		Darwable d = new Darwable() {
			public void draw() {
				System.out.println("Drawable" + width);
			}
		};
		d.draw();
	}
}
*/

//Using Lambda Expression
interface Drawable {
	public void draw();

}

public class LambdaExpression {
	public static void main(String[] args) {
		int width = 100;
		Drawable d = () -> {
			System.out.println(width);
		};
		d.draw();

	}
}

/*
 * interface Drawable { public void draw(); }
 * 
 * public class LambdaExpression { public static void main(String[] args) { int
 * width = 10; Drawable d = () -> { System.out.println(width); }; d.draw(); }
 * 
 * }
 */