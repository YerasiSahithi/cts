package com;

public class SumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{4,5,6},{3,2,1}};
int b[][]= {{1,2,3},{3,4,5},{5,6,7}};
int c[][]= new int[3][3];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+"");
	}
	System.out.println();
}

	}

}
