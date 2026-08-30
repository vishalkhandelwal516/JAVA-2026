public class StringBuilderToolkit {
    static String reverse(String text)
    {
        if (text==null || text.isEmpty()){
            return "NO TEXT to reverse";
        } else {
            return new StringBuilder(text).reverse().toString(); // StringBuilder to String
        }
    }
    static String repeat(String text, int count)
    {
        if (text==null || text.isEmpty()){
            return "null";
        }
        StringBuilder S1 = new StringBuilder();
        for (int i=0; i<count; i++) {
            S1.append(text);
        }
        return S1.toString();
    }

    static String joinWords(String[] words, String separator)
    {
        if (words == null || separator == null || words.length==0) 
        {
            return "null";
        }
        StringBuilder s1 = new StringBuilder();
        for (int i=0; i<words.length; i++) 
        {
            s1.append(words[i]);
            if (i < words.length - 1) 
            {
                s1.append(separator); 
            }
        }
        return s1.toString();
    }
    static String removeCharacterAt(String text, int index) 
    {
        if (text == null) 
        {
            return "null";
        }
        if (index < 0 || index >= text.length()) 
        {
            System.out.println("Index not Valid ! Check again.");
            return text;
        }

        StringBuilder S = new StringBuilder(text);
        S.deleteCharAt(index);
        return S.toString();
    }
    static String replaceCharacterAt(String text, int index, char replacement) 
    {
        if (text == null) 
        {
            return "null";
        }
        if (index < 0 || index >= text.length()) 
        {
            System.out.println("Index not Valid ! Check again.");
            return text; 
        }

        StringBuilder S = new StringBuilder(text);
        S.setCharAt(index, replacement); 
        return S.toString();
    }
    static String buildNumberedList(String[] items) {
        if (items == null) {
            return "null";
        }
        if (items.length == 0) {
            return "";
        }
        StringBuilder S = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            S.append( "( "+ (i + 1));
            S.append(" ) ");
            S.append(items[i]);
            if (i < items.length-1) 
            {
                S.append("\n"); 
            }
        }
        return S.toString();
    }
}
