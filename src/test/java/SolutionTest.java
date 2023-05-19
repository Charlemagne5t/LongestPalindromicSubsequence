import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestPalindromeSubseqTest1() {
        Assert.assertEquals(4, new Solution().longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void longestPalindromeSubseqTest2() {
        Assert.assertEquals(2, new Solution().longestPalindromeSubseq("cbbd"));
    }

//    @Test
//    public void longestPalindromeSubseqTest1() {
//        Assert.assertEquals(4, new Solution().longestPalindromeSubseq("bbbab"));
//    }
}
