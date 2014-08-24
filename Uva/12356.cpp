#include<iostream>
#include<cstdio>
#include<cstring>
#include<cmath>
#include<cstdlib>
#include<algorithm>
#include<string>
#include<vector>
#include<utility>
#include<stack>
#include<map>
#include<queue>
#include<set>
using namespace std;
int main()
{
	//freopen("in.txt","r",stdin);
	int B,S;
	while(scanf("%d %d",&S,&B))
	{
		if(S==0 && B==0)
			break;
		int soldireL[S+2],soldireR[S+1];
		
		for(int i=0;i<=S;i++)
		{
			soldireL[i]=i-1;
			soldireR[i]=i+1;
		}
		int L,R;
		while(B--)
		{
			scanf("%d %d",&L,&R);
			if(soldireL[L] < 1)
				printf("*");
			else
				printf("%d",soldireL[L]);

			if(soldireR[R] > S)
				printf(" *\n");
			else
				printf(" %d\n",soldireR[R]);
			soldireL[soldireR[R]]=soldireL[L];
			soldireR[soldireL[L]]=soldireR[R];
		}
		printf("-\n");

	}
	return 0;
}