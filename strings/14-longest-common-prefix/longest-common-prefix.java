class Solution {
    public String longestCommonPrefix(String[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        String start = arr[0], end = arr[n - 1];
        int i = 0, j = 0;

        while (i < start.length() && j < end.length()) {
            if (start.charAt(i) == end.charAt(j))
             {
                sb.append(start.charAt(i));
                i++;
                j++;
                    }
             else 
                break;
            

        }
        return sb.toString();

    }
}