package DesignPatterns;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DesignPatterns {

	private JFrame frmCalculatorPretHaine;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignPatterns window = new DesignPatterns();
					window.frmCalculatorPretHaine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DesignPatterns() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorPretHaine = new JFrame();
		frmCalculatorPretHaine.setTitle("Calculator Pret Haine");
		frmCalculatorPretHaine.setBounds(100, 100, 450, 205);
		frmCalculatorPretHaine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatorPretHaine.getContentPane().setLayout(null);
		
		String [] art={"Costum barbatesc", "Costum femeiesc", "Camasa", "Fusta"};
		
		JComboBox<String> comboBox = new JComboBox<>(art);
		
		comboBox.setBounds(10, 27, 150, 20);
		frmCalculatorPretHaine.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Alegeti Tipul");
		lblNewLabel.setBounds(10, 2, 137, 29);
		frmCalculatorPretHaine.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Alegeti personalizari");
		lblNewLabel_1.setBounds(226, 2, 150, 29);
		frmCalculatorPretHaine.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxStofa = new JCheckBox("Stofa Premium");
		chckbxStofa.setBounds(226, 38, 202, 23);
		frmCalculatorPretHaine.getContentPane().add(chckbxStofa);
		
		JCheckBox chckbxNasturi = new JCheckBox("Nasturi filigran aur");
		chckbxNasturi.setBounds(226, 64, 202, 23);
		frmCalculatorPretHaine.getContentPane().add(chckbxNasturi);
		
		JCheckBox chckbxCaptuseala = new JCheckBox("Captuseala bumbac organic");
		chckbxCaptuseala.setBounds(226, 90, 202, 23);
		frmCalculatorPretHaine.getContentPane().add(chckbxCaptuseala);
		
		JCheckBox chckbxAplicatii = new JCheckBox("Aplicatii decorative");
		chckbxAplicatii.setBounds(226, 116, 202, 23);
		frmCalculatorPretHaine.getContentPane().add(chckbxAplicatii);
		
		JLabel labelPret = new JLabel("");
		labelPret.setBounds(10, 106, 210, 33);
		frmCalculatorPretHaine.getContentPane().add(labelPret);
		
		JButton btnCalculeazaPret = new JButton("Calculeaza Pret");
		btnCalculeazaPret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Articol articol = GenerateAndDecorate(comboBox.getSelectedItem().toString(), chckbxStofa.isSelected(), chckbxNasturi.isSelected(), chckbxCaptuseala.isSelected(), chckbxAplicatii.isSelected());
				System.out.println(articol.getPrice());
				System.out.println(articol instanceof DecoratorStofa);
				
				labelPret.setText("Pret Final cu discount: " + Integer.toString(CalculateDiscount(articol.getPrice(), getStrategy(chckbxStofa.isSelected(), chckbxNasturi.isSelected(), chckbxCaptuseala.isSelected(), chckbxAplicatii.isSelected()))));
			}
		});
		
		btnCalculeazaPret.setBounds(20, 64, 107, 23);
		frmCalculatorPretHaine.getContentPane().add(btnCalculeazaPret);
		
	
	}
	
	public Articol GenerateAndDecorate(String tipArticol, boolean Stofa, boolean Nasturi, boolean Captuseala, boolean Aplicatii){
		Articol articol = ArticolFactory.genereazaArticol(tipArticol);
		if(Stofa)
			articol = new DecoratorStofa(articol);
		if(Nasturi)
			articol = new DecoratorNasturi(articol);
		if(Captuseala)
			articol = new DecoratorCaptuseala(articol);
		if(Aplicatii)
			articol = new DecoratorAplicatii(articol);
		return articol;
	}
	
	public String getStrategy(boolean Stofa, boolean Nasturi, boolean Captuseala, boolean Aplicatii){
		int customization = 0;
		if(Stofa)
			customization++;
		if(Nasturi)
			customization++;
		if(Captuseala)
			customization++;
		if(Aplicatii)
			customization++;
		if(customization == 2)
			return "fixeddiscount";
		if(customization >= 3)
			return "percentdiscount";
		return "nodiscount";
	}
	
	public int CalculateDiscount(int price, String strategy){
		DiscountContext dctx = new DiscountContext();
		System.out.println(strategy);
		if(strategy.equalsIgnoreCase("nodiscount"))
			dctx.setDiscountStrategy(new NoDiscount());
		if(strategy.equalsIgnoreCase("fixeddiscount"))
			dctx.setDiscountStrategy(new FixedDiscount());
		if(strategy.equalsIgnoreCase("percentdiscount"))
			dctx.setDiscountStrategy(new PercentDiscount());
		return dctx.getPriceWithDiscount(price);
	}
}
