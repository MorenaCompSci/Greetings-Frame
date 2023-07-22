
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingsGUI extends JFrame{
    
    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingaAreaPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headinPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //text fields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //text are
    private JTextArea greetingaTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public GreetingsGUI() {
        //Config the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings GUI");
        setSize(700,750);
        setBackground(Color.yellow);
        
        //Create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridBagLayout());
        
        greetingaAreaPnl = new JPanel(new FlowLayout());
        greetingaAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headinPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headinPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //Create the labels
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
        //Create the textfield
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //creaet the text area
        greetingaTxtArea = new JTextArea(40, 500);
        greetingaTxtArea.setEditable(false);
        greetingaTxtArea.setText("Hello [name] [surname]");
        
        //Create the buttons
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //Add name label textfield to name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        //Add surname label textfield to surname panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        //Add name and surname label to collective panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //Add the greetings area to its panel
        greetingaAreaPnl.add(greetingaTxtArea);
        
        //Add the buttons to their Panel
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        //Add all the panels to the main panel
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingaAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //Add the main panel to the Frame panel
        add(headinPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        //make the frame visible
        setVisible(true);
        
        
        
    }
    
}
