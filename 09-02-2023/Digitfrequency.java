#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
  char st[1001];
    scanf("%[^\n]%*c", st);
    int freq[10]={0};
    int n=strlen(st);
    for(int i=0;i<n;i++){
        if(st[i]>='0' && st[i]<='9'){
            freq[st[i]-'0']++;
        }
    }
    for(int i=0;i<10;i++){
        printf("%d ",freq[i]);
    }
    return 0;
}
