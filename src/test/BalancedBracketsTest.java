package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue(){

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBracketsWrongOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOneOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyOneClosedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsRightOrderWithWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    public void bracketsWrongOrderWithWord(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]word["));
    }

    @Test
    public void oddNumberOfBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void twoPairsBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void multiplesSameBracketsInOrderButSameNumberOfBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    @Test
    public void oddNumberBracketsWithWord(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word]["));
    }

    @Test
    public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wordNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("word"));
    }

    @Test
    public void balancedBracketsInsideQuotes(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("word'[word]'word"));

    }
    @Test
    public void balancedBracketsWordOutside(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("word[]"));
    }

    @Test
    public void wordWithOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("word]"));
    }









}
