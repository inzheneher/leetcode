package app;

/**
 * inzheneher created on 12/02/2021 inside the package - app
 */
public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int comLen = command.length();
        for (int i = 0; i < comLen; i++) {
            char curr = command.charAt(i);
            if (i < comLen - 1) {
                char next = command.charAt(i + 1);
                if (curr == '(' && next == ')') {
                    sb.append('o');
                    i++;
                } else if (curr == '(' && next == 'a') {
                    sb.append("al");
                    i = i + 3;
                }
            }
            if (curr == 'G') sb.append(curr);
        }
        return sb.toString();
    }
}
