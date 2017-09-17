package Log_In;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class Created_Quizez {

	private static JFrame frame;
	private quiz_file_teacher obj2;

	/**
	 * Launch the application.
	 */
	public static void Display_Created_Quizez_to_Teacher() {
	
		
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public Created_Quizez( boolean x) {
		obj2=new quiz_file_teacher();
		
		initialize(x);
	}
	//constructor
	public Created_Quizez()
	{
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(boolean x) {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	if(x)
	{
		JButton btnCreateNewQuiz = new JButton("Create New Quiz");
		btnCreateNewQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuizTitle obj=new QuizTitle();
				obj.QuizTitleScreen();
			}
		});
		
		
		
		
		btnCreateNewQuiz.setBounds(22, 24, 113, 43);
		frame.getContentPane().add(btnCreateNewQuiz);
	}
	
	else
	{
		JLabel lblAttemptAQuiz = new JLabel("Attempt a Quiz");
		lblAttemptAQuiz.setBounds(214, 49, 163, 14);
		frame.getContentPane().add(lblAttemptAQuiz);
	}
		JPanel panel = new JPanel();
		panel.setBounds(27, 89, 494, 326);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fazeel obj=new Fazeel();
				obj.main(null);
			}
		});
		btnLogOut.setBounds(420, 426, 101, 27);
		frame.getContentPane().add(btnLogOut);
		
		
		

		
		for(int i=0;i<obj2.paths.length;i++)
		{
			JButton btnQuiz_2 = new JButton(obj2.paths[i]);
			btnQuiz_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Quiz_Display obj;
				try {
					System.out.println("New window opening");
					obj = new Quiz_Display(btnQuiz_2.getText(), x);
					obj.quiz_display_main();
					System.out.println("New window closing");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					
				}
			});

			panel.add(btnQuiz_2);
			
		}
		
		

		
		
		
	}
}
