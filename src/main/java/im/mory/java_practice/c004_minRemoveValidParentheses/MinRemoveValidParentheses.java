package im.mory.java_practice.c004_minRemoveValidParentheses;

import java.util.*;

public class MinRemoveValidParentheses {
    public String solution(String s) {
        List<Integer> openParenthesesToRemove = new ArrayList<>();
        List<Integer> closeParenthesesToRemove = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c == ')') {
                if (!openParenthesesToRemove.isEmpty()) {
                    openParenthesesToRemove.remove(openParenthesesToRemove.size() - 1);
                } else {
                    closeParenthesesToRemove.add(i);
                }
            } else if (c == '(') {
                openParenthesesToRemove.add(i);
            }
        }

        Map<Integer, Void> allRemoves = new HashMap<>();
        for (Integer item : openParenthesesToRemove) {
            allRemoves.put(item, null);
        }
        for (Integer item : closeParenthesesToRemove) {
            allRemoves.put(item, null);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!allRemoves.containsKey(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
