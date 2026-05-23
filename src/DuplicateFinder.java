import javax.swing.*;
import java.awt.*;

public class DuplicateFinder {
    public static void main(String[] args){
        JFrame f = new JFrame("JAVA DUPLICATE FINDER");
        f.setLayout(new FlowLayout());

        JTextField[] inputs = new JTextField[8];
        JPanel panel = new JPanel();

        for(int i=0; i<8;i++){
            inputs[i] = new JTextField(3);
            panel.add(inputs[i]);
        }

        JButton findBtn = new JButton("FIND");

        f.add(panel);
        f.add(findBtn);

        findBtn.addActionListener(e->{

            try{
                int[] arr = new int[8];
                boolean[] isDuplicate = new boolean[8];

                for(int i=0;i<8;i++){
                    arr[i] = Integer.parseInt(inputs[i].getText());
                    inputs[i].setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
                }

                for(int i=0;i<8;i++){
                    for(int j= i+1;j<8;j++){
                        if(arr[i] == arr[j]){
                            isDuplicate[i]  = true;
                            isDuplicate[j] = true;
                        }
                    }
                }

                for(int i= 0; i<8; i++){
                    if(isDuplicate[i]){
                        inputs[i].setBorder(BorderFactory.createLineBorder(Color.red,2));
                    }
                }
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(f,"ERROR : Please Enter a valid Number");

            }
        });

        f.setSize(480,180);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
