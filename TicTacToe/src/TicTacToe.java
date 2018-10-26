

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TicTacToe extends JFrame {

	JFrame frame = new JFrame("TicTacToe");
    JButton[][] b = new JButton[3][3];
    
	public TicTacToe() //Constructs the Frame
	{
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	public void initializer() //Puts the buttons on the board
	{
		  JPanel mainPanel = new JPanel(new BorderLayout());         
	      JPanel game = new JPanel(new GridLayout(3,3));                     

	      frame.add(mainPanel);                                         

	      mainPanel.setPreferredSize(new Dimension(325,425));
	      game.setPreferredSize(new Dimension(300,300));
	      
	      mainPanel.add(game, BorderLayout.SOUTH);

		
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
			{
				b[i][j] = new JButton();                
		        b[i][j].setText("");
		        b[i][j].setVisible(true);
		        
		        game.add(b[i][j]);
		        
		        MouseListener listener = new Click();
		        b[i][j].addMouseListener(listener); 
		        b[i][j].setBackground(Color.white);
		        
			}
		
	}
	
	class Click implements MouseListener //Adds the MouseClicks
	{
				
		@Override
		public void mouseClicked(MouseEvent e) {
			  if ((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[0][0])
				  {
					  b[0][0].setText("X");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[0][0])
				  {
					  b[0][0].setText("O");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[1][1])
				  {
					  b[1][1].setText("X");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[1][1])
				  {
					  b[1][1].setText("O");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[2][2])
				  {
					  b[2][2].setText("X");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[2][2])
				  {
					  b[2][2].setText("O");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[1][0])
				  {
					  b[1][0].setText("X");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[1][0])
				  {
					  b[1][0].setText("O");
					  CheckWin();
				  	  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[2][0])
				  {
					  b[2][0].setText("X");
					  CheckWin();
					  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[2][0])
				  {
					  b[2][0].setText("O");
					  CheckWin();
					  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[0][1])
				  {
					  b[0][1].setText("X");
					  CheckWin();
					  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[0][1])
				  {
					  b[0][1].setText("O");
					  CheckWin();
					  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[0][2])
				  {
					  b[0][2].setText("X");
					  CheckWin();
					  return;
			      }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[0][2])
				  {
					  b[0][2].setText("O");
					  CheckWin();
					  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[1][2])
				  {
					  b[1][2].setText("X");
					  CheckWin();
					  return;
			      }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[1][2])
				  {
					  b[1][2].setText("O");
					  CheckWin();
					  return;
				  }
			  if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
				  if(e.getSource() == b[2][1])
				  {
					  b[2][1].setText("X");
					  CheckWin();
					  return;
			      }
			  if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
				  if(e.getSource() == b[2][1])
				  {
					  b[2][1].setText("O");
					  CheckWin();
					  return;
				  }
			  
		}
		@Override
		public void mouseEntered(MouseEvent e){}
		@Override
		public void mouseExited(MouseEvent e){}
		@Override
		public void mousePressed(MouseEvent e){}
		@Override
		public void mouseReleased(MouseEvent e){}
	}
	
	
	public void CheckWin() //Checks if you win
	{
		if(b[0][0].getText().contains("X") && b[1][0].getText().contains("X") && b[2][0].getText().contains("X"))
			XWins();
		if(b[1][0].getText().contains("X") && b[1][1].getText().contains("X") && b[1][2].getText().contains("X"))
			XWins();
		if(b[2][0].getText().contains("X") && b[2][1].getText().contains("X") && b[2][2].getText().contains("X"))
			XWins();
		if(b[0][0].getText().contains("X") && b[0][1].getText().contains("X") && b[0][2].getText().contains("X"))
			XWins();
		if(b[0][1].getText().contains("X") && b[1][1].getText().contains("X") && b[2][1].getText().contains("X"))
			XWins();
		if(b[0][2].getText().contains("X") && b[1][2].getText().contains("X") && b[2][2].getText().contains("X"))
			XWins();
		if(b[0][0].getText().contains("X") && b[1][1].getText().contains("X") && b[2][2].getText().contains("X"))
			XWins();
		if(b[0][2].getText().contains("X") && b[1][1].getText().contains("X") && b[2][0].getText().contains("X"))
			XWins();
		if(b[0][0].getText().contains("O") && b[1][0].getText().contains("O") && b[2][0].getText().contains("O"))
			OWins();
		if(b[1][0].getText().contains("O") && b[1][1].getText().contains("O") && b[1][2].getText().contains("O"))
			OWins();
		if(b[2][0].getText().contains("O") && b[2][1].getText().contains("O") && b[2][2].getText().contains("O"))
			OWins();
		if(b[0][0].getText().contains("O") && b[0][1].getText().contains("O") && b[0][2].getText().contains("O"))
			OWins();
		if(b[0][1].getText().contains("O") && b[1][1].getText().contains("O") && b[2][1].getText().contains("O"))
			OWins();
		if(b[0][2].getText().contains("O") && b[1][2].getText().contains("O") && b[2][2].getText().contains("O"))
			OWins();
		if(b[0][0].getText().contains("O") && b[1][1].getText().contains("O") && b[2][2].getText().contains("O"))
			OWins();
		if(b[0][2].getText().contains("O") && b[1][1].getText().contains("O") && b[2][0].getText().contains("O"))
			OWins();
	}
	
	public void XWins() //Spams "X Wins!"
	{
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				b[i][j].setText("X Wins!");
	}
	
	public void OWins()//Spams "O Wins!"
	{
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				b[i][j].setText("O Wins!");
	}
	
	
	public static void main(String[] args) //Actually makes the stuff happen
	{
		TicTacToe game = new TicTacToe();
		game.initializer();
	}

	

}

