class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i=0; i < strs.length; i++){
            String word = strs[i];

            char [] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedKey = new String(ch);

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey, new ArrayList<>());
            }

            map.get(sortedKey).add(word);

        }
        return new ArrayList<>(map.values());
        
    }
}