import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.print("홀수인 양의 정수 입력 : ");
			num = sc.nextInt();
			if (num % 2 == 0 && num > 0) {
				System.out.println("잘못 입력하였습니다. (홀수만 입력)");
				continue;
			} else if (num < 0) {
				System.out.println("잘못 입력하였습니다. (양수로 입력)");
				continue;
			} else {
				break;
			}
		}

		int num2 = num / 2 + 1;

		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			if (i < num2) {
				arr[i] = i + 1;
			} else if (i >= num2) {
				num2--;
				arr[i] = num2;
			}

			System.out.print(arr[i] + " ");
		}
	}
}
