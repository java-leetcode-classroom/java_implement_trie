import java.util.HashMap;

public class Trie {
  static class TrieNode {
    boolean EndOfWord = false;
    HashMap<Character, TrieNode> Children = new HashMap<>();
  }
  TrieNode root;
  public Trie() {
    root = new TrieNode();
  }
  public void insert(String word) {
    TrieNode cur = root;
    int size = word.length();
    for (int pos = 0; pos < size; pos++) {
      char ch = word.charAt(pos);
      if (!cur.Children.containsKey(ch)) {
        cur.Children.put(ch, new TrieNode());
      }
      cur = cur.Children.get(ch);
    }
    cur.EndOfWord = true;
  }
  public boolean search(String word) {
    TrieNode cur = root;
    int size = word.length();
    for (int pos = 0; pos < size; pos++) {
      char ch = word.charAt(pos);
      if (!cur.Children.containsKey(ch)) {
        return false;
      }
      cur = cur.Children.get(ch);
    }
    return cur.EndOfWord;
  }
  public boolean startsWith(String prefix) {
    TrieNode cur = root;
    int size = prefix.length();
    for (int pos = 0; pos < size; pos++) {
      char ch = prefix.charAt(pos);
      if (!cur.Children.containsKey(ch)) {
        return false;
      }
      cur = cur.Children.get(ch);
    }
    return true;
  }

}
