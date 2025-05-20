/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/

package assignment;
	import javax.swing.*;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;
	import java.awt.*;

	public class JListExample extends JFrame {

	    private JList<String> countryList;

	    public JListExample() {
	        setTitle("Country List Demo");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Array of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList with countries, allow multiple selections
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add a scroll pane around the list
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        add(scrollPane, BorderLayout.CENTER);

	        // Add ListSelectionListener to detect selections
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                // Avoid processing intermediate events
	                if (!e.getValueIsAdjusting()) {
	                    // Get selected values
	                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();

	                    // Print selected countries to console
	                    System.out.println("Selected countries: " + selectedCountries);
	                }
	            }
	        });

	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Run GUI on Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> new JListExample());
	    }
	

}
