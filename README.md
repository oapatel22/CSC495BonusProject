# CSC-495 Bonus Project

# Project Overview

This project introduces a robot represented by a green circle who takes place in a 2D map. A map consists of clean tiles, walls, and a target tile. The goal of the robot is to get to its target tile using Dijkstra's algorithm by finding the shortes route to the target tile from current position. This project also performs an analysis of Dijkstra's algorithm and analyzes how as input gets larger the runtime of Dijkstra's algorithm is impacted. In a nutshell, a map in converted to a graph data structure connected with edges and each edge is given a cost and walls are given the highest cost possible in order to have the robot avoid running into the walls. The robot makes a greedy choice at each tile and either moves up, dowm, left, or right to get to the target. 

A analysis report was also created which is uploaded to the repository as well as a PDF called 

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

