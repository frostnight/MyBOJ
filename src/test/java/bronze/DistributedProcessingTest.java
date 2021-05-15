package bronze;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DistributedProcessingTest {

	@ParameterizedTest
	@CsvSource({"1,6,1", "3,7,2187", "6,2,36"})
	@DisplayName("A의 B제곱 구하기 A^B")
	void getSquare(double A, double B, double expected){
		assertThat(Math.pow(A, B)).isEqualTo(expected);
	}

	void getRemainder(double DataVolume, double computerNum){

	}
}
