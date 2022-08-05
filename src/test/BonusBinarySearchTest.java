package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BonusBinarySearchTest {

@Test
    public void oneNumberInArray(){
    int[] oneIntArr = {3};
    assertEquals(0, BonusBinarySearch.binarySearch(oneIntArr,3), .001);
}

@Test
    public void oddNumberIntsInArray(){
    int[] oddNumberArray = {1,3,5,7,9};
    assertEquals(2, BonusBinarySearch.binarySearch(oddNumberArray, 5), .001);
}

@Test
    public void oddNumberArrayNotInMiddle(){
    int[] oddNumberArray = {1,3,5,7,9};
    assertEquals(3, BonusBinarySearch.binarySearch(oddNumberArray, 7));
}

@Test
    public void evenNumberArray(){
    int[] evenNumberArray = {2,4,6,8};
    assertEquals(1, BonusBinarySearch.binarySearch(evenNumberArray, 4));
}

//@Test
//    public void oddArrayFirstOfRepeatedNumbers(){
//    int[] oddArrayWithRepeats = {1,2,2,3,4};
//    assertEquals(1, BonusBinarySearch.binarySearch(oddArrayWithRepeats, 2));
//}

@Test
public void searchForIntNotInArray(){
    int[] array = {1,2,3,4,5,6};
    assertEquals(-1, BonusBinarySearch.binarySearch(array, 7));
}



}
