#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t child_pid = fork();
    if (child_pid > 0) {
        printf("In parent process");
        exit(0);
    } else {
        printf("In child process");
        sleep(60);
    }
    return 0;
}