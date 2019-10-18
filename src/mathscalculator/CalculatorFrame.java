
package mathscalculator;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class CalculatorFrame extends JFrame {
    
    public CalculatorFrame() {
        initializeComponents();
        buttonOn.setEnabled(false);
    }
    
    public void arithmeticOperation() {
        switch(calculation) {
            case 1:
                answer = number + Double.parseDouble(screen.getText());
                screen.setText(Double.toString(answer));
            break;
            case 2:
                answer = number - Double.parseDouble(screen.getText());
                screen.setText(Double.toString(answer));
            break;
            case 3:
                answer = number * Double.parseDouble(screen.getText());
                screen.setText(Double.toString(answer));
            break;
            case 4:
                answer = number / Double.parseDouble(screen.getText());
                screen.setText(Double.toString(answer));
            break;
        }
    }
    
    public void switchOn() {
        screen.setEnabled(true);
        buttonOn.setEnabled(false);
        buttonOff.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMultiply.setEnabled(true);
        buttonDivide.setEnabled(true);
        buttonEquals.setEnabled(true);
        buttonPoint.setEnabled(true);
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }
    public void switchOff() {
        screen.setEnabled(false);
        buttonOn.setEnabled(true);
        buttonOff.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMultiply.setEnabled(false);
        buttonDivide.setEnabled(false);
        buttonEquals.setEnabled(false);
        buttonPoint.setEnabled(false);
        button0.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    private void initializeComponents() {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button0 = new JButton();
        buttonPoint = new JButton();
        buttonPlus = new JButton();
        buttonMinus = new JButton();
        buttonDivide = new JButton();
        buttonMultiply = new JButton();
        buttonEquals = new JButton();
        buttonClear = new JButton();
        buttonDelete = new JButton();
        buttonGroup1 = new ButtonGroup();
        buttonOn = new JRadioButton();
        buttonOff = new JRadioButton();
        screen = new JTextField();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        
        screen.setFont(new Font("Tahoma", 1, 23));
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setToolTipText("");
        
        buttonGroup1.add(buttonOn);
        buttonOn.setFont(new Font("Tahoma", 1, 11));
        buttonOn.setText("ON");
        buttonOn.addActionListener((ActionEvent e) -> {
            buttonOnActionPerformed(e);
        });
        
        buttonGroup1.add(buttonOff);
        buttonOff.setFont(new Font("Tahoma", 1, 11));
        buttonOff.setText("OFF");
        buttonOff.addActionListener((ActionEvent e) -> {
            buttonOffActionPerformed(e);
        });
        
        button1.setFont(new Font("Tahoma", 1, 20));
        button1.setText("1");
        button1.addActionListener((ActionEvent e) -> {
            button1ActionPerformed(e);
        });
        
        button2.setFont(new Font("Tahoma", 1, 20));
        button2.setText("2");
        button2.addActionListener((ActionEvent e) -> {
            button2ActionPerformed(e);
        });
        
        button3.setFont(new Font("Tahoma", 1, 20));
        button3.setText("3");
        button3.addActionListener((ActionEvent e) -> {
            button3ActionPerformed(e);
        });
        
        button4.setFont(new Font("Tahoma", 1, 20));
        button4.setText("4");
        button4.addActionListener((ActionEvent e) -> {
            button4ActionPerformed(e);
        });
        
        button5.setFont(new Font("Tahoma", 1, 20));
        button5.setText("5");
        button5.addActionListener((ActionEvent e) -> {
            button5ActionPerformed(e);
        });
        
        button6.setFont(new Font("Tahoma", 1, 20));
        button6.setText("6");
        button6.addActionListener((ActionEvent e) -> {
            button6ActionPerformed(e);
        });
        
        button7.setFont(new Font("Tahoma", 1, 20));
        button7.setText("7");
        button7.addActionListener((ActionEvent e) -> {
            button7ActionPerformed(e);
        });
        
        button8.setFont(new Font("Tahoma", 1, 20));
        button8.setText("8");
        button8.addActionListener((ActionEvent e) -> {
            button8ActionPerformed(e);
        });
        
        button9.setFont(new Font("Tahoma", 1, 20));
        button9.setText("9");
        button9.addActionListener((ActionEvent e) -> {
            button9ActionPerformed(e);
        });
        
        button0.setFont(new Font("Tahoma", 1, 20));
        button0.setText("0");
        button0.addActionListener((ActionEvent e) -> {
            button0ActionPerformed(e);
        });
        
        buttonPoint.setFont(new Font("Tahoma", 1, 20));
        buttonPoint.setText(".");
        buttonPoint.addActionListener((ActionEvent e) -> {
            buttonPointActionPerformed(e);
        });
        
        buttonPlus.setFont(new Font("Tahoma", 1, 20));
        buttonPlus.setText("+");
        buttonPlus.addActionListener((ActionEvent e) -> {
            buttonPlusActionPerformed(e);
        });
        
        buttonMinus.setFont(new Font("Tahoma", 1, 20));
        buttonMinus.setText("-");
        buttonMinus.addActionListener((ActionEvent e) -> {
            buttonMinusActionPerformed(e);
        });
        
        buttonMultiply.setFont(new Font("Tahoma", 1, 20));
        buttonMultiply.setText("*");
        buttonMultiply.addActionListener((ActionEvent e) -> {
            buttonMultiplyActionPerformed(e);
        });
        
        buttonDivide.setFont(new Font("Tahoma", 1, 20));
        buttonDivide.setText("/");
        buttonDivide.addActionListener((ActionEvent e) -> {
            buttonDivideActionPerformed(e);
        });
        
        buttonEquals.setFont(new Font("Tahoma", 1, 20));
        buttonEquals.setText("=");
        buttonEquals.addActionListener((ActionEvent e) -> {
            buttonEqualsActionPerformed(e);
        });
        
        buttonDelete.setFont(new Font("Tahoma", 1, 20));
        buttonDelete.setText("<-");
        buttonDelete.addActionListener((ActionEvent e) -> {
            buttonDeleteActionPerformed(e);
        });
        
        buttonClear.setFont(new Font("Tahoma", 1, 20));
        buttonClear.setText("C");
        buttonClear.addActionListener((ActionEvent e) -> {
            buttonClearActionPerformed(e);
        });
        
        // Layout Manager for the app
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(screen)
                    
            .addGroup(layout.createSequentialGroup()
                .addComponent(button0, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(buttonPoint, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEquals, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(buttonOff)
                .addComponent(buttonOn))
                .addGap(18, 18, 18)
                .addComponent(buttonDelete, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                            
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button8, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
                                
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(buttonMinus, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(buttonMultiply, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
                            
            .addGroup(layout.createSequentialGroup()
                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDivide, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                    
            .addGap(20, 20, 20)
            .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(buttonOn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonOff))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(button0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(33, 33, 33))
        ); // End of Layout Manager for the app
        
        pack();
    }
    
    private void buttonOnActionPerformed(ActionEvent evt) {
        switchOn();
    }
    private void buttonOffActionPerformed(ActionEvent evt) {
        switchOff();
    }
    private void buttonDeleteActionPerformed(ActionEvent evt) {
        int length = screen.getText().length();
        int num = screen.getText().length() - 1;
        String store;
        
        if(length > 0) {
            StringBuilder back = new StringBuilder(screen.getText());
            back.deleteCharAt(num);
            store = back.toString();
            screen.setText(store);
        }
    }
    private void buttonClearActionPerformed(ActionEvent evt) {
        screen.setText(" ");
    }
    private void buttonPlusActionPerformed(ActionEvent evt) {
        number = Double.parseDouble(screen.getText());
        calculation = 1;
        screen.setText("");
    }
    private void buttonMinusActionPerformed(ActionEvent evt) {
        number = Double.parseDouble(screen.getText());
        calculation = 2;
        screen.setText("");
    }
    private void buttonMultiplyActionPerformed(ActionEvent evt) {
        number = Double.parseDouble(screen.getText());
        calculation = 3;
        screen.setText("");
    }
    private void buttonDivideActionPerformed(ActionEvent evt) {
        number = Double.parseDouble(screen.getText());
        calculation = 4;
        screen.setText("");
    }
    private void buttonEqualsActionPerformed(ActionEvent evt) {
        arithmeticOperation();
    }
    private void buttonPointActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + ".");
    }
    private void button0ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "0");
    }
    private void button1ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "1");
    }
    private void button2ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "2");
    }
    private void button3ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "3");
    }
    private void button4ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "4");
    }
    private void button5ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "5");
    }
    private void button6ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "6");
    }
    private void button7ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "7");
    }
    private void button8ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "8");
    }
    private void button9ActionPerformed(ActionEvent evt) {
        screen.setText(screen.getText() + "9");
    }
    
    public static void main(String[] args) {
        // set the Nimbus Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalculatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CalculatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CalculatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CalculatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        } // end of code for Nimbus Look and Feel
        
        EventQueue.invokeLater(() -> {
            new CalculatorFrame().setVisible(true);
        });
    }
    
    private JButton button1, button2, button3, button4, button5, button6, button7,
                    button8, button9, button0, buttonPoint, buttonPlus, buttonMinus,
                    buttonMultiply, buttonDivide, buttonEquals, buttonClear, buttonDelete;
    private JRadioButton buttonOn, buttonOff;
    private ButtonGroup buttonGroup1;
    private JTextField screen;
    private double number, answer;
    private int calculation;
    
}
