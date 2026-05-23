import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class ArrayInput {
    static int[] arr = new int[10];
    static int currentIndex = 0;

    public static void main(String[] args){

        JFrame f = new JFrame("Java Array Builder");
        f.setLayout(new FlowLayout());

        JTextField inputField  = new JTextField(5);
        JButton addbtn = new JButton("ADD");
        JButton resetbtn = new JButton("RESET");
        JTextField resultField = new JTextField(25);
        resultField.setEditable(false);

        f.add(new JLabel("Enter Number: "));
        f.add(inputField);
        f.add(addbtn);
        f.add(resetbtn);
        f.add(resultField);

        addbtn.addActionListener(e -> {
            try{
               int num = Integer.parseInt((inputField.getText()));


               arr[currentIndex] = num;
               currentIndex++;
               inputField.setText("");

               if(currentIndex == 10){
                   addbtn.setEnabled(false);
                   resultField.setText(Arrays.toString(arr));
               }

            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(f,"ERROR: Please Enter a Valid Integer.");
            }
        });

        resetbtn.addActionListener(e-> {
            arr = new int[10];
            currentIndex = 0;
            addbtn.setEnabled(true);
            resultField.setText("");
            inputField.setText("");
        });

        f.setSize(350,150);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
