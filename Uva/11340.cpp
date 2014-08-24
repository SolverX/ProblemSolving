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
	int T;
	cin>>T;
	while(T--)
	{
		int numberOfCharacter;
		map<char,int> amount;
		cin>>numberOfCharacter;
		for(int i=0;i<numberOfCharacter;i++)
		{
			char c;
			int amt;
			cin>>c>>amt;
			amount[c]=amt;
		}

		int numberOfLines;
		cin>>numberOfLines;

		string line;
		double totalAmount = 0;
		getchar();
		while(numberOfLines--)
		{
			getline(cin,line);
			for(int i=0;line[i]!='\0';i++)
				totalAmount+=amount[line[i]];
		}
		printf("%.2lf$\n",totalAmount/100);
		//cout<<totalAmount<<endl;
	}
	return 0;
}