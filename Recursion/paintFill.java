package Recursion;

public class paintFill {
	enum Color{
		Balck, White, Green, Yellow, Red;
	}
	
	public boolean pFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
		if(x < 0 || x > screen[0].length || y < 0 || y > screen.length){
			return false;
		}
		
		if(screen[y][x] == ocolor){
			screen[y][x] = ncolor;
			pFill(screen, x - 1, y, ocolor, ncolor);
			pFill(screen, x + 1, y, ocolor, ncolor);
			pFill(screen, x, y - 1, ocolor, ncolor);
			pFill(screen, x, y + 1, ocolor, ncolor);
		}
		return true;
	}
	public boolean pFill(Color[][] screen, int x, int y, Color ncolor){
		return pFill(screen, x, y, screen[y][x], ncolor);
	}
	
}
