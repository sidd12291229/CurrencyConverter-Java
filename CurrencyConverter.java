import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {
    private JTextField usdTextField;
    private JLabel eurLabel;

    private double conversionRate = 0.85;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel usdLabel = new JLabel("USD:");
        usdTextField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        eurLabel = new JLabel("EUR: ");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double usdAmount = Double.parseDouble(usdTextField.getText());
                double eurAmount = usdAmount * conversionRate;
                eurLabel.setText("EUR: " + eurAmount);
            }
        });

        add(usdLabel);
        add(usdTextField);
        add(convertButton);
        add(eurLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
}
