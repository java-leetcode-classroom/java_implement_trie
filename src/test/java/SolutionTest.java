import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void runWithExample1() {
    assertArrayEquals(new String[]{"null","null", "true", "false", "true", "null", "true"},
        sol.runWith(
            new String[]{"Trie", "insert", "search", "search", "startsWith", "insert", "search"},
            new String[][]{ null, new String[]{"apple"}, new String[]{"apple"}, new String[]{"app"}, new String[]{"app"}, new String[]{"app"}, new String[]{"app"}}
        ));
  }
}