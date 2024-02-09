package draw;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class FlagsPanel extends JFrame {

	// how many elements in the 2D array also the grid
	int a = 2;
	int b = 2;

	Drawable[][] flags = new Drawable[a][b];

	Drawable f = new PlaestineFlage();
	Drawable a1 = new AlqudsLogo();
	Drawable a2 = new AbudiesLogo();

	Drawable arr[] = { f, a1, a1 };

	public FlagsPanel() {
		setTitle("Drawings and Images");
		setLayout(new GridLayout(a, b));
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


	}

	// Constructor
	public FlagsPanel(int rows, int cols) {
		rows = a;
		cols = b;
		flags = new Drawable[rows][cols];
	}

	// adds the elements from arr to flags randomly
	public void Add() {
		// FlagsPanel f = new FlagsPanel(a, b);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				flags[i][j] = arr[(int) (Math.random() * 2)];
			}
		}
	}

	public Drawable[] Fflag = newFlag();

	public Drawable[] newFlag() {
		return flags[(int) (Math.random() * flags.length)];
	}

	public void run() {
		while (true) {
			Fflag = newFlag();
			repaint();
		}
	}

	public static void main(String[] args) {
		FlagsPanel fp = new FlagsPanel();
		fp.Add();
		fp.run();
	}
}