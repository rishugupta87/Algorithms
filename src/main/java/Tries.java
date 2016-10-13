import java.util.HashMap;
import java.util.Map;

/**
 * Created by rg029761 on 10/2/16.
 */
public class Tries {

    private TrieNode root;

    private class TrieNode {
        Map<Character, TrieNode> characterToNodeMap;
        boolean isEndOfWord;

        public TrieNode() {
            characterToNodeMap = new HashMap<Character, TrieNode>();
            isEndOfWord = false;
        }
    }

    public Tries() {
        root = new TrieNode();
    }

    public void addWord(final String word) {
        TrieNode currentNode = root;

    }
}
