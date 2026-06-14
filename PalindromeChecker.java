import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 4: Palindrome Checker");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(20, 27, 37));
        panel.setLayout(null);
        frame.add(panel);
        
        JLabel titleLabel = new JLabel("Palindrome Checker", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titleLabel.setForeground(new Color(52, 152, 219));
        titleLabel.setBounds(20, 20, 410, 30);
        panel.add(titleLabel);
        
        JLabel inputLabel = new JLabel("Enter a string:");
        inputLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        inputLabel.setForeground(Color.WHITE);
        inputLabel.setBounds(40, 70, 150, 25);
        panel.add(inputLabel);
        
        JTextField inputField = new JTextField();
        inputField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        inputField.setBackground(new Color(15, 19, 25));
        inputField.setForeground(Color.WHITE);
        inputField.setCaretColor(Color.WHITE);
        inputField.setBorder(BorderFactory.createLineBorder(new Color(30, 41, 59)));
        inputField.setBounds(40, 100, 370, 35);
        panel.add(inputField);
        
        JButton checkButton = new JButton("Check String");
        checkButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        checkButton.setBackground(new Color(52, 152, 219));
        checkButton.setForeground(Color.WHITE);
        checkButton.setFocusPainted(false);
        checkButton.setBorderPainted(false);
        checkButton.setBounds(40, 150, 370, 35);
        panel.add(checkButton);
        
        JLabel resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        resultLabel.setBounds(20, 200, 410, 30);
        panel.add(resultLabel);
        
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String original = inputField.getText();
                
                if (original.trim().isEmpty()) {
                    resultLabel.setForeground(new Color(241, 196, 15));
                    resultLabel.setText("Please enter some text first!");
                    return;
                }
                
                String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                
                StringBuilder sb = new StringBuilder(cleaned);
                String reversed = sb.reverse().toString();
                
                if (cleaned.equals(reversed)) {
                    resultLabel.setForeground(new Color(46, 204, 113));
                    resultLabel.setText("✔ \"" + original + "\" is a Palindrome!");
                } else {
                    resultLabel.setForeground(new Color(231, 76, 60));
                    resultLabel.setText("❌ \"" + original + "\" is NOT a Palindrome.");
                }
            }
        });
        
        frame.setVisible(true);
    }
}