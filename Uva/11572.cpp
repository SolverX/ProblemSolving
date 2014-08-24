#include<iostream>
#include<cstring>
#include<string>
#include<cstdio>
#include<map>
#include<cmath>
using namespace std;
int main()
{
	freopen("in.txt","r",stdin);
	int T;
	cin>>T;
	
	while(T--)
	{
		int N;
		cin>>N;
		map<long,long> counts;
		long mx=0;
		long cnt=0;
		long present=0;
		for(int i=1;i<=N;i++)
		{
			long temp;
			cin>>temp;
			if(counts[temp]<=present)
			{
				counts[temp]=i;
				cnt++;
			}
			else
			{
				mx=max(cnt,mx);
				cnt=i-counts[temp];
				present = counts[temp]-1;
				counts[temp]=i;
			}
		}
		mx=max(cnt,mx);
		cout<<mx<<endl;
	}
	return 0;
}