public class Solution {
  public String[] runWith(String[] commands, String[][] payloads) {
    int nCommand = commands.length;
    String[] result = new String[nCommand];
    result[0] = "null";
    Trie trie = new Trie();
    for (int pos = 1; pos < nCommand; pos++) {
      String command = commands[pos];
      String payload = payloads[pos][0];
      switch (command) {
        case "insert":
          trie.insert(payload);
          result[pos] = "null";
          break;
        case "search":
          result[pos] = String.valueOf(trie.search(payload));
          break;
        case "startsWith":
          result[pos] = String.valueOf(trie.startsWith(payload));
          break;
      }
    }
    return result;
  }
}
