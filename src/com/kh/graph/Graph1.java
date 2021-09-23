package graph;
import java.util.ArrayList;
import java.util.Scanner;

class List {
	Scanner sc=new Scanner(System.in);
	ArrayList<ArrayList<Integer>> graph;
	int V;
	int type;
	
	List(int nodes){
		V=nodes+1;
		System.out.print("방향그래프라면 1, 무방향 그래프라면 0 입력 : ");
		type=sc.nextInt();
		System.out.println("====== 그래프를 출력합니다 ======");
		
		if(type==0) {
			System.out.println("정점이 "+(V-1)+"개인 양방향그래프입니다.");			
		}else if(type==1) {
		System.out.println("정점이 "+(V-1)+"개인 방향그래프입니다.");
		}
		
		// Integer형 ArrayList형의 ArrayList인 graph 생성
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			graph.add(new ArrayList<Integer>());
		
		}
	}
	
	void addEdge(int v, int u) {
		graph.get(v).add(u); // 방향 그래프일 경우
		if(type==0) {
			graph.get(u).add(v); // 무방향 그래프일 경우			
		}
	}
	
	void printGraph() {
		for(int i=1;i<V;i++) {
			System.out.print("정점 "+i+"의 인접리스트");
			for(int x : graph.get(i)) //주어진 인덱스에 저장된 객체 리턴
			System.out.print(" → "+x);
			System.out.println();
		}
	}
}
public class Graph1{
	public static void main(String[] args) {
		System.out.println("==== 인접리스트로 그래프 표현 ====");
		
		List g=new List(5);
		g.addEdge(1, 2);
		g.addEdge(2, 4);
		g.addEdge(3, 1);
		g.addEdge(3, 2);
		g.addEdge(3, 4);
		g.addEdge(5, 1);
		g.printGraph();
	}
}
