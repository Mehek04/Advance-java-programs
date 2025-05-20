package assignment;
	import javax.swing.*;
	import java.awt.*;

	public class ColorTabbedPane extends JFrame {

	    public ColorTabbedPane () {
	        setTitle("Color Tabbed Pane Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create the tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color with background set accordingly
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs to tabbed pane
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add the tabbed pane to the frame
	        add(tabbedPane);

	        // Center the frame on the screen
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new ColorTabbedPane ());
	    }

}
