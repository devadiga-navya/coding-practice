/**
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
 * Return 0 if they both go over.
 * */
public int blackjack(int a, int b)
{
	if(a > 21)
	{
		if(b > 21)
			return 0;
		return b;
	}
	if(a < b && b <= 21)
		return b;
	return a;
}