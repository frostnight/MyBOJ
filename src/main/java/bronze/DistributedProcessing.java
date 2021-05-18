package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 브론즈 3
 *
 * 문제번호 1009
 */
public class DistributedProcessing extends Thread {

	public static void main(String[] args) throws Exception {

		UserInterface ui = new UserInterface();
		DistributedProcessing dp = new DistributedProcessing();

		int testCase = Integer.parseInt(ui.readTestCase());

		for(int i=0; i < testCase; i++){
			String[] input = ui.readInputData();
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
		}

	}

	@Override
	public void run(){

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
