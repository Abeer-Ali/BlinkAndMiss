import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ControlPane {

	private JFrame frame;
	private JButton [] board = new JButton[64];
			private int[] solution = new int[64];
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlPane window = new ControlPane();
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
	public ControlPane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 540, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 372, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(8, 8, 0, 0));
		for(int i=0;i<64;i++)
		{
			solution[i]=0;
			board[i]=new JButton();
			board[i].setEnabled(false);
			board[i].setBackground(Color.white);
			board[i].addActionListener(new ActionListener(){
				private boolean isSelected=false;
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JButton source = (JButton)s.getSource();
					if(!(isSelected))
					{
						isSelected=true;
						source.setBackground(Color.BLUE);
					}else
					{
						isSelected=false;
						source.setBackground(Color.white);
					}
				} 
			}
					);
			panel.add(board(i));
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(362, 0, 152, 441);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(0, 5, 152, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 39, 152, 23);
		panel_1.add(btnNewButton_1);
		label.setBounds(10, 73, 46, 14);
		panel_1.add(label);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				JSlider source= (JSlider)arg0.getSource();
			}
		});
		slider.setBounds(10, 119, 142, 26);
		panel_1.add(slider);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 187, 152, 254);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 5, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(96, 5, 46, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(96, 30, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 30, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(96, 55, 46, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(10, 55, 46, 14);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(96, 73, 46, 14);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_1);
	}
}
