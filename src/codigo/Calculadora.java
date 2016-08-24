package codigo;

import java.awt.*;

import javax.swing.*;

class Calculadora {
	public static void main(String[] args) {
		Marco calculadora=new Marco();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setVisible(true);
	}
}

class Marco extends JFrame{
	public Marco(){
		setTitle ("Calculadora");
		setBounds (500,300,400,300);
		Lamina lamina=new Lamina();
		add(lamina);
	}
}

class Lamina extends JPanel{
	private JPanel Lamina2=new JPanel();
	
	public Lamina(){
		setLayout(new BorderLayout());
		JButton pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add (pantalla, BorderLayout.NORTH);
		Lamina2.setLayout(new GridLayout(4,4));
		
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
		ponerBoton("-");
		ponerBoton("0");
		ponerBoton("c");
		ponerBoton("=");
		ponerBoton("+");
		
		add(Lamina2,BorderLayout.CENTER);
		
	}
	private void ponerBoton(String rotulo){
		JButton boton=new JButton(rotulo);
		Lamina2.add(boton);
	}
}