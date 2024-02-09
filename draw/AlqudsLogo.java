package draw;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AlqudsLogo extends JPanel implements Drawable {
	public static BufferedImage image;

	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		BufferedImage image;

		try {
			JFrame f = new JFrame("Alquds Logo");
			image = ImageIO.read(new File("C:\\Users\\Spider Net\\OneDrive\\Desktop\\alqudsLogo.png"));
		} catch (IOException e) {
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 30, 30, null);
		repaint(30);
	}

}
