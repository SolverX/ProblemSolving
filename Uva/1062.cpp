#include<iostream>
#include<algorithm>
#include<cstdio>
#include<vector>
#include<stack>
#include<cstring>
#include<string>
#include<map>
using namespace std;
class ship
{
public:
	string c;
	int first,last;
	int stackNo;

ship()
{
	stackNo = 0;
}
	bool operator < (ship o)const
	{
		if(c > o.c && last<o.first)
			return true;
		return false;
	}
};
ship fun[28];
int curent = 1;
bool canStack(ship A,ship B)
{
	if(A.c < B.c)
		return false;
	if(A.last > B.first)
		return false;
	return true;
}
map<int,bool> stacked;
int findMinimumStacks(int pos)
{
	if(pos==curent-2)
	{
			return 1;
	}
	else if(pos>curent-2)
	{
		return -1;
	}
	int val=1;
	for(int i=pos+1;i<curent-1;i++)
	{
		if(!stacked[i] && canStack (fun[pos],fun[i]))
		{
			stacked[i]=true;
			val += findMinimumStacks(i);
			stacked[i]=false;
		}
		else if(!stacked[i])
		{
			stacked[i]=true;
			val += findMinimumStacks(i)+1;
		}
		 
		
	}
	return val;
	
}
int main()
{
	freopen("in.txt","r",stdin);
	string S;
	int testCase = 0;
	while(cin>>S && S!="end")
	{

		curent=1;
		map<char,int> found;
		for(int i=0;i<S.length();i++)
		{
			if(found[S[i]])
			{
				fun[ found[S[i]] -1 ].last = i;
				continue;
			}
			found[S[i]]=curent++;
			fun[ found[S[i]] -1 ].c = S[i];
			fun[ found[S[i]] -1 ].first = i;
			fun[ found[S[i]] -1 ].last = i;
		}
		sort(fun,fun+curent-1);
		for(int i=0;i<curent-1;i++)
		{
			printf("%s %d %d\n",fun[i].c.begin(),fun[i].first,fun[i].last);
		}
		cout<<canStack(fun[0],fun[1])<<endl;
		printf("Case %d: %d\n",++testCase,findMinimumStacks(0));
	}
	return 0;
}