class Solution {
    public String solution(int age) {
        String s = "";
        String str = "abcdefghij";
        String[] sarr = str.split(""); 
        while(age>0) {
        	s += sarr[age%10];	
        	age /= 10;			
        }
        
        StringBuilder sb = new StringBuilder(s);
        String answer = sb.reverse().toString();
        
        return answer;
    }
}