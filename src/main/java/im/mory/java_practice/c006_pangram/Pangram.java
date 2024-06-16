package im.mory.java_practice.c006_pangram;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

public class Pangram {
    public boolean solution(String sentence) {
        // input: letters, digits, spaces
        //     1 < length <= 1000
        var alphabetsStr = "abcdefghijklmnopqrstuvwxyz";
        var alphabets = new HashSet<Character>(alphabetsStr.length());
        for (char a : alphabetsStr.toCharArray()) {
            alphabets.add(a);
        }
        for (char s : sentence.toLowerCase().toCharArray()) {
            alphabets.remove(s);
            if (alphabets.isEmpty())
                return true;
        }
        return false;
    }
}
