package selectionsort;

public class A_Definition {

	public static void main(String[] args) {
/*
 * 	▶ 선택 정렬(selection sort)이란?
      ▷ 선택 정렬(Selection sort)은 제자리 정렬알고리즘(in-place sorting)의 한가지
       - 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하지 않는 정렬 알고리즘
      ▷ 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘

	▶ 선택 정렬 알고리즘의 특징

	▶ 장점
   	  ▷ 자료 이동 횟수가 미리 결정된다. 
      ▷ 추가적인 메모리 소비가 적다. 

	▶ 단점
      ▷ 시간복잡도가 O(N²)이다. 
      ▷ 불안정 정렬이다. ( 값이 같은 레코드가 있는 경우 상대적인 위치가 변경될 수 있다)
         ex) [ C2, A, B, C1 ] → [ A, B, C2, C1 ]

	▶ 선택 정렬 알고리즘의 시간복잡도
	   ▷ 비교 횟수	
   		- 두 개의 for 루프의 실행 횟수
  		- 외부 루프: (n-1)번
  		- 내부 루프(최솟값 찾기): n-1, n-2, … , 2, 1 번
	   ▷ T(n) = (n-1) + (n-2) + … + 2 + 1 = n(n-1)/2 = O(n^2)

	▶ 선택 정렬 알고리즘의 공간복잡도
	   - 주어진 배열 안에서 교환(swap)을 통해, 정렬이 수행되므로 O(n) 


	▶ 선택 정렬이 이루어지는 순서
  	 1. 주어진 배열 중에서 최소값을 찾는다.
  	 2. 그 값을 맨 앞에 위치한 값과 교체한다.
  	 3. 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 교체한다.
  	 4. 하나의 원소만 남을 때까지 위의 1~3과정을 반복한다. 
  	 ※ 선택 정렬은 알고리즘이 단순하며 사용할 수 있는 메모리가 제한적인 경우에 사용시 성능 상의 이점이 있다.

======================================================================================
	1. 시간복잡도(Time Complexity)

	▶ 정의 
	- 문제를 해결하는데 걸리는 시간과 입력한 함수관계
	- 시간이 아닌 조작(연산)되는 횟수를 센다. 
	- 상대적으로 불필요한 연산을 제거, 알고리즘 분석을 간편하게 하는 목적으로 표기하는 방법

	▶ 알고리즘의 성능평가 : 최선, 최악, 평균유형
 	- 평균적인 경우가 가장 이상적으로 보이지만 알고리즘이 복잡해 질수록 평균적인 경우는 구하기가 매우 어려워 진다. 	
 	- 그러므로 최악의 경우로 알고리즘의 성능을 파악한다.

	▶  Big-O Notation(빅O표기법)
	- 점근적 상한선(Asymptotic upper bound)
	- 계수와 낮은 차수의 항을 제외시키는 방법
	- 상수는 과감하게 삭제(모두 1이 된다)

	▶  예시 (N=입력된 수 : ex.  N=16)  → O(1)<O(logN)<O(NogN)<O(N²)<O(2ⁿ)

======================================================================================

	2. 공간복잡도(Space Complexity)

	▶ 정의
 	- 프로그램 실행 후, 완료하는데 필요로 하는 메모리 사용량(자원 공간의 양)

	▶ 총 필요 저장공간
 	- 고정 공간(알고리즘과 무관) : 코드 저장공간, 단순 변수 및 상수
 	- 가변 공간(알고리즘 실행과 관련) : 실행 중 동적으로 필요한 공간

	▶ 총 필요 저장공간 계산법
		S(P) = c + Sp(n)
		c: 고정 공간
		𝑆𝑝(𝑛)Sp(n): 가변 공간
		→ 고정 공간보다 알고리즘에 의해 좌우되는 가변 공간이 공간 복잡도에 미치는 영향이 크다.

​
 */
	}
}
