package xx.graprog1.gui;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.Polygon;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;


public class PolygonCreateList extends JPanel {
	
	private PolygonPanel polygonPanel;
	
	private JList polygonList;
	private DefaultListModel polygonListModel;
	
	public PolygonCreateList(Polygon polygon) {
		
		setupGUI(polygon);
	}
	
	private void setupGUI(Polygon polygon) {
		setLayout(new BorderLayout());
		
		polygonPanel = new PolygonPanel(polygon);
		add(polygonPanel,BorderLayout.CENTER);
		
		
		JPanel eastPanel = new JPanel(new BorderLayout());
		
		polygonListModel = buildListModel();
		polygonList = new JList(polygonListModel);
		
		eastPanel.add(polygonList, BorderLayout.CENTER);
		
		add(eastPanel, BorderLayout.EAST);
	}

	private DefaultListModel buildListModel() {
		
		DefaultListModel dlm = new DefaultListModel();
		
		final Polygon p = getPolygon();
		
		for( int i = 0; i < p.npoints; i++) {
			dlm.addElement(new Point(p.xpoints[i], p.ypoints[i]));
		}
		
		return dlm;
	}

	public Polygon getPolygon() {
		return polygonPanel.getPolygon();
	}	
	
}
