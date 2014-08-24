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
int N,n;
int findPos(int pos,string str,string find)
{
	//cout<<str<<" "<<find<<endl;
	int pos1=-1;
	for(int i=pos+1;i<N;i++)
	{
		pos1=i;
		for(int j=0;j<n &&pos1!=-1;j++)
		{
			if( (i+j)<N && str[i+j]!=find[j])
				pos1=-1;
		}
		if(pos1!=-1 && N-i >=n)
			return pos1;
	}
	return -1;
}
int countExistence(string big[],string small[])
{
	int cnt=0;
	//findPos(0,big[0],small[0]);
	for(int i=0;i<N;i++)
	{
		int pos=-1;
		do
		{
			pos = findPos(pos,big[i],small[0]);
			int increment=1;
			if(pos!=-1 && N-pos >=n)
			{
				int k=1;

				for(int j=i+1;j<(i+n) && k<n;j++,k++)
				{
					int pos2 =findPos(pos-1,big[j],small[k]);
					
						if(pos2!=pos)
						{
							increment=0;
							break;
						}
				}
				
				cnt+=increment;
				//cout<<pos<<endl;
			}
			
		}while(pos!=-1);
	}
	return cnt;
}

void rotate(string *small)
{
	string rotated[small[0].size()+2];

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			rotated[i]+=small[n-j-1][i];

	for(int i=0;i<n;i++)
	{
		small[i]="";
		for(int j=0;j<n;j++)
			small[i] += rotated[i][j];
	}

}
int main()
{
	//freopen("in.txt","r",stdin);
	
	while(cin>>N>>n)
	{
		if(N==0 && n==0)
			break;

		string line1[N+1];
		string line2[n+1],tempLine[n+1];
		for(int i=0;i<N;i++)
			cin>>line1[i];
		for(int i=0;i<n;i++)
		{
			cin>>line2[i];
			tempLine[i]=line2[i];
		}

		for(int i=0;i<4;i++)
		{
			if(i!=0)
				cout<<" ";
			cout<<countExistence(line1,line2);
			
			rotate(line2);
		}
		cout<<endl;
	}
	return 0;
}