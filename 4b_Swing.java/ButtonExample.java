package assignment;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class  ButtonExample extends JFrame implements ActionListener {

	    private JButton btnSrilanka;
	    private JButton btnIndia;
	    private JLabel messageLabel;

	    public  ButtonExample() {
	        setTitle("Country Button Demo");
	        setSize(400, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Create buttons
	        btnSrilanka = new JButton("Srilanka");
	        btnIndia = new JButton("India");

	        // Register action listeners
	        btnSrilanka.addActionListener(this);
	        btnIndia.addActionListener(this);

	        // Label to display message
	        messageLabel = new JLabel("Press a button");

	        // Add components to frame
	        add(btnSrilanka);
	        add(btnIndia);
	        add(messageLabel);

	        // Center the frame
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    // Handle button clicks
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnSrilanka) {
	            messageLabel.setText("Srilanka is pressed");
	        } else if (e.getSource() == btnIndia) {
	            messageLabel.setText("India is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        // Run GUI in Event Dispatch Thread for thread safety
	        SwingUtilities.invokeLater(() -> new  ButtonExample());
	    }

}
