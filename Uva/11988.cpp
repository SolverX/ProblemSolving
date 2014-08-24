#include<iostream>
#include<cstdio>
#include<string>
#include<algorithm>
#include<list>
using namespace std;

int main()
{
	freopen("in.txt","r",stdin);
	char S[1000001];
	while((scanf("%s",S))!=EOF)
	{
		list<char> List;
		list<char>::iterator it = List.begin();
		for(int i=0;S[i]!='\0';i++)
		{

			if(S[i]=='[')
			{
				it = List.begin();
				continue;
			}
			if(S[i]==']')
			{
				it= List.end();
				continue;
			}
			List.insert(it,S[i]);
		}
		for(it=List.begin();it!=List.end();it++)
			printf("%c",*it);
		cout<<endl;
	}
	return 0;
}