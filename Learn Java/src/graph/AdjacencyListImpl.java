package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjacencyListImpl {
	
	
	//array of linkedlist
	LinkedList<Integer> adj[];
	
	public AdjacencyListImpl(int v) {
		adj=new LinkedList[v];
		for (int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
		
	}
	
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int bfs(int source,int destination) {
		
		boolean[] visited=new boolean[adj.length];
		int[] parent =new int[adj.length];
		Queue<Integer> queue =new LinkedList<Integer>();
		queue.add(source);
		visited[source]=true;
		parent[source]=-1;
		
		while(!queue.isEmpty()) {
			int curr=queue.poll();
			if(destination==curr) break;
			for (int neighbour:adj[curr]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					queue.add(neighbour);
					parent[neighbour]=curr;
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		
		
		while(parent[cur] != -1) {
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		System.out.print(source);
		System.out.println();
		
		return distance;
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no of vertices and edges");
		int v=scanner.nextInt();
		
		AdjacencyListImpl graph =new AdjacencyListImpl(v);
		
		int edges=scanner.nextInt();
		
		//System.out.println("enter  source  and destination");
		for(int i=0;i<edges;i++) {
			System.out.println("enter  source  and destination for edge" +i);
			int source=scanner.nextInt();
			int destination=scanner.nextInt();
			graph.addEdge(source, destination);
			
		}
		
		// aplications of bfs : to find the min distance between source and dest
		
		System.out.println("Enter source and destination");
		
		int source = scanner.nextInt();
		int destination = scanner.nextInt();
		int min_dist=graph.bfs(source,destination);
		System.out.println("min distance between source and destination "+min_dist);
		
	
		
		

	}

}
