package xx.graprog1.gui;

import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class PolygonDialog extends JFrame{


	private PolygonPanel polygonPanelA;
	private PolygonPanel polygonPanelB;
	
	private boolean valueValid = false;

	public boolean isValueValid() {
		return valueValid;
	}

	public void setValueValid(boolean valueValid) {
		this.valueValid = valueValid;
	}

	public PolygonDialog(Polygon a, Polygon b) {
		setupGUI(a,b);
		setVisible(true);
	}
	
	private void setupGUI(Polygon a, Polygon b) {
		JPanel p = new JPanel();
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		polygonPanelA = new PolygonPanel(a);
		splitPane.setLeftComponent(polygonPanelA);
		
		p.add(splitPane);
		
		setContentPane(p);
		pack();
		
	}
	
	
}
