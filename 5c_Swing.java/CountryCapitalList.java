/* 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
package assignment;
    import javax.swing.*;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;
	import java.awt.*;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class CountryCapitalList extends JFrame {
	    private JList<String> countryList;
	    private Map<String, String> countryCapitalMap;

	    public CountryCapitalList() {
	        setTitle("Country and Capitals");
	        setSize(350, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Initialize countries and capitals
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "No single capital");  // Africa is a continent
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // Create JList of countries
	        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add scroll pane to list
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        add(scrollPane, BorderLayout.CENTER);

	        // Add ListSelectionListener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {  // Only when selection is final
	                    List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries and their capitals:");
	                    for (String country : selectedCountries) {
	                        String capital = countryCapitalMap.get(country);
	                        System.out.println(country + " -> " + capital);
	                    }
	                    System.out.println("----------------------------");
	                }
	            }
	        });

	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new CountryCapitalList());
	    }
}
