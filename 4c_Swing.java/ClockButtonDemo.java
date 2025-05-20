package assignment;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class ClockButtonDemo extends JFrame implements ActionListener {

	    private JButton btnDigitalClock;
	    private JButton btnHourGlass;
	    private JLabel messageLabel;

	    public ClockButtonDemo() {
	        setTitle("Image Button Demo");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Load images (make sure images are in your project folder or specify full path)
	        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

	        // Create buttons with images and text below
	        btnDigitalClock = new JButton("Digital Clock", digitalClockIcon);
	        btnDigitalClock.setVerticalTextPosition(SwingConstants.BOTTOM);
	        btnDigitalClock.setHorizontalTextPosition(SwingConstants.CENTER);

	        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);
	        btnHourGlass.setVerticalTextPosition(SwingConstants.BOTTOM);
	        btnHourGlass.setHorizontalTextPosition(SwingConstants.CENTER);

	        // Add action listeners
	        btnDigitalClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Message label
	        messageLabel = new JLabel("Press a button");

	        // Add components
	        add(btnDigitalClock);
	        add(btnHourGlass);
	        add(messageLabel);

	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnDigitalClock) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new ClockButtonDemo());
	    }
}
