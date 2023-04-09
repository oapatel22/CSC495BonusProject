package edu.ncsu.csc495.test_cases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ncsu.csc495.bonusproject.simulation.RunSimulation;

/**
 * This JUnit test suite uses JUnit5. In order to run these test cases, you will
 * need to have JUnit5 installed on your local machines. You can set your
 * Project to use JUnit5 by right-clicking on the project and selecting
 * "Properties", then selecting "Java Build Path". Finally, selecting "Add
 * Library..." will allow you to select "JUnit" and specify the version. DO NOT
 * MODIFY.
 *
 * @author Adam Gaweda
 */
public class BonusProject_TestCase {
    private final int    NUM_TRIALS       = 1;
    private final int    ITERATIONS       = 25000;
    private int          successfulTrials = 0;
    private final String line             = "Test %02d success rate: %.2f after %d trials";

    @Before
    public void setUp () {
        successfulTrials = 0;
    }

    @Test
    public void testEnvironment01 () {
        String map = "maps/public/map01.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 1, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment02 () {
        String map = "maps/public/map02.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 2, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment03 () {
        String map = "maps/public/map03.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 3, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment04 () {
        String map = "maps/public/map04.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 4, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment05 () {
        String map = "maps/public/map05.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 5, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment06 () {
        String map = "maps/public/map06.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 5, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment07 () {
        String map = "maps/public/map07.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 6, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment08 () {
        String map = "maps/public/map08.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 8, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment09 () {
        String map = "maps/public/map09.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 9, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment10 () {
        String map = "maps/public/map10.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 10, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment11 () {
        String map = "maps/public/map11.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 11, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment12 () {
        String map = "maps/public/map12.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 12, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment13 () {
        String map = "maps/public/map13.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 13, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment14 () {
        String map = "maps/public/map14.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 14, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment16 () {
        String map = "maps/public/map16.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 16, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment17 () {
        String map = "maps/public/map17.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 17, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment18 () {
        String map = "maps/public/map18.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 18, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment19 () {
        String map = "maps/public/map18.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 19, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment20 () {
        String map = "maps/public/map20.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 20, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment21 () {
        String map = "maps/public/map21.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 21, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment22 () {
        String map = "maps/public/map22.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 22, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment23 () {
        String map = "maps/public/map23.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 23, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment24 () {
        String map = "maps/public/map24.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 24, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment25 () {
        String map = "maps/public/map25.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 25, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment26 () {
        String map = "maps/public/map26.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 26, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment27 () {
        String map = "maps/public/map27.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 27, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment28 () {
        String map = "maps/public/map28.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 28, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment29 () {
        String map = "maps/public/map29.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 29, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment30 () {
        String map = "maps/public/map30.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 30, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void testEnvironment31 () {
        String map = "maps/public/map31.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 31, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test1250Nodes () {
        String map = "maps/public/1250Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 1250, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test2500Nodes () {
        String map = "maps/public/2500Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 2500, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test5000Nodes () {
        String map = "maps/public/5000Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 5000, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );

        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test10000Nodes () {
        String map = "maps/public/10000Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 100000, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test20000Nodes () {
        String map = "maps/public/20000Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 200000, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test40000Nodes () {
        String map = "maps/public/40000Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 400000, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test80000Nodes () {
        String map = "maps/public/80000Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 800000, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

    @Test
    public void test160000Nodes () {
        String map = "maps/public/160000Nodes.txt";

        for ( int trial = 0; trial < NUM_TRIALS; trial++ ) {
            RunSimulation sim = new RunSimulation( map, ITERATIONS );
            sim.run();
            if ( sim.goalConditionMet() ) {
                successfulTrials++;
            }
        }

        String msg = String.format( line, 1600000, successfulTrials / ( NUM_TRIALS * 1.0 ) * 100, NUM_TRIALS );
        System.out.println( msg );
        assertTrue( successfulTrials / ( NUM_TRIALS * 1.0 ) >= 0.7, msg );
    }

}
