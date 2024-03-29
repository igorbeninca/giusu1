/*
 * Created by JFormDesigner on Wed Mar 11 16:18:08 BRT 2015
 */

package br.UFSC.GRIMA.visual;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Lucas
 */
public class ConnectWindow extends JFrame {
	public ConnectWindow() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		splitPane1 = new JSplitPane();
		panel2 = new JPanel();
		panel1 = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField3 = new JTextField();
		button1 = new JToggleButton();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setLayout(new GridBagLayout());
			((GridBagLayout)dialogPane.getLayout()).columnWidths = new int[] {0, 0};
			((GridBagLayout)dialogPane.getLayout()).rowHeights = new int[] {150, 0};
			((GridBagLayout)dialogPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
			((GridBagLayout)dialogPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

			//======== splitPane1 ========
			{
				splitPane1.setOrientation(JSplitPane.VERTICAL_SPLIT);
				splitPane1.setOneTouchExpandable(true);

				//======== panel2 ========
				{
					panel2.setLayout(new GridBagLayout());
					((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
					((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
					((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0, 1.0E-4};
					((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

					//======== panel1 ========
					{
						panel1.setLayout(new GridBagLayout());
						((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0, 155, 0, 0, 0, 0};
						((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
						((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
						((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

						//---- label1 ----
						label1.setText("IP:");
						panel1.add(label1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 5, 5), 0, 0));

						//---- textField1 ----
						textField1.setText("150.162.105.71");
						panel1.add(textField1, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 5, 5), 0, 0));

						//---- label3 ----
						label3.setText("Porta Webcam:");
						panel1.add(label3, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 5, 5), 0, 0));

						//---- textField3 ----
						textField3.setText("20000");
						panel1.add(textField3, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 5, 5), 0, 0));
					}
					panel2.add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- button1 ----
					button1.setText("Start Server!");
					panel2.add(button1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));
				}
				splitPane1.setTopComponent(panel2);

				//======== scrollPane1 ========
				{
					scrollPane1.setViewportView(textPane1);
				}
				splitPane1.setBottomComponent(scrollPane1);
			}
			dialogPane.add(splitPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JSplitPane splitPane1;
	private JPanel panel2;
	private JPanel panel1;
	private JLabel label1;
	public JTextField textField1;
	private JLabel label3;
	public JTextField textField3;
	public JToggleButton button1;
	private JScrollPane scrollPane1;
	public JTextPane textPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
