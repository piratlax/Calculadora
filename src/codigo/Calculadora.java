package codigo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JButton pantalla;
	private boolean inicio;
	
	public Lamina(){
		inicio=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add (pantalla, BorderLayout.NORTH);
		Lamina2.setLayout(new GridLayout(4,4));
		ActionListener insertar=new InsertaNumero();
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		//ponerBoton("/");
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		//ponerBoton("*");
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		//ponerBoton("-");
		ponerBoton("0",insertar);
		ponerBoton(".",insertar);
		//ponerBoton("=");
		//ponerBoton("+");
		
		add(Lamina2,BorderLayout.CENTER);
		
	}
	private void ponerBoton(String rotulo, ActionListener oyente){
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		Lamina2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada=e.getActionCommand();
			if (inicio){
				pantalla.setText("");
				inicio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);
		}
		
	}
}