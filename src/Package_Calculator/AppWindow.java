package Package_Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Created by tim_l on 17.11.2016.
 */
public class AppWindow extends JFrame{

    private Arithmetics arithmetics = new Arithmetics();

    private JTextField textfield;
    private JButton buttonZero;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonCalculate;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonSquare;
    private JButton buttonSquareRoot;
    private JButton buttonDeleteAll;
    private JButton buttonDelete;
    private JButton buttonBack;
    private JButton buttonComma;
    private JButton buttonPrefix;
    private JButton buttonDecimal;
    private JButton buttonHexaDecimal;
    private JButton buttonBinary;

    public AppWindow() {
        this.getContentPane().setLayout(null);
        this.initWindow();
        this.addWindowListener(new WindowListener() {

            public void windowClosed(WindowEvent arg0) {

            }

            public void windowActivated(WindowEvent e) {

            }

            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }

            public void windowDeactivated(WindowEvent e) {

            }

            public void windowDeiconified(WindowEvent e) {

            }

            public void windowIconified(WindowEvent e) {

            }

            public void windowOpened(WindowEvent e) {

            }
        });
    }

    private void initWindow() {

        // built instance of textfield and buttons
        textfield = new JTextField();
        buttonZero = new JButton("0");
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonA = new JButton("A");
        buttonB = new JButton("B");
        buttonC = new JButton("C");
        buttonD = new JButton("D");
        buttonE = new JButton("E");
        buttonF = new JButton("F");
        buttonCalculate = new JButton("=");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonSquare = new JButton("x²");
        buttonSquareRoot = new JButton("\u221A");
        buttonDeleteAll = new JButton("C");
        buttonDelete = new JButton("CE");
        buttonBack = new JButton("\u21E6");
        buttonComma = new JButton(",");
        buttonPrefix = new JButton("+/-");
        buttonDecimal = new JButton("dec");
        buttonHexaDecimal = new JButton("hex");
        buttonBinary = new JButton("bin");

        // disable manual input from user inside the textfield
        textfield.setEditable(false);
        textfield.setFont(new Font("Arial", Font.BOLD, 20));

        // decimal Code System at the beginning
        buttonDecimal.setEnabled(false);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);

        // add ActionListeners to the buttons
        buttonZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("0");
                updateTextField();
            }
        });

        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("1");
                updateTextField();
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("2");
                updateTextField();
            }
        });

        buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("3");
                updateTextField();
            }
        });

        buttonFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("4");
                updateTextField();
            }
        });

        buttonFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("5");
                updateTextField();
            }
        });

        buttonSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("6");
                updateTextField();
            }
        });

        buttonSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("7");
                updateTextField();
            }
        });

        buttonEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("8");
                updateTextField();
            }
        });

        buttonNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("9");
                updateTextField();
            }
        });

        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("A");
                updateTextField();
            }
        });

        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("B");
                updateTextField();
            }
        });

        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("C");
                updateTextField();
            }
        });

        buttonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("D");
                updateTextField();
            }
        });

        buttonE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("E");
                updateTextField();
            }
        });

        buttonF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("F");
                updateTextField();
            }
        });

        buttonCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.doWork();
                updateTextField();
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeOperand("+");
                updateTextField();
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeOperand("-");
                updateTextField();
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeOperand("*");
                updateTextField();
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeOperand("/");
                updateTextField();
            }
        });

        buttonSquare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.square();
                updateTextField();
            }
        });

        buttonSquareRoot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.squareRoot();
                updateTextField();
            }
        });

        buttonDeleteAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.clearAll();
                updateTextField();
            }
        });

        buttonDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.clear();
                updateTextField();
            }
        });

        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.goBack();
                updateTextField();
            }
        });

        buttonComma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //DoSthHere
            }
        });

        buttonPrefix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetics.writeNumber("-");
                updateTextField();
            }
        });

        buttonDecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonDecimal.setEnabled(false);
                buttonBinary.setEnabled(true);
                buttonHexaDecimal.setEnabled(true);
                buttonTwo.setEnabled(true);
                buttonThree.setEnabled(true);
                buttonFour.setEnabled(true);
                buttonFive.setEnabled(true);
                buttonSix.setEnabled(true);
                buttonSeven.setEnabled(true);
                buttonEight.setEnabled(true);
                buttonNine.setEnabled(true);
                buttonA.setEnabled(false);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                buttonE.setEnabled(false);
                buttonF.setEnabled(false);
                buttonPrefix.setEnabled(true);
                arithmetics.changeCodeSystem(0);
                updateTextField();
            }
        });

        buttonBinary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonDecimal.setEnabled(true);
                buttonBinary.setEnabled(false);
                buttonHexaDecimal.setEnabled(true);
                buttonTwo.setEnabled(false);
                buttonThree.setEnabled(false);
                buttonFour.setEnabled(false);
                buttonFive.setEnabled(false);
                buttonSix.setEnabled(false);
                buttonSeven.setEnabled(false);
                buttonEight.setEnabled(false);
                buttonNine.setEnabled(false);
                buttonA.setEnabled(false);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                buttonE.setEnabled(false);
                buttonF.setEnabled(false);
                buttonPrefix.setEnabled(false);
                arithmetics.changeCodeSystem(1);
                updateTextField();
            }
        });

        buttonHexaDecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonDecimal.setEnabled(true);
                buttonBinary.setEnabled(true);
                buttonHexaDecimal.setEnabled(false);
                buttonTwo.setEnabled(true);
                buttonThree.setEnabled(true);
                buttonFour.setEnabled(true);
                buttonFive.setEnabled(true);
                buttonSix.setEnabled(true);
                buttonSeven.setEnabled(true);
                buttonEight.setEnabled(true);
                buttonNine.setEnabled(true);
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                buttonE.setEnabled(true);
                buttonF.setEnabled(true);
                buttonPrefix.setEnabled(false);
                arithmetics.changeCodeSystem(2);
                updateTextField();
            }
        });

        // define position of the textfield and buttons
        textfield.setBounds(10, 10, 320, 40);
        buttonZero.setBounds(70, 420, 50, 50);
        buttonOne.setBounds(10, 360, 50, 50);
        buttonTwo.setBounds(70, 360, 50, 50);
        buttonThree.setBounds(130, 360, 50, 50);
        buttonFour.setBounds(10, 300, 50, 50);
        buttonFive.setBounds(70, 300, 50, 50);
        buttonSix.setBounds(130, 300, 50, 50);
        buttonSeven.setBounds(10, 240, 50, 50);
        buttonEight.setBounds(70, 240, 50, 50);
        buttonNine.setBounds(130, 240, 50, 50);
        buttonA.setBounds(10, 180, 50, 50);
        buttonB.setBounds(70, 180, 50, 50);
        buttonC.setBounds(130, 180, 50, 50);
        buttonD.setBounds(10, 120, 50, 50);
        buttonE.setBounds(70, 120, 50, 50);
        buttonF.setBounds(130, 120, 50, 50);
        buttonCalculate.setBounds(190, 420, 50, 50);
        buttonAdd.setBounds(190, 240, 50, 50);
        buttonSubtract.setBounds(190, 180, 50, 50);
        buttonMultiply.setBounds(190, 120, 50, 50);
        buttonDivide.setBounds(190, 60, 50, 50);
        buttonSquare.setBounds(190, 300, 50, 50);
        buttonSquareRoot.setBounds(190, 360, 50, 50);
        buttonDeleteAll.setBounds(70, 60, 50, 50);
        buttonDelete.setBounds(10, 60, 50, 50);
        buttonBack.setBounds(130, 60, 50, 50);
        buttonComma.setBounds(130, 420, 50, 50);
        buttonPrefix.setBounds(10, 420, 50, 50);
        buttonDecimal.setBounds(250, 60, 80, 50);
        buttonHexaDecimal.setBounds(250, 120, 80, 50);
        buttonBinary.setBounds(250, 180, 80, 50);

        // add elements to window
        this.getContentPane().add(textfield);
        this.getContentPane().add(buttonZero);
        this.getContentPane().add(buttonOne);
        this.getContentPane().add(buttonTwo);
        this.getContentPane().add(buttonThree);
        this.getContentPane().add(buttonFour);
        this.getContentPane().add(buttonFive);
        this.getContentPane().add(buttonSix);
        this.getContentPane().add(buttonSeven);
        this.getContentPane().add(buttonEight);
        this.getContentPane().add(buttonNine);
        this.getContentPane().add(buttonA);
        this.getContentPane().add(buttonB);
        this.getContentPane().add(buttonC);
        this.getContentPane().add(buttonD);
        this.getContentPane().add(buttonE);
        this.getContentPane().add(buttonF);
        this.getContentPane().add(buttonCalculate);
        this.getContentPane().add(buttonAdd);
        this.getContentPane().add(buttonSubtract);
        this.getContentPane().add(buttonMultiply);
        this.getContentPane().add(buttonDivide);
        this.getContentPane().add(buttonSquare);
        this.getContentPane().add(buttonSquareRoot);
        this.getContentPane().add(buttonDeleteAll);
        this.getContentPane().add(buttonDelete);
        this.getContentPane().add(buttonBack);
        this.getContentPane().add(buttonComma);
        this.getContentPane().add(buttonPrefix);
        this.getContentPane().add(buttonDecimal);
        this.getContentPane().add(buttonHexaDecimal);
        this.getContentPane().add(buttonBinary);
        this.pack();
    }

    private void updateTextField(){
        textfield.setText(arithmetics.getStrLHS() + " " + arithmetics.getStrOperand() + " " + arithmetics.getStrRHS());
    }
}
