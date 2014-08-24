#include<iostream>
#include<cstring>
#include<cstdio>
#include<string>
#include<algorithm>
#include<cstdlib>
#include<vector>
#include<map>
#include<cmath>
using namespace std;
int getRoot(int n)
{
	int val;
	val = sqrt(n);
	if(val*val==n && !(val&1)) 
		val-=2;
	else if(val&1)
	 	val-=1;
	return val;
}
int main()
{
	freopen("in.txt","r",stdin);
	int lengthOfSide , numberToFind;
	while(cin>>lengthOfSide>>numberToFind && (lengthOfSide!=0 || numberToFind!=0))
	{
		int root = getRoot(numberToFind);
		int cornerNumber = root * root +1;
		int difference = numberToFind - cornerNumber;
		int currentX = ((lengthOfSide-1)-root)/2 +1;
		int currentY = ((lengthOfSide-1)-root)/2 +1;
		if(difference > 0)
		{
			if(difference - root > 0)
			{
				difference -= root;
				currentY += root;
			}
			else
			{
				currentY += difference;
				difference = 0;
			}

		}
		root++;
		if(difference > 0)
		{
			if(difference - root > 0)
			{
				difference -= root;
				currentX += root;
			}
			else
			{
				currentX += difference;
				difference = 0;
			}

		}
		if(difference > 0)
		{
			if(difference - root > 0)
			{
				difference -= root;
				currentY -= root;
			}
			else
			{
				currentY -= difference;
				difference = 0;
			}

		}

		if(difference > 0)
		{
				currentX -= (difference);
		}

		printf("Line = %d, column = %d.\n",currentX,currentY);
	}
	return 0;
}