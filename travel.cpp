#include <stdio.h>

#define SIZE 10
#define A_SIZE (1<<(SIZE-1))

int A[A_SIZE+1],ASize;

void subset(int n,int subcnt,int cnt,int itemp,int subsetnumber)
{
	int i;
	int snum;
	if(subcnt == cnt)
	{
		A[ASize++]=subsetnumber;
		return;
	}
	for(i=itemp;i<=n;i++)
	{
		snum=1<<(i-1);
		subset(n,subcnt,cnt+1,i+1,subsetnumber|snum);
	}
}

void travel(int n,int W[SIZE+1][SIZE+1],int P[SIZE+1][A_SIZE+1],int *minlength)
{
	int i,j,k,h;
	int D[SIZE+1][A_SIZE+1]={0}; 
	int V,vj;

	for(i=2;i<=n;i++)
		D[i][0]=W[i][1];

	for(k=1;k<=n-2;k++)
	{
		ASize=0;
		subset(n,k,0,2,0);
		for(h=0;h<ASize;h++) // update
		{
			for(i=2;i<=n;i++)
			{
				D[i][A[h]]=99999;
				for(j=2;j<=n;j++)
				{
					vj=1<<(j-1);
					if((A[h]&vj)!=0)
					{
						if(D[i][A[h]]>W[i][j]+D[j][A[h]^vj])
						{
							D[i][A[h]]=W[i][j]+D[j][A[h]^vj];
							P[i][A[h]]=j;
						}
					}
				}
			}
		}
	}

	V=(1<<n)-1;
	D[1][V^1]=99999;
	for(j=2;j<=n;j++)
	{
		vj=1<<(j-1);
		if(D[1][V^1]>W[1][j]+D[j][(V^1)^vj])
		{
			D[1][V^1]=W[1][j]+D[j][(V^1)^vj];
			P[1][V^1]=j;
		}
	}
	(*minlength)=D[1][V^1];
}

void path(int P[SIZE+1][A_SIZE+1],int q,int r)
{
	if(P[q][r]!=0)
	{
		printf("v%d ",P[q][r]);
		path(P,P[q][r],r^(1<<(P[q][r]-1)));
	}
}

int main()
{
	int i,j;
	int n,W[SIZE+1][SIZE+1]={0},P[SIZE+1][A_SIZE+1]={0},minlength=0;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
			scanf("%d",&W[i][j]);
	travel(n,W,P,&minlength);
	printf("minlength : %d\n",minlength);
	printf("v1 ");
	path(P,1,((1<<n)-1)^1);
	printf("v1\n");
	return 0;
}
