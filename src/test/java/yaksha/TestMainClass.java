package yaksha;

import static org.mockito.Mockito.mock;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestMainClass {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testCalculateWaterNetworkUsingGreedyAlgo() throws Exception {
		ArrayList<Integer> expectedResultList = new ArrayList<Integer>();
		expectedResultList.add(new Integer(2));
		expectedResultList.add(new Integer(8));
		expectedResultList.add(new Integer(22));
		expectedResultList.add(new Integer(3));
		expectedResultList.add(new Integer(1));
		expectedResultList.add(new Integer(66));
		expectedResultList.add(new Integer(5));
		expectedResultList.add(new Integer(6));
		expectedResultList.add(new Integer(10));
		int n, p;
		n = 9;
		p = 6;
		int array[][] = { { 7, 4, 98 }, { 5, 9, 72 }, { 4, 6, 10 }, { 2, 8, 22 }, { 9, 7, 17 }, { 3, 1, 66 } };
		WaterConnection waterConnection = new WaterConnection(n, p, array);
		MainClass test = mock(MainClass.class);
		Mockito.when(test.calculateWaterNetworkUsingGreedyAlgo(waterConnection)).thenReturn(expectedResultList);
		ArrayList<Integer> resultList = test.calculateWaterNetworkUsingGreedyAlgo(waterConnection);
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}