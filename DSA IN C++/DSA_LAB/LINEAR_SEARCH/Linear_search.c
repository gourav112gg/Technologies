#include<stdio.h>
void main(){
    int arr[100],n,i,val;
    printf("Enter the size of array:");
    scanf("%d",&n);
    printf("Enter the elements of array:");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the value to search:");
    scanf("%d",&val);
    for(i=0;i<n;i++){
        if(arr[i]==val){
            printf("Value found at index %d",i);
            break;
        }
    }

}