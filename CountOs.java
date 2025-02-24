public class CountOs {
    public static int o_counter (String inputString) {
        int os_counted = 0;
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (c == 'o') {
                os_counted++;
            }
        }
        return os_counted;
    }
}
