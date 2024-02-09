package draw;

import java.awt.*;

import javax.swing.JFrame;


public class PlaestineFlage extends JFrame implements Drawable {

	int x = 50;
	int y = 50;
	int width = 300;
	int height = 50;

	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		// Black
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		g.drawRect(x, y, width, height);

		// White
		g.setColor(Color.white);
		g.fillRect(x, y + x, width, height);
		g.drawRect(x, y, width, height);

		// Green
		g.setColor(Color.green);
		g.fillRect(x, y + 2 * x, width, height);
		g.drawRect(x, y, width, height);

		// triangle corner x, y coordinates
		int[] x1 = { x, 200, x };
		int[] y1 = { x, 125, 200 };

		// Red
		g.setColor(Color.RED);
		g.drawPolygon(x1, y1, x1.length);
		g.fillPolygon(x1, y1, x1.length);
	}
}