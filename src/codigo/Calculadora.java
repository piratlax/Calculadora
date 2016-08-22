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
	JPanel milamina2=new JPanel();
	
	public Lamina(){
		setLayout(new BorderLayout());
		
		JButton pantalla=new JButton("0");
		add (pantalla,BorderLayout.NORTH);
		pantalla.setEnabled(false);
		milamina2.setLayout(new GridLayout(4,4));
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("+");
		ponerBoton("-");
		ponerBoton("=");
		
		add(milamina2, BorderLayout.CENTER);
		
		
	}
	private void ponerBoton(String Rotulo){
		JButton boton = new JButton(Rotulo);
		milamina2.add(boton);
	}
}