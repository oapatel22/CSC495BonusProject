package edu.ncsu.csc495.bonusproject.agent;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import edu.ncsu.csc495.bonusproject.environment.Action;
import edu.ncsu.csc495.bonusproject.environment.Environment;
import edu.ncsu.csc495.bonusproject.environment.Position;
import edu.ncsu.csc495.bonusproject.environment.Tile;
import edu.ncsu.csc495.bonusproject.environment.TileStatus;

/**
	Represents an intelligent agent moving through a particular room.	
	The robot only has two sensors - the ability to retrieve the 
	the status of all its neighboring tiles, including itself, and the
	ability to retrieve the location of the TARGET tile.
	
	@author awaleed
	@author oapatel2
 */

public class Robot {
	private Environment env;
	/** Representation of the entire map as nodes*/
	private Map<Position, Node> mapAsNodes;
	/** Node to Represent updated path to Target */
	private Node currentPathToTarget;

	/** 
	 * Initializes a Robot on a specific tile in the environment and intializes
	 * Nodes to a hashmap
	 */
	public Robot(Environment env) {
		this.env = env;
		this.mapAsNodes = new HashMap<>();
	}
	
	/**
	 * The getAction() method determines the next action the robot should take based on the shortest path
	 * found using the Dijkstra's algorithm. It returns an Action enum value that represents the direction
	 * in which the robot should move. If the robot reaches the target or there's no valid path to the target,
	 * the method returns Action.DO_NOTHING.
	 *
	 * The method first calls the dijkstra() method to find the shortest path from the robot's current position
	 * to the target. After that, it initializes a variable 'parent' to the parent node of the currentPathToTarget.
	 * If the parent node is null, the method returns Action.DO_NOTHING, as it means the target has been reached.
	 *
	 * The method then iterates through the nodes in the currentPathToTarget from the target to the robot's position,
	 * updating the 'parent' and 'currentPathToTarget' variables until the robot's current position is found.
	 *
	 * Once the robot's current position is identified, the method compares the parent node's row and column values
	 * to the currentPathToTarget node's row and column values to determine the direction in which the robot should move:
	 * - If the parent's row is greater than the currentPathToTarget's row, the robot should move up (Action.MOVE_UP)
	 * - If the parent's row is less than the currentPathToTarget's row, the robot should move down (Action.MOVE_DOWN)
	 * - If the parent's column is greater than the currentPathToTarget's column, the robot should move left (Action.MOVE_LEFT)
	 * - If the parent's column is less than the currentPathToTarget's column, the robot should move right (Action.MOVE_RIGHT)
	 *
	 */
	public Action getAction() {
		dijkstra();
		Node parent = currentPathToTarget.parent;
		if (parent == null) {
			return Action.DO_NOTHING;
		}
		while (parent.parent != null) {
			currentPathToTarget = parent;
			parent = currentPathToTarget.parent;
		}
		if (parent.pos.getRow() > currentPathToTarget.pos.getRow()) {
			return Action.MOVE_UP;
		} else if (parent.pos.getRow() < currentPathToTarget.pos.getRow()) {
			return Action.MOVE_DOWN;
		} else if (parent.pos.getCol() > currentPathToTarget.pos.getCol()) {
			return Action.MOVE_LEFT;
		} else {
			return Action.MOVE_RIGHT;
		}
	}

	 /**
	 * Dijkstra's algorithm is a graph search algorithm that finds the shortest path between nodes
	 * in a graph. In this implementation, the nodes represent positions in a 2D grid, and edges
	 * represent possible moves between adjacent positions (up, down, left, or right). The algorithm
	 * maintains a priority queue of nodes (positions) yet to be evaluated, sorted by their cost
	 * to reach from the start position (g score). It also maintains a list of positions that have
	 * already been evaluated.
	 *
	 * The algorithm starts by adding the starting node (robot's current position) to the priority queue.
	 * It then repeatedly selects the node with the lowest g score from the queue, evaluates its
	 * neighbors, updates the cost and parent information of the neighbors, and adds them to the priority
	 * queue if they are not already in it. This process continues until the target position is reached
	 * or the queue becomes empty.
	 *
	 * To evaluate a neighbor, the algorithm first checks if it has already been evaluated (present in
	 * the evaluatedAlready list). If so, it skips the neighbor. If the neighbor is not in the
	 * evaluatedAlready list, it checks if it is in the yetToBeEvaluated priority queue. If the neighbor
	 * is not in the yetToBeEvaluated queue, the algorithm creates a new Node for the neighbor, sets
	 * its parent to the current node, and adds it to the yetToBeEvaluated queue. If the neighbor is
	 * already in the yetToBeEvaluated queue, the algorithm updates the neighbor's cost and parent
	 * information only if the new cost is lower than the previous cost.
	 *
	 * When the target position is reached, the algorithm backtracks from the target node to the starting
	 * node using the parent pointers, constructing the shortest path. The robot can then follow this
	 * path to reach the target position.
	 */
	private Action dijkstra() {
		// Current Position of Robot 
		Position selfPos = env.getRobotPosition(this);
		// Target Position of Robot
		Position targetPos = env.getTarget();
		// Priority Queue of Nodes to be Evaluated
		PriorityQueue<Node> yetToBeEvaluated = new PriorityQueue<>(new NodeComparator());
		// List of Nodes Evaluated Already
		Set<Position> evaluatedAlready = new HashSet<>();
		// Node to Represent Current Path to Target
		Node startingPos = new Node(selfPos, 0, null);
		// Add Starting Position to Priority Queue
		yetToBeEvaluated.add(startingPos);
		// Add Starting Position to Map of Nodes
		mapAsNodes.put(selfPos, startingPos);
		// this loop will run until the target is reached or the queue is empty 
		// (which means there is no path to the target) 
		// the loop will break when the target is reached 
		// and the currentPathToTarget variable will be set to the target node
		// which can be used to backtrack to the starting position
		// and construct the shortest path
		// the loop will also break if the queue is empty, which means there is no path to the target
		while (!yetToBeEvaluated.isEmpty()) {
			currentPathToTarget = yetToBeEvaluated.poll();
			// if the currentPathToTarget is the target, break out of the loop
			if (currentPathToTarget.pos.equals(targetPos)) {
				break;
			}
			// add the currentPathToTarget to the evaluatedAlready list 
			// so that it is not evaluated again 
			// (this is necessary because the priority queue does not 
			// guarantee that the node with the lowest cost will be 
			// evaluated first)
			// the evaluatedAlready list ensures that each node is evaluated only once
			// and that the algorithm does not get stuck in an infinite loop
			// if the priority queue does not return the node with the lowest cost first
			// (which is possible if the priority queue is implemented incorrectly) 
			// the evaluatedAlready list ensures that the algorithm will eventually
			// evaluate all nodes 
			evaluatedAlready.add(currentPathToTarget.pos);
			// get the neighbors of the currentPathToTarget 
			Map<String, Position> neighbors = env.getNeighborPositions(currentPathToTarget.pos);
			// get the tiles of the environment
			Map<Position, Tile> tiles = env.getTiles();
			// evaluate each neighbor of the currentPathToTarget 
			// and update the cost and parent information of the neighbor
			for (Map.Entry<String, Position> neighbor : neighbors.entrySet()) {
				// get the position of the neighbor
				Position currentPos = neighbor.getValue();
				// get the tile at the neighbor's position 
				Tile tile = tiles.get(currentPos);
				// get the status of the tile at the neighbor's position
				TileStatus status = tile.getStatus();
				// the cost to reach the neighbor is the cost to reach the currentPathToTarget 
				// plus 1 (since the cost to reach a neighbor is always 1)
				// the cost to reach the currentPathToTarget is stored in the g variable
				// of the currentPathToTarget node
				int cost = currentPathToTarget.g + 1;
				// if the neighbor has already been evaluated, skip it
				if (evaluatedAlready.contains(currentPos)) {
					continue;
				}
				// get the node corresponding to the neighbor's position
				Node neighborNode = mapAsNodes.get(currentPos);
				// if the neighbor is not in the map of nodes, create a new node for it
				if (neighborNode == null) {
					if (status != TileStatus.IMPASSABLE) {
						neighborNode = new Node(currentPos, cost, currentPathToTarget);
						mapAsNodes.put(currentPos, neighborNode);
					}
					// if the neighbor is already in the map of nodes, update its cost and parent 
					// information only if the new cost is lower than the previous cost
				} else if (cost < neighborNode.g && status != TileStatus.IMPASSABLE) {
					neighborNode.g = cost;
					neighborNode.parent = currentPathToTarget;
				}
				// if the neighbor is not in the yetToBeEvaluated queue, add it to the queue
				// the neighbor will be evaluated in the next iteration of the loop
				// if the neighbor is already in the yetToBeEvaluated queue, it will be updated
				// in the next iteration of the loop
				if (!yetToBeEvaluated.contains(neighborNode) && status != TileStatus.IMPASSABLE) {
					yetToBeEvaluated.add(neighborNode);
				}
			}
		}
		return Action.DO_NOTHING;
	}

	/**
	 * The Node class is a private inner class used in the implementation of Dijkstra's algorithm
	 * within the dijkstra() method. It represents a node in the pathfinding algorithm, storing
	 * the position of the node on the grid, the cost (g) to reach this position from the start,
	 * and a reference to the parent node in the path.
	 *
	 * The primary purpose of the Node class is to store data about a specific position in the path,
	 * allowing the algorithm to keep track of the best path to the target.
	 */
	private class Node {
		 /**
	     * The Position of this node on the grid.
	     */
		private Position pos;
		/**
	     * The cost (g) to reach this position from the start.
	     */
		private int g;
		/**
	     * The parent Node in the path.
	     */
		private Node parent;

		/**
	     * Constructs a new Node with the specified position, cost, and parent node.
	     */
		public Node(Position pos, int g, Node parent) {
			this.pos = pos;
			this.g = g;
			this.parent = parent;
		}
	}

	/**
	 * The NodeComparator class is a private inner class used for comparing two Node objects
	 * based on their respective costs (g) in the pathfinding algorithm. It implements the
	 * Comparator<Node> interface to define a custom comparison logic for Node objects.
	 *
	 * This comparator is primarily used by the PriorityQueue in the dijkstra() method to
	 * sort Node objects by their cost (g) in ascending order.
	 */
	private class NodeComparator implements Comparator<Node> {

		/**
	     * Compares two Node objects based on their costs (g) to determine their relative order.
	     * The comparison result is the difference between the cost (g) of pos1 and the cost (g) of pos2.
	     */
		public int compare(Node pos1, Node pos2) {
			return pos1.g - pos2.g;
		}
	}
}