package app;

/**
 * inzheneher created on 11/02/2021 inside the package - app
 */
public class Solution {
    public String defangingIPaddr(String address) {
        int len = address.length();
        char a = '[', b = '.', c = ']';
        char[] chars = new char[len + 6];
        int j = 0;
        for (int i = 0; i < len; i++) {
            char _ch = address.charAt(i);
            if (_ch == '.') {
                chars[j++] = a;
                chars[j++] = b;
                chars[j++] = c;
            } else {
                chars[j++] = _ch;
            }
        }
        return String.valueOf(chars);
    }
}
