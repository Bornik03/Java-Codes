#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
    pid_t child_pid = fork();

    if (child_pid == 0) {
        // This is the child process.
        printf("1. Hello from child\n");
        printf("Bye\n");
    } else {
        // This is the parent process.
        printf("2. Hello from parent\n");
        wait(NULL);  // Wait for the child process to terminate.
        printf("3. Child has terminated\n");
        printf("Bye\n");
    }

    return 0;
}
