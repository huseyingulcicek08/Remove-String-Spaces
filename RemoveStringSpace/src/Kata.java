class Kata {
    static String noSpace(final String x) {
        String res = "";
        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) != ' ')
                res += x.charAt(i);

        }
        return res;
    }
}