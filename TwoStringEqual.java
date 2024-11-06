class TwoStringEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = makeString(word1);
        String s2 = makeString(word2);
        return s1.equals(s2);
    }

    // makeString is a healper method here
    String makeString(String[] word) {
        StringBuilder sb = new StringBuilder();
        for (String s : word) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TwoStringEqual solution = new TwoStringEqual();

        // Example test cases
        String[] word1 = { "abc", "d", "efg" };
        String[] word2 = { "abcd", "efg" };
        System.out.println(solution.arrayStringsAreEqual(word1, word2));

        String[] word3 = { "abc", "d" };
        String[] word4 = { "ab", "c", "d" };
        System.out.println(solution.arrayStringsAreEqual(word3, word4));

        String[] word5 = { "a", "b", "c" };
        String[] word6 = { "ab", "c" };
        System.out.println(solution.arrayStringsAreEqual(word5, word6));
    }
}



