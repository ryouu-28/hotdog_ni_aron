package EMS;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class hotdog{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Date Input Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);

            JPanel panel = new JPanel(new GridLayout(2, 2));
            JLabel dateLabel = new JLabel("Enter Date (yyyy-MM-dd): ");
            JTextField dateField = new JTextField();
            JButton submitButton = new JButton("Submit");

            submitButton.addActionListener(e -> {
                String inputDate = dateField.getText();
                if (isValidDate(inputDate)) {
                    JOptionPane.showMessageDialog(frame, "Valid date: " + inputDate);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid date format. Please use yyyy-MM-dd.");
                }
            });

            panel.add(dateLabel);
            panel.add(dateField);
            panel.add(submitButton);
            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // Ensures strict parsing
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
