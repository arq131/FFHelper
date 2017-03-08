import java.util.Hashtable;

public class Constant {
	Hashtable<Integer, Integer> exp = new Hashtable(71);
	int[] reqexp = {300, 600, 1100, 1700, 2300, 4200, 6000, 7350, 9930,
					11800, 15600, 19600, 23700, 26400, 30500, 35400, 40500, 45700, 51000,
					56600, 63900, 71400, 79100, 87100, 95200, 109800, 124800, 140200, 155900, 
					162500, 175900, 189600, 203500, 217900, 232320, 249900, 267800, 286200, 304900,
					324000, 340200, 356800, 373700, 390800, 408200, 437600, 467500, 498000, 529000, 864000,
					1058400, 1267200, 1555200, 1872000, 2217600, 2592000, 2995200, 3427200, 3888000};
	
	
	public Constant() {
		init();
	}
	
	public void init() {
		for (int i = 1, j = 0; i < 60 && j < 60; i++, j++) {
			this.exp.put(i,  reqexp[j]);
		}
	}
	
	public Hashtable<Integer, Integer> getExp() {
		return this.exp;
	}
	
}