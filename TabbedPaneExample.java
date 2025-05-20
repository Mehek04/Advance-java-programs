package assignment;
	import javax.swing.*;
	import java.awt.*;

	public class TabbedPaneExample  extends JFrame {

	    public TabbedPaneExample () {
	        setTitle("Color Tabbed Pane Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create JTabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each tab with corresponding background colors
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add the tabbed pane to the frame
	        add(tabbedPane);

	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new TabbedPaneExample());
	    }
	

}
