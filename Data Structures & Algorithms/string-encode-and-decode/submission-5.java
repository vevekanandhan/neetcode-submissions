class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
			encodedString.append(str.length()).append('#').append(str);
		}
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        
    	List<String> decodedStrings = new ArrayList<>();
    	
    	int index = 0;
    	
    	while(index < str.length())
    	{
    		int hashIndex = str.indexOf('#', index);
    		int length = Integer.parseInt(str.substring(index, hashIndex));
			String decodedString = str.substring(hashIndex + 1, hashIndex + 1 + length);
			decodedStrings.add(decodedString);
			index = hashIndex + 1 + length;
    	}
    	
    	return decodedStrings;
    }
}
