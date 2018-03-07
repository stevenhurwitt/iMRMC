package mrmc.gui;

import javax.swing.*;

import java.awt.Desktop;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import mrmc.core.MRMC;

/**
 * Top menu bar with drop-down menu button displaying information about
 * application.
 * 
 * @author Xin He, Ph.D,
 * @author Brandon D. Gallas, Ph.D
 * @author Rohan Pathare
 */
public class GUImenubar {
	private MRMC lst;
	private JMenuBar menuBar = new JMenuBar();
	private String Ref = "1. A Probabilistic Development of the MRMC Method, Eric Clarkson, Matthew A.Kupinski,\n"
			+ "   Harrison H. Barrett, Academic Radiology. 2006 Mar;13(3):353-62.\n"
			+ "2. One-Shot Estimate of MRMC Variance: AUC, Brandon D. Gallas, Academic Radiology 13,\n"
			+ "   pp. 353-362, 2006.\n"
			+ "3. Reader studies for validation of CAD systems, Brandon D. Gallas, David G. Brown,\n"
			+ "   Neural Networks, 21,387-397, 2008)\n"
			+ "4. A Framework for Random-Effects ROC Analysis: Biases with the Bootstrap and Other\n"
			+ "   Variance Estimators, Communications in Statistics-Theory and Methods,38: 2586-2603,\n"
			+ "   2009.\n"
			+ "5. Power Estimation for the Dorfman-Berbaum-Metz Method,Hillis, S. L. & Berbaum, K. S.,\n"
			+ "   Acad Radiol 11(11), 1260-1273, 2004.\n"
			+ "6. A Comparison of the Dorfman-Berbaum-Metz and Obuchowski-Rockette Methods for Receiver\n"
			+ "   Operating Characteristic (ROC) Data, Hillis, S. L., Obuchowski, N. A., Schartz, K. M.,\n"
			+ "   and Berbaum, K. S. (2005), Stat Med 24(10), 1579-1607.\n"
			+ "7. Multireader, Multimodality Receiver Operating Characteristic Curve Studies: Hypothesis\n"
			+ "   Testing and Sample Size Estimation Using an Analysis of Variance Approach with Dependent\n"
			+ "   Observations,Obuchowski, N. A., Acad Radiol 2(Suppl 1), S22-S29.\n"
			+ "8. Receiver operating characteristic rating analysis: generalization to the population of\n"
			+ "   readers and patients with the jackknife method, D. D. Dorfman, K. S. Berbaum, and C. E.\n"
			+ "   Metz, Invest. Radiol. 27, 723-731 (1992).\n";

	/**
	 * Sole constructor. Creates top level menu bar with drop down menus
	 * 
	 * @param lsttemp This application frame
	 */
	public GUImenubar(MRMC lsttemp) {
		lst = lsttemp;
		createMenuBar();
	}

	/**
	 * Gets the menubar object
	 * 
	 * @return The menubar object
	 */
	public JMenuBar getMenuBar() {
		return menuBar;
	}

	/**
	 * Handler for "Reference" menu button
	 */
	class menuRefListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Ref clicked");
			// Create Desktop object
			Desktop d=Desktop.getDesktop();

			// Browse a URL, say google.com
			try {
				d.browse(new URI("http://didsr.github.io/iMRMC/000_iMRMC/userManualHTML/7_1_references.htm?ms=AA%3D%3D&st=MA%3D%3D&sct=MA%3D%3D&mw=MjQw"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

	/**
	 * Handler for "Website" menu button.
	 */
	class menuAboutListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Website clicked");

			// Create Desktop object
			Desktop d=Desktop.getDesktop();

			// Browse a URL, say google.com
			try {
				d.browse(new URI("https://github.com/DIDSR/iMRMC"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	/**
	 * Handler for "Report Issue" menu button.
	 */
	class menuIssueListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Report Issue clicked");

			// Create Desktop object
			Desktop d=Desktop.getDesktop();

			// Browse a URL, say google.com
			try {
				d.browse(new URI("https://github.com/DIDSR/iMRMC/issues"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	/**
	 * Handler for "Download User Manual" menu button
	 */
	class menuManualListener implements ActionListener {
		JFrame frame2 = new JFrame("Download Manual");

		public void actionPerformed(ActionEvent event) {
			System.out.println("Download Manual about clicked");
			// Create Desktop object
			Desktop d=Desktop.getDesktop();
			try {
				d.browse(new URI("https://github.com/DIDSR/iMRMC/raw/gh-pages/000_iMRMC/userManualPDF/iMRMCuserManual.pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	/**
	 * Creates and initializes the menubar items
	 */
	private void createMenuBar() {
		JMenu menu;
		JMenuItem menuItem;
		menu = new JMenu("Help and Info");
		menuBar.add(menu);

		menuItem = new JMenuItem("Related References");
		menuItem.addActionListener(new menuRefListener());
		menu.add(menuItem);
		menuItem = new JMenuItem("Website");
		menuItem.addActionListener(new menuAboutListener());
		menu.add(menuItem);
		menuItem = new JMenuItem("Download User Manual");
		menuItem.addActionListener(new menuManualListener());
		menu.add(menuItem);
		menuItem = new JMenuItem("Report Issue");
		menuItem.addActionListener(new menuIssueListener());
		menu.add(menuItem);
	}

}
