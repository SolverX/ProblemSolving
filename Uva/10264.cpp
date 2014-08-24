#include<iostream>
#include<cstring>
#include<cstdio>
#include<string>
#include<algorithm>
#include<cstdlib>
#include<vector>
#include<cctype>
#include<map>
#include<cmath>
using namespace std;
int main()
{
	freopen("in.txt","r",stdin);
	int T;
	while(cin>>T)
	{
		T = pow(2,T);
		long sum=0;
		while(T--)
		{
			int temp;
			cin>>temp;
			sum+=temp;
		}
		cout<<sum<<endl;
	}
	return 0;
}