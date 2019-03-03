import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MyShapeGUI extends JFrame implements ActionListener {
	private final String[] SHAPES_ARR = {"CIRCLE", "LINE", "RECTANGLE", "SQUARE"};
	private JComboBox shapesListBox;
	private JLabel shapesListBoxLabel;
	
	private JLabel xOneLabel;
	private JLabel xTwoLabel;
	private JLabel yOneLabel;
	private JLabel yTwoLabel;
	private JTextField xOneInput;
	private JTextField xTwoInput;
	private JTextField yOneInput;
	private JTextField yTwoInput;
	
	private JLabel shapeLabel;
	private JLabel locationLabel;
	private JLabel areaLabel;
	private JLabel perimeterLabel;
	private JLabel shapeResult;
	private JTextArea locationResult;
	private JLabel areaResult;
	private JLabel perimeterResult;
	
	private JButton getButton;
	private JButton clearButton;
	private JButton exitButton;
	
	private JPanel shapeInputPane;
	private JPanel inputPane;
	private JPanel outputPane;
	private JPanel buttonPane;
	private Container contentPane;
	
	public MyShapeGUI() {
		shapesListBoxLabel = new JLabel("Pick up one shape: ");
		shapesListBox = new JComboBox(SHAPES_ARR);
		shapesListBox.setSelectedIndex(1);
		shapesListBox.addActionListener(this);
		shapeInputPane = new JPanel();
		shapeInputPane.setAlignmentX(Component.RIGHT_ALIGNMENT );
		//Horizontally align shape label and shape combo box
		/*
		shapeInputPane.setLayout(new BoxLayout(shapeInputPane, BoxLayout.LINE_AXIS));
		shapeInputPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		shapeInputPane.add(Box.createHorizontalGlue());*/
		GroupLayout shapeInputPaneLayout = new GroupLayout(shapeInputPane);
		GroupLayout.SequentialGroup shapesListBoxGroup = shapeInputPaneLayout.createSequentialGroup();
		shapesListBoxGroup.addGroup(shapeInputPaneLayout.createParallelGroup(Alignment.BASELINE).
	            addComponent(shapesListBoxLabel).addComponent(shapesListBox));
		/*
		// Create a sequential group for the vertical axis.
	   GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
	
	   // The sequential group contains two parallel groups that align
	   // the contents along the baseline. The first parallel group contains
	   // the first label and text field, and the second parallel group contains
	   // the second label and text field. By using a sequential group
	   // the labels and text fields are positioned vertically after one another.
	   vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
	            addComponent(label1).addComponent(tf1));
	   vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
	            addComponent(label2).addComponent(tf2));
	   layout.setVerticalGroup(vGroup);
		 */
		
		xOneLabel = new JLabel("X1: ");
		xTwoLabel = new JLabel("X2: ");
		yOneLabel = new JLabel("Y1: ");
		yTwoLabel = new JLabel("Y2: ");
		xOneInput = new JTextField("(1,1)");
		xTwoInput = new JTextField();
		yOneInput = new JTextField();
		yTwoInput = new JTextField();
		inputPane = new JPanel();
		
		GroupLayout layout = new GroupLayout(inputPane);
		// Create a sequential group for the horizontal axis.

	   GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
		// Turn on automatically adding gaps between components
	   layout.setAutoCreateGaps(true);
	// The sequential group in turn contains two parallel groups.
	   // One parallel group contains the labels, the other the text fields.
	   // Putting the labels in a parallel group along the horizontal axis
	   // positions them at the same x location.
	   //
	   // Variable indentation is used to reinforce the level of grouping.
	   hGroup.addGroup(layout.createParallelGroup().
			   addComponent(xOneLabel).addComponent(xOneInput).addComponent(yOneLabel).addComponent(yOneInput));
	   hGroup.addGroup(layout.createParallelGroup().
			   addComponent(xTwoLabel).addComponent(xTwoInput).addComponent(yTwoLabel).addComponent(yTwoInput));
	   layout.setHorizontalGroup(hGroup);
	   
	   // Turn on automatically creating gaps between components that touch
	   // the edge of the container and the container.
	   layout.setAutoCreateContainerGaps(true);
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
	            addComponent(xOneLabel).addComponent(yOneLabel));
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
	            addComponent(xOneInput).addComponent(yOneInput));
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
	            addComponent(xTwoLabel).addComponent(yTwoLabel));
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
	            addComponent(xTwoInput).addComponent(yTwoInput));
		
		shapeLabel = new JLabel("Shape: ");
		locationLabel = new JLabel("Location: ");
		areaLabel = new JLabel("Area: ");
		perimeterLabel = new JLabel("Perimeter: ");
		shapeResult = new JLabel();
		locationResult = new JTextArea();
		areaResult = new JLabel();
		perimeterResult = new JLabel();
		outputPane = new JPanel();
		outputPane.add(shapeLabel);
		outputPane.add(locationLabel);
		outputPane.add(areaLabel);
		outputPane.add(perimeterLabel);
		outputPane.add(shapeResult);
		outputPane.add(locationResult);
		outputPane.add(areaResult);
		outputPane.add(perimeterResult);
		
		getButton = new JButton("Get");
		clearButton = new JButton("Clear");
		exitButton = new JButton("Exit");
		buttonPane = new JPanel();
		//Horizontally align buttons in panel
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		buttonPane.add(Box.createHorizontalGlue());
		buttonPane.add(getButton);
		buttonPane.add(clearButton);
		buttonPane.add(exitButton);
		buttonPane.setAlignmentX(Component.CENTER_ALIGNMENT );
		
		
		
		contentPane = getContentPane();
		contentPane.add(shapeInputPane);
		contentPane.add(inputPane);
		contentPane.add(outputPane);
		contentPane.add(buttonPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		//Set Borders
		TitledBorder inputBorder = new TitledBorder("Input Data:");
		TitledBorder outputBorder = new TitledBorder("Result:");
		inputPane.setBorder(inputBorder);
		outputPane.setBorder(outputBorder);
		
		setContentPane(contentPane);
		pack();
		setTitle("Pick up a Shape Application");
	}
	public static void main(String[] args) {
		MyShapeGUI myGUI = new MyShapeGUI();
		myGUI.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		myGUI.setSize( 200, 300 );
		myGUI.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		/*JComboBox cb = (JComboBox)e.getSource();
        String petName = (String)cb.getSelectedItem();
        updateLabel(petName); 
        
        if ("Set".equals(e.getActionCommand())) {
            ListDialog.value = (String)(list.getSelectedValue());
        }
        ListDialog.dialog.setVisible(false);
        
        */
	}
}
