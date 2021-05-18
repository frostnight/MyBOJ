package bronze;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 */
class DistributedProcessingTest {

	private final int COMPUTER_COUNT = 10;
	int data = 1;

	@Test
	@DisplayName("스레드 초기화 테스트")
	void threadTest(double A, double B, double expected){
		Thread[] t = new Thread[COMPUTER_COUNT];
		for(int i=0; i < COMPUTER_COUNT; i++) {
			t[i] = new
		}
	}

	void getRemainder(double DataVolume, double computerNum){

	}
}
