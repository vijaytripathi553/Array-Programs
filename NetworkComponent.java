package com.array_interview.programs;

public class NetworkComponent
{
    public static void main(String[] args) {
        int a[]={1,1,1,1,1,1,1,1};
        int b[]={2,2,2,2,2,2,2,2};
        int k=a.length<b.length?a.length:b.length;
        boolean flip=false;
        int m=0;
        int n=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                if(flip==false&&m<k)
                    System.out.print(a[m++]);
                else if(flip==true&&n<k)
                    System.out.print(b[n++]);
            }
            flip=!flip;
        }
    }
}
