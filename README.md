# CSC-495 Bonus Project Overview


# Prerequisites

Before you get started, make sure to have the following installed:

1. Latest version of [Java](https://www.oracle.com/java/technologies/downloads/#java17)

2. [Eclipse](https://www.eclipse.org/downloads/) IDE (Eclipse IDE for Java Developers).

# Getting Started

1. Download the Bonus Project repository to your local machine.
2. Open Eclipse and import the project.

# Code Base Overview

The project is organized into different packages:

# edu.ncsu.csc495.bonusproject.agent
The main class, Robot.java, is implemented by awaleed and oaptel2 and can be found in this package.
This class contains the dijkstra's algorithm.

# edu.ncsu.csc495.bonusproject.environment

This package contains various classes for handling operations with 2D maps.

# edu.ncsu.csc495.bonusproject.simulation
The VisualizeSimulation class is included in this package, allowing users to visualize the robot navigating different maps. You can select different maps by modifying the mapFile variable. Change map number to a different map to view different maps (i.e change "map15" to "map08"). 

# Running the Simulation
To run the simulation, follow these steps:

1. Open the VisualizeSimulation class in Eclipse.
2. Modify the mapFile variable to select a desired map.
3. Run the VisualizeSimulation class as a Java application.
4. The simulation will display the robot navigating the chosen map, showcasing its pathfinding capabilities.

# JUnit Tests
To run the JUnit tests:

1. Navigate to test folder 
2. Right click on the test folder and run as JUnit Test to verify that the solution we came up with passes all the tests

