package mobility;

import java.awt.Dimension;
import java.util.ArrayList;
import mobility.model.*;
import javax.swing.JFrame;
import ptolemy.plot.Plot;

/**
 * Visualizes the evolution of a population of Mobile objects
 * 
 * See Drunkard, Brownian and Follower for further details
 * @author Eliot Martin
 */
public class VisualSimulator {
    private Plot plot;
	private JFrame frame;
    /**
	 * @param width  Width of the window in pixels
	 * @param height Height of the window in pixels
	 * @see #show(int, RNG, int) to add a sample set to this window
	 */
	public VisualSimulator(int width, int height) {
		// initialize PtPlot's plotter widget with the specified size
		plot = new Plot();
		plot.setMarksStyle("points");
		plot.setSize(new Dimension(width, height));

		// put it in a main window
		frame = new JFrame("Plotter");
		frame.add(plot);
		frame.pack();
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    /**
	 * Plots the evolution of the objects
	 * 
	 * @param serieIndex The figure's index
	 * @param mobList     Array of mobiles to observe
	 * @param nbSteps     Duration of the simulation as a number of steps
	 */
	public void show(int serieIndex, ArrayList<Mobile> mobList, int nbSteps) {
		// clear previous graph
		plot.clear(serieIndex);

		// generate samples and add them to the series
		for (int i = 0; i < nbSteps; i++) {
            int n_color = 0;
            for (Mobile mob : mobList) {
                n_color ++;
                mob.move(1);
                plot.addPoint(n_color, mob.getX(), mob.getY(), false);
                
                try {
					// For observability
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
			// Re-adapts the view at each step
			plot.repaint();
		}
	}

	public static void main(String[] args) {
		VisualSimulator plotter = new VisualSimulator(800, 450);
		int nb = 1000;
        ArrayList<Mobile> population = new ArrayList<Mobile>();
        Drunkard leader = new Drunkard(0, 0, .03);
        population.add(leader);

        Follower f4 = new Follower(1, 1, leader, 10);;
        Follower f1 = new Follower(-1, 1, f4, 10);
        Follower f2 = new Follower(1, -1, f1, 4);
        Follower f3 = new Follower(-1, -1, f2, 4);
        population.add(f1);
        population.add(f2);
        population.add(f3);
        population.add(f4);
        population.add(new Brownian(0, 0, .02));
        population.add(new Brownian(0, 0, .02));
        population.add(new Drunkard(0, 0, .02));
        population.add(new Drunkard(0, 0, .02));

		plotter.show(0, population, nb);
	}
}
