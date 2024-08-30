#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int next_prime(int num) {
    int c=0;
    for(int i=num+1;;i++)
    {
        for(int j=1;j<=i;j++)
        {
        if(i%j==0)
        c++;
        }
        if(c==2)
        return i;
        c=0;
    }
    return 0;
}
int prev_prime(int num) {
    int c=0;
    for(int i=num-1;i>=0;i--)
    {
        for(int j=1;j<=i;j++)
        {
        if(i%j==0)
        c++;
        }
        if(c==2)
        return i;
        c=0;
    }
    return 0;
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    pid_t child_pid = fork();

    if (child_pid == 0) {
        printf("Previous prime number: %d\n", prev_prime(num));
    } else {
        printf("Next prime number: %d\n", next_prime(num));
        wait(NULL);
    }

    return 0;
}
