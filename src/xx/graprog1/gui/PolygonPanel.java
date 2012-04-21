package xx.graprog1.gui;

import java.awt.Polygon;

import xx.graprog1.morphing.StaticMorphing;

public class PolygonPanel extends MorphPanel {

	private StaticMorphing morphing;
	
	public PolygonPanel() {
		super();
		setMorphing(new StaticMorphing());
	}

	public PolygonPanel(Polygon polygon) {
		super();
		setMorphing(new StaticMorphing(polygon));
	}

	public Polygon getPolygon() {
		return morphing.getPolygon();
	}

	public void setPolygon(Polygon polygon) {
		morphing.setPolygon(polygon);
		repaint();
	}

	
}
