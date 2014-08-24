#include<iostream>
#include<algorithm>
#include<cstdio>
#include<vector>
#include<stack>
#include<cstring>
#include<string>
using namespace std;
string A,B;
int size;
void backtrack(string s,string formed,string res,int pos,int match)
{
	if(formed.length()== ( (size*2) -1) )
	{
		if(res == B)
		{
			cout<<formed<<endl;
		}
		//cout<<res<<endl;
		return;
	}
	if(pos < A.length() )
	{
		if(pos!=0)
			backtrack(s+A[pos],formed+" i",res,pos+1,match);
		else
			backtrack(s+A[pos],formed+"i",res,pos+1,match);
	}
	if(s.length())
	{
		char c = s[s.length()-1];
		if(c!=B[match])
			return;
		s=s.substr(0, s.length()-1);
		backtrack(s,formed+" o",res+c,pos,match+1);
	}
}
int main()
{
	freopen("in.txt","r",stdin);
	
	while(cin>>A>>B)
	{
		size = B.length();
		size*=2;
		stack<char> X;
		cout<<"["<<endl;
		backtrack("","","",0,0);
		cout<<"]"<<endl;
	}
	return 0;
}