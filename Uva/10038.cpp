#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>
#include<cstdio>
#include<cstdlib>
#include<cstring>
using namespace std;
int main()
{
	//freopen("in.txt","r",stdin);
	int N;
	while(cin>>N)
	{
		int last,current;
		bool diff[N+1],jolly=true;
		memset(diff,false,sizeof(diff)+1);
		for(int i=0;i<N;i++)
		{
			cin>>current;
			
			if(i>0)
			{
				diff[abs(last-current)]=true;
			}

			last=current;
		}
		for(int i=1;i<N;i++)
		{
			if(!diff[i])
			{
				jolly = false;
				break;
			}
		}
		if(jolly)
			cout<<"Jolly"<<endl;
		else
			cout<<"Not jolly"<<endl;
	}
	return 0;
}