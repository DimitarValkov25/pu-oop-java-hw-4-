import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

class GameBoard extends JFrame {

	private Random playerPosition =new Random();
	GameBoard() {
		setSize(new Dimension(64*8, 64*8));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	

	@Override
	public void paint(Graphics g) {

		super.paint(g);
	
		fillBoard(g);
		renderUnknowTeritory(g);
		renderUnknowTeritory(g);
		renderGpsCordinates(g);
		renderPlayer(g);
		
	
		
	}

	public void fillBoard(Graphics g) {
		for (int j = 0; j < 8; j++) {

			for (int i = 0; i < 8; i++) {
				
			renderSquare(g, i, j, Color.red);
					
			}

		}
		
		
		
	}
	public void renderSquare(Graphics g, int row, int col, Color c) {

		g.setColor(c);
	g.fill3DRect(row*64,col*64,64,64,true);

		
	

	}
	public void renderUnknowTeritory(Graphics g) {
		int row[]= {4 ,7 ,0, 7, 4};
		int col[]= {1, 2, 5, 5, 6};
		
		for(int i=0;i<row.length;i++) {
			renderSquare(g,row[i],col[i],Color.blue);
		}
		
		
	}
	public void renderGpsCordinates(Graphics g) {
		int row[]= {6,1,5,1,3,6,2,6};
		int col[]= {0,1,2,3,3,4,5,7};
		
		for(int i=0;i<col.length;i++) {
			renderSquare(g,row[i],col[i],Color.green);
		}
		
	}
	public void renderPlayer(Graphics g) {
		int row[] = {0,0,7,7};
		int col[] = {0,7,0,7};
	
		
		int randomPlayerPosition =playerPosition.nextInt(row.length);
			
		renderSquare(g,row[randomPlayerPosition],col[randomPlayerPosition],Color.yellow);
		
		
	}
	
	

	

}
