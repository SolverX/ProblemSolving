#include<iostream>
#include<algorithm>
#include<cstdio>
#include<vector>
#include<stack>
#include<cstring>
using namespace std;
int main()
{
	freopen("in.txt","r",stdin);
	int numberOfCoaches;
	bool first = true;
	while(cin>>numberOfCoaches && numberOfCoaches!=0)
	{
		int tempCoach = 0;
		while(cin>>tempCoach && tempCoach)
		{
			int coach[numberOfCoaches+1];
			coach[0]=tempCoach;
			for(int i=1;i<numberOfCoaches;i++)
				cin>>coach[i];
			stack<int> S;
			int required = numberOfCoaches;
			for(int i=numberOfCoaches-1;i>=0;i--)
			{
					S.push(coach[i]);
				if(!S.empty() && S.top()==required)
				{
					while(!S.empty() &&  S.top()==required)
					{
						required--;
						S.pop();
					}
				}
				

				
			}

			while(!S.empty())
			{
				int c = S.top();
				if(c==required)
					required--;
				else
					break;
				S.pop();
			}
			if(S.empty())
				cout<<"Yes"<<endl;
			else
				cout<<"No"<<endl;
		}
		cout<<endl;

		
	}
	return 0;
}