package draw;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AbudiesLogo extends JFrame implements Drawable {

	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {

		try {
			JFrame f = new JFrame("Abudies Logo");
			JPanel panel = new JPanel();
			panel.setBounds(x, y, width, height);

			BufferedImage img = ImageIO.read(new File("C:\\Users\\Spider Net\\OneDrive\\Desktop\\campus.png"));
			JLabel pic = new JLabel(new ImageIcon(img));
			panel.add(pic);

			f.add(panel);
			f.setSize(400, 400);
			f.setLayout(null);
			f.setVisible(true);
		} catch (IOException e) {
		}
	}

}
