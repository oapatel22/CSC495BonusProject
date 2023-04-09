package edu.ncsu.csc495.bonusproject.simulation;

import edu.ncsu.csc495.bonusproject.environment.Environment;
import edu.ncsu.csc495.bonusproject.utils.MapManager;

/**
 * A non-GUI version of the simulation. This will allow you to quickly test out
 * your implementations without having to wait for each time-step to occur
 * (there is a 200 millisecond delay between time-steps in the visualization).
 * You are free to modify the environment for test cases.
 *
 * @author Adam Gaweda
 */
public class RunSimulation {
    private final Environment env;
    private final int         interations;
    private final boolean     displaySimErrors;

    // Build the simulation with the following parameters
    public RunSimulation ( final String mapFile, final int iterations ) {
        String[] map = MapManager.loadMap( mapFile );
        this.env = new Environment( map );
        this.interations = iterations;
        this.displaySimErrors = true;
    }

    // Iterate through the simulation, updating the environment at each time
    // step
    public void run () {
        for ( int i = 1; i <= this.interations; i++ ) {
            try {
                // Wrapped in try/catch in case the Robot's decision results
                // in a crash; we'll treat that the same as Action.DO_NOTHING
                env.updateEnvironment();
            }
            catch ( Exception ex ) {
                if ( this.displaySimErrors ) {
                    String error = "[ERROR AGENT CRASH AT TIME STEP %03d] %s\n";
                    System.out.printf( error, i, ex );
                }
            }

            // Quit the simulation early if the goal condition is met
            if ( this.env.goalConditionMet() ) {
                System.out.println( "Reached Target" );
                break;
            }
        }
    }

    public boolean goalConditionMet () {
        return this.env.goalConditionMet();
    }

    public static void main ( final String[] args ) {
        // Currently uses the first public test case
        String mapFile = "maps/public/160000Nodes.txt";
        int iterations = 100000;
        double startTime = System.currentTimeMillis();
        RunSimulation sim = new RunSimulation( mapFile, iterations );
        sim.run();
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        System.out.println( elapsedTime );

    }
}
