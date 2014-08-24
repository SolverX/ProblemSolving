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
int main()
{
	freopen("in.txt","r",stdin);
	char s[55];
	while(cin>>s && s[0]!='#')
	{

		if(next_permutation(s,s+strlen(s)))
			cout<<s<<endl;
		else
			cout<<"No Successor"<<endl;
	}
	return 0;
}