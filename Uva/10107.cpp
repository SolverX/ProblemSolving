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
#define SIZE 10000
int main()
{
	freopen("in.txt","r",stdin);
	int numbersInList[SIZE+1];
	int i=0;
	while(cin>>numbersInList[i++])
	{
		sort(numbersInList,numbersInList+i);
		if(i&1)
		{
			cout<<numbersInList[i/2]<<endl;
		}
		else
		{
			int num1 = numbersInList[i/2] , num2 = numbersInList[i/2-1];
			cout<< (num1+num2)/2<<endl;
		}
	}
	return 0;
}