package xx.graprog1.gui;

import java.awt.BorderLayout;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

import xx.graprog1.morphing.SimpleMorphing;

public class MorphFrame extends JFrame implements MorphListener{

	private static final Polygon DEFAULT_POLYGON_A = new Polygon(
			new int[] { 10, 10, 100, 100 },
			new int[] { 10, 100,100, 10 },
			4);

	private static final Polygon DEFAULT_POLYGON_B = new Polygon(
			new int[] { 10, 100, 10, 100 },
			new int[] { 10, 10, 100, 100 },
			4);

	private MorphPanel morphPanel;
	private MorphControlPanel morphControlPanel;
	
	
	public MorphFrame() {
		setupGUI();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setupGUI() {
		JPanel p = new JPanel(new BorderLayout());
		
		morphPanel = new MorphPanel(new SimpleMorphing(DEFAULT_POLYGON_A, DEFAULT_POLYGON_B));
		p.add(morphPanel, BorderLayout.CENTER);
		
		morphControlPanel = new MorphControlPanel(this);
		p.add(morphControlPanel, BorderLayout.SOUTH);
		
		setContentPane(p);
		pack();

	}

	@Override
	public void tChanged(double newT) {
		morphPanel.setT(newT);
	}

	@Override
	public void requestNewPolygon() {
		new PolygonDialog(DEFAULT_POLYGON_A, DEFAULT_POLYGON_B);
		
	}

	@Override
	public void requestQuit() {
		setVisible(false);
		dispose();
	}
	
}
