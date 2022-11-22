import java.math.BigInteger;

class Solution {
    static BigInteger top = new BigInteger("1");
	static BigInteger bottom = new BigInteger("1");
    
    public int solution(int balls, int share) {
        int answer = 0;
		answer = (balls/2 >= share) ?
				 mul(balls, share).intValue() : mul(balls, balls-share).intValue();
        
        return answer;
		
	}
	
	public static BigInteger mul(int balls, int share) {
	    if(share < 1) return top.divide(bottom);
	    else {
	        top = top.multiply(BigInteger.valueOf(balls));
	        bottom = bottom.multiply(BigInteger.valueOf(share));
	
	    return mul(balls-1, share-1);
	    }
    }
}