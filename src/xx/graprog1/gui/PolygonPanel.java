package xx.graprog1.gui;

import java.awt.Dimension;
import java.awt.Polygon;

import xx.graprog1.morphing.StaticMorphing;

public class PolygonPanel extends MorphPanel {

	private StaticMorphing morphing;
	
	public PolygonPanel() {
		super();
		
		morphing = new StaticMorphing();
		setMorphing(morphing);
		
		setPreferredSize(new Dimension(100, 100));
	}

	public PolygonPanel(Polygon polygon) {
		super();
		
		morphing = new StaticMorphing(polygon);
		setMorphing(morphing);
		
		setPreferredSize(new Dimension(100, 100));
	}

	public Polygon getPolygon() {
		return morphing.getPolygon();
	}

	public void setPolygon(Polygon polygon) {
		morphing.setPolygon(polygon);
		repaint();
	}

}
