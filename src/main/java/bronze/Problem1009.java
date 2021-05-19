package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 브론즈 3
 *
 * 문제번호 1009
 */
public class Problem1009 {

	private static final int COMPUTER_COUNT = 10;

	public static void main(String[] args) throws Exception {

		UserInterface ui = new UserInterface();
		int testCase = Integer.parseInt(ui.readTestCase());

		List<Integer> answer = new ArrayList<>();

		for(int i=0; i < testCase; i++){
			String[] input = ui.readInputData();
			int base = Integer.parseInt(input[0]);
			int exponent = Integer.parseInt(input[1]);
			int computerNum = getLastComputerNum(base, exponent, COMPUTER_COUNT);
			answer.add(computerNum);
		}

		for (Integer integer : answer) {
			System.out.println(integer);
		}
	}

	public static int getLastComputerNum(int base, int exponent, int COMPUTER_COUNT){
		int computerNum = 0;
		int sum = 1;
		List<Integer> numbers = new ArrayList<>();
		int initNum = -1;
		for(int i=0; i < exponent; i++){
			sum = (sum * base) % COMPUTER_COUNT;
			if(sum == 0){
				sum = COMPUTER_COUNT;
			}
			if(initNum == sum) {
				break;
			}
			if(i==0) {
				initNum = sum;
			}
			numbers.add(sum);
		}

		int lastNumCycle = (exponent % numbers.size()) - 1;
		if(lastNumCycle < 0){
			computerNum = numbers.get(numbers.size() - 1);
		} else {
			computerNum = numbers.get(lastNumCycle);
		}

		return computerNum;
	}

	static class UserInterface{
		BufferedReader bufferedReader;

		public UserInterface() {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		}

		/**
		 * 테스트 케이스 반환
		 */
		public String readTestCase() throws Exception {
			return bufferedReader.readLine();
		}

		public String[] readInputData() throws IOException {
			String input = bufferedReader.readLine();
			return input.split(" ");
		}
	}

}
