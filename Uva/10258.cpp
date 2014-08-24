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
class ScoreBoard{
private:
	int contestantId;
	int totalTime;
	int numberOfQuestionsSolved;
	int penalty;
	map<int,bool> solved;
	map<int,int> penaltyList;
public:
	ScoreBoard(int _id)
	{
		contestantId = _id;
		totalTime = 0;
		numberOfQuestionsSolved = 0;
		penalty = 0;
	}
	ScoreBoard()
	{
	}
	void solvedProblem(int questionNumber,int time)
	{
		if(solved[questionNumber])
			return;
		solved[questionNumber] = true;
		numberOfQuestionsSolved++;
			totalTime += time;
	}

	void  failedProblem(int questionNumber,int time)
	{
		if(solved[questionNumber])
			return;
		penaltyList[questionNumber]+=20;
	}
	bool operator< (ScoreBoard o) const
	{
		if(o.numberOfQuestionsSolved < numberOfQuestionsSolved)
			return true;
		int time1 = totalTime , time2 = o.totalTime;
		if(time1)
			time1+=penalty;
		if(time2)
			time2+=o.penalty;
		if(o.numberOfQuestionsSolved == numberOfQuestionsSolved)
			if(time1 < time2)
				return true;
			else if(time1 == time2)
				return contestantId < o.contestantId;
		return false;
	}
	void calculatePenalty()
	{
		for( map<int,int>::iterator it=penaltyList.begin();it!=penaltyList.end();it++)
		{
			if(solved[it->first])
				penalty+= penaltyList[it->first];
		}
	}
	void print()
	{
		int time = totalTime;
		if(time)
			time+=penalty;
		printf("%d %d %d\n",contestantId,numberOfQuestionsSolved,time);
	}

}contestant[10001];
int main()
{
	freopen("in.txt","r",stdin);
	int T;
	cin>>T;
	getchar();
	getchar();
	while(T--)
	{
		char s[100];
		map<int,int> contList;
		int cnt = 1;
		while((gets(s)) && strlen(s)!=0)
		{
			
			char *pch = strtok(s," ");
			int contestantId = atoi((pch));
			pch = strtok(NULL," ");
			int solvedProblem = atoi((pch));
			pch = strtok(NULL," ");
			int timeOfSubmission = atoi((pch));
			pch = strtok(NULL," ");
			char verdict = (pch)[0];
				
			if(!contList[contestantId])
			{
				
				contList[contestantId] = cnt++;
				contestant[cnt-1] = ScoreBoard(contestantId);
			}
			contestantId = contList[contestantId];

			if(verdict == 'C')
				contestant[contestantId].solvedProblem(solvedProblem,timeOfSubmission);
			else if (verdict == 'I')
				contestant[contestantId].failedProblem(solvedProblem,timeOfSubmission);


		}
		for(int i=1;i<cnt;i++)
			contestant[i].calculatePenalty();
		sort(contestant+1,contestant+cnt);
		for(int i=1;i<cnt;i++)
			contestant[i].print();
		if(T)
			cout<<endl;

	}
	return 0;
}