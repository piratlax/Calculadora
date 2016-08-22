package codigo;

import java.awt.*;

import javax.swing.*;

public class Calculadora{
	public static void main(String[] args) {
		Marco calculadora=new Marco();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setVisible(true);
	}
}

class Marco extends JFrame{
	public Marco(){
		setTitle ("Calculadora");
		setBounds (300,500,300,350);
		Lamina lamina=new Lamina();
		add(lamina);
	}
}

class Lamina extends JPanel{
	public Lamina(){
		setLayout(new BorderLayout());
		
		JButton pantalla=new JButton("0");
		add (pantalla,BorderLayout.NORTH);
	}
}