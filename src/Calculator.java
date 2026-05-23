import javax.swing.*;
import java.awt.*;


public class Calculator {
    public static void main(String[] args){

        JFrame f = new JFrame("Basic JAVA CALULATOR");
        f.setLayout(new FlowLayout());

        JTextField t1 = new JTextField(5);
        JComboBox<String> ops= new JComboBox<>(new String[]{"Select here","+","-","*","/"});
        JTextField t2 = new JTextField(5);
        JButton btn = new JButton("=");
        JTextField res = new JTextField(15);
        res.setEditable(false);

        f.add(t1);
        f.add(ops);
        f.add(t2);
        f.add(btn);
        f.add(res);

        btn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                if(a < 0 || b <0 ) throw new IllegalArgumentException("Only positive numbers allowed!");

                int result = switch (ops.getSelectedItem().toString()){
                   case "+" -> a+b;
                   case "-" -> a-b;
                   case "*" -> a*b;
                   case "/" -> a/b;
                   default -> 0;
                };
            } catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(f,"Error: Non-numeric input detected.");
            } catch (IllegalArgumentException exception){
                JOptionPane.showMessageDialog(f, exception.getMessage());
            } catch (Exception exception){
                JOptionPane.showMessageDialog(f, exception.getMessage());
            }
        });

        f.setSize(350,150);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);




    }
}
