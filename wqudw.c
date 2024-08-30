#include <stdio.h>
int main()
{
    int n=0;
    printf("Enter size of array");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int temp;
    for(int j=0;j<n-1;j++)
    {
        for(int k=j+1;k<n;k++)
        {
            if(arr[k]<arr[j])
            {
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
        }
    }
    printf("The sorted array is: ");
    for(int l=0;l<n;l++)
    {
        printf("%d ",arr[l]);
    }
}