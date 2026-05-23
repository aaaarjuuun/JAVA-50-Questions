import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Counter {
    public static void main(String[] args){

        JFrame f = new JFrame("Java Letters Counter");
        f.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(5,30); //5 lines 30 columns
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton calcBtn = new JButton("Calculate");

        JLabel vLable = new JLabel("Vowels");
        JTextField vField = new JTextField(5);
        vField.setEditable(false);

        JLabel cLabel = new JLabel("CONSONANTS");
        JTextField cField = new JTextField(5);
        cField.setEditable(false);

        JLabel sLable = new JLabel("Special");
        JTextField sField = new JTextField(5);
        sField.setEditable(false);

        f.add(scrollPane);
        f.add(calcBtn);
        f.add(vLable);
        f.add(vField);
        f.add(cField);
        f.add(cLabel);
        f.add(sLable);
        f.add(sField);


        calcBtn.addActionListener(e -> {
            String text = textArea.getText().toLowerCase();
            int vowels = 0, consonants = 0, special = 0;

            for(char ch: text.toCharArray()){
                if(ch >= 'a' && ch <= 'z'){
                    if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch =='u'){
                        vowels++;
                    }else{
                        consonants++;
                    }
                }
                else{
                    special++;
                }
            }

            vField.setText(String.valueOf(vowels));
            cField.setText(String.valueOf(consonants));
            sField.setText(String.valueOf(special));
        });

        textArea.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e){
                resetFields();
            }
            public void removeUpdate(DocumentEvent e){
                resetFields();
            }
            public void changedUpdate(DocumentEvent e){
                resetFields();
            }

            private void resetFields(){
                vField.setText("0");
                cField.setText("0");
                sField.setText("0");
            }
        });

        f.setSize(380,250);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
