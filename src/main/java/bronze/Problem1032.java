package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 명령 프롬프트
 */
public class Problem1032 {

	public static void main(String[] args) throws Exception {
		UserInterface ui = new UserInterface();
		int testCase = Integer.parseInt(ui.readLine());

		List<String> fileNames = new ArrayList<>();
		for(int i=0; i < testCase; i++) {
			String fileName = ui.readLine();
			fileNames.add(fileName);
		}

		run(fileNames);
	}

	/**
	 * 파일명과 확장자 분리
	 * 패턴 검사 구현
	 * 확장자, 이름 별로 적용
	 * @param fileNames
	 */
	static void run(List<String> fileNames){
		System.out.println(findPattern(fileNames));
	}

	static String findPattern(List<String> fileNames){
		if(fileNames.size() == 1) {
			return fileNames.get(0);
		}
		String pattern = analysisPattern(fileNames.get(0), fileNames.get(1));
		fileNames.add(pattern);
		fileNames.remove(0);
		fileNames.remove(0);
		System.out.println("fileNames = " + fileNames);
		if(fileNames.size() > 1){
			fileNames.add(findPattern(fileNames));
		}
		return fileNames.get(0);
	}

	static String analysisPattern(String a, String b){
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();

		char[] pattern = new char[aArr.length];
		for(int i=0; i < aArr.length; i++) {
			pattern[i] = isSameChar(aArr[i], bArr[i]);
		}

		return new String(pattern);
	}

	static char isSameChar(char a, char b){
		if(a == b) {
			return a;
		}
		return '?';
	}

	static class UserInterface{
		BufferedReader bufferedReader;

		public UserInterface() {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		}

		/**
		 * 테스트 케이스 반환
		 */
		public String readLine() throws Exception {
			return bufferedReader.readLine();
		}

		public String[] readInputData() throws IOException {
			String input = bufferedReader.readLine();
			return input.split(" ");
		}
	}

}
