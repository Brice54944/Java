package debug;

import java.util.ArrayList;

public class DebugMain5 {

	public static void main(String[] args) {
		ArrayList<Position> positions = new ArrayList<>(5);
		for (int i = 0; i < 5; i++) {
            Position position = new Position();
            positions.add(position);
			System.out.println(positions.get(i));
		}
	}

}

