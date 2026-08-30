class StringFundamentals 
{
    static boolean hasText(String value) 
    {
        if (value == null || value.length() == 0 || value.isBlank() || value.isEmpty())
        {
            return false;
        }
        return true;
    }

    static String normalizeCourseCode(String code) {
        if (code == null || code.length() == 0 || code.isBlank() || code.isEmpty())
        {
            return "null";
        }
        return code.trim().toUpperCase();
    }

    static int countOccurrences(String text, char target) {
        if (text == null || text.length() == 0 || text.isBlank() || text.isEmpty())
        {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target)
                count++;
        }
        return count;
    }

    static int lengthOfLastWord(String text) {
        if (text == null || text.length() == 0 || text.isBlank() || text.isEmpty())
        {
            return 0;
        }
        // To ask during next lab
        String[] words = text.trim().split(" ");
        return words[words.length - 1].length();
    }

    static void reverseString(char[] C) {
        int left = 0;
        int right = C.length - 1;

        while (left < right) {
            char temp = C[left];
            C[left] = C[right];
            C[right] = temp;

            left++;
            right--;
        }
    }
}
