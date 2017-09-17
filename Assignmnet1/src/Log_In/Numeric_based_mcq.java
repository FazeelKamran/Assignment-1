package Log_In;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Numeric_based_mcq {

	private JFrame frame;
	private JTextField textField;
	private static String Fname;
	/**
	 * Launch the application.
	 */
	public static void Write_Numeric_based_mcq_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numeric_based_mcq window = new Numeric_based_mcq(Fname);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Numeric_based_mcq(String f) {
		Fname = f;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(41, 38, 461, 143);
		frame.getContentPane().add(textPane);
		
		JLabel lblEnterTheMcq = new JLabel("Enter the Question.");
		lblEnterTheMcq.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEnterTheMcq.setBounds(42, 21, 196, 14);
		frame.getContentPane().add(lblEnterTheMcq);
		
		JLabel lblAnswer = new JLabel("Correct Answer:");
		lblAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAnswer.setBounds(41, 247, 116, 14);
		frame.getContentPane().add(lblAnswer);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(147, 201, 196, 108);
		frame.getContentPane().add(textPane_1);
		
		textField = new JTextField();
		textField.setBounds(441, 201, 61, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMaxMarks = new JLabel("Max. Marks:");
		lblMaxMarks.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMaxMarks.setBounds(363, 203, 106, 14);
		frame.getContentPane().add(lblMaxMarks);
		
		JButton btnNewQuestion = new JButton("New Question");
		btnNewQuestion.setForeground(Color.WHITE);
		btnNewQuestion.setBackground(Color.DARK_GRAY);
		btnNewQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textPane.getText().isEmpty() && !textPane_1.getText().isEmpty() && !textField.getText().isEmpty())
				{
					make_quiz object=new make_quiz(Fname) ;
					
				 object.make_quiz_function(textPane.getText(),""," "," "," ",textPane_1.getText(),textField.getText()); 
				frame.dispose();
				QuizGenerationByTeacher obj=new QuizGenerationByTeacher(Fname);
				obj.Question_Type_Screen();
				}
			}
		});
		btnNewQuestion.setBounds(386, 348, 116, 23);
		frame.getContentPane().add(btnNewQuestion);
	}

}
