package graph;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// V = 정점의 개수, E = 간선의 개수.
		System.out.println("====== 인접 행렬로 그래프 표현 ======");
		System.out.print("방향그래프라면 1, 무방향 그래프라면 0 입력 : ");
		int type = sc.nextInt();
		System.out.print("정점의 개수를 입력하세요 : ");
		int V = sc.nextInt();
		System.out.print("간선의 개수를 입력하세요 : ");
		int E = sc.nextInt();
		
		// 2차원 배열(인접 행렬)을 만든다.
		// 인덱스의 번호 = 노드의 번호 이기 때문에, 2차원 배열의 크기를 임의로 1 늘려서 정의한다(스킬).
		int[][] graph = new int[V + 1][V + 1];
		
		int row;
		int col;
		int cost;
		for(int i = 0; i < E; i++) {
			
			System.out.println("==== "+(i+1)+"번째 간선 입력"+" ====");
			System.out.print((i+1)+"번째 간선의 정점①을 입력하세요 : ");
			row = sc.nextInt();
			System.out.print((i+1)+"번째 간선의 정점②를 입력하세요 : ");
			col = sc.nextInt();
			System.out.print((i+1)+"번째 간선의 가중치를 입력하세요 : ");
			cost = sc.nextInt();
			graph[row][col] = cost;
			// 만일, 무향 그래프라면 아래의 if문이 수행된다. 
			if(type==0) {
			graph[col][row] = cost;				
			}
		}
		
		// 인접 행렬 출력
		for(int i = 1; i < V + 1; i++) {
			for(int j = 1; j < V + 1; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}