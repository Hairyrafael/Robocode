package rafael.rocha;
import robocode.*;
import java.awt.Color;

/**
 * MyClass - a class by (arthu aurino)
 */
public class MyClass rafael rocha extends Robot{

public void run() {
	while (true){
			ahead (200);
			turnRight (35);
			back (50);
			turnGunRight (360);
		}
	}
	// metodo de tiro
 	public void onScannedRobot(onScannedbotEvent e) {
		String robotank = e.getName();
		double distancia = e.getDistance();
		System.out.println(robotank + " distancia " + distencia);
		if (distancia < 135 ) {
			//potencia do tiro
			fire (3)
			else
			fire (1.5);
		}
		//colisao com a parede
		public void onHitWall(HitWallEvent e) {
			back (40)
			turnRight(90)
		}
	}
}