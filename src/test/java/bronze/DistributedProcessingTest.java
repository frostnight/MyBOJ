package bronze;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 */
class DistributedProcessingTest {

	private final int COMPUTER_COUNT = 7;


	@Test
	@DisplayName("각 거듭제곱 별 끝 자리 구하기")
	void getLastPowNumTest(){
		int base = 2;
		int exponent = 3;
		int sum = 1;

		for(int i=0; i < exponent; i++){
			sum = (sum * base) % 4;
			System.out.println(sum);
		}
	}

	@Test
	@DisplayName("반복문없이 끝자리 구학")
	void noLoopLastPowNumTest(){
		int base = 3;
		int exponent = 7;
		List<Integer> nums = Arrays.asList(9,1);
		System.out.println(nums.size()  - exponent % nums.size() );
	}

	@Test
	@DisplayName("통합 테스트")
	void integrationTest(){
		int base = 4;
		int exponent = 2;
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
		System.out.println(numbers);
		System.out.println(exponent % numbers.size());
		System.out.println(lastNumCycle);
		if(lastNumCycle < 0){
			System.out.println("answer:"+numbers.get(numbers.size() - 1));
		} else {
			System.out.println("answer:"+numbers.get(lastNumCycle));
		}


	}

}
