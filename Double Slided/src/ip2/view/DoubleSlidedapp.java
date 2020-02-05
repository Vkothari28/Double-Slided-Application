package ip2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ip2.controller.FlipController;
import ip2.controller.ResetController;
import ip2.controller.WinGameController;
//import ip2.controller.FlipController;
import ip2.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DoubleSlidedapp extends JFrame {

	private JPanel contentPane;
	PuzzleView panel;
	 Model model;
	 JButton btnReset = new JButton("Reset");
		
		JLabel lblMoveCount = new JLabel("Move Count");
		
		JLabel numberMoveslabel = new JLabel("New label");
		

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DoubleSlidedapp(Model model) {
		this.model=model;
		setResizable(false);
		setTitle("Double Slided");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		setContentPane(contentPane);
		
		 panel = new PuzzleView(model);
		 panel.addMouseListener((MouseListener) new FlipController(this,model));
		 panel.addMouseListener(new WinGameController(model, this));
		
		
		
		JLabel Congratulations = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Congratulations, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblMoveCount, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addComponent(numberMoveslabel)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addComponent(Congratulations, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMoveCount)
						.addComponent(numberMoveslabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(71))
		);
		contentPane.setLayout(gl_contentPane);
		btnReset = new JButton("Reset");
		btnReset.setBounds(495, 300, 70, 20);
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Create a confirmation box to make sure the user wants to reset the puzzle
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(DoubleSlidedapp.this, "Would you like to reset?", "Warning", dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
					new ResetController(model, DoubleSlidedapp.this).resetPuzzle();
				}
			}
		});
		contentPane.add(btnReset);
		
		
	}
	
	public void setCounterText(String msg) {
		lblMoveCount.setText(msg);
	
	
	}
	
	public JLabel getMovesLabel () {
		return numberMoveslabel;
	}
	
	/**
	 * Get the panel that holds the drawn tiles.
	 * @return
	 */
	public PuzzleView getPanel () {
		return panel;
	}
	
	/**
	 * Get the button, that when pressed, resets the configuration of the tiles.
	 * @return
	 */
	public JButton getResetButton () {
		return btnReset;
	}
}


