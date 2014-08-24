#include<iostream>
#include<cstring>
#include<string>
#include<cstdio>
#include<map>
using namespace std;
int main()
{
	freopen("in.txt","r",stdin);
	int T;
	cin>>T;
	getchar();
	getchar();
	while(T--)
	{
		string line;
		map<string,int> treeCount;
		int totalCount=0;
		while(getline(cin,line) && line.length())
		{
			treeCount[line]++;
			totalCount++;
		}
		for(map<string,int>::iterator it=treeCount.begin();it!=treeCount.end();it++)
		{
			printf("%s %.4f\n",(it->first).begin(),((it->second)*100.00)/totalCount);
		}
		if(T)
			cout<<endl;
	}
	return 0;
}