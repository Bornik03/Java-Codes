#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/time.h>
#include <sys/resource.h>

int main() {
    pid_t child_pid = fork();

    if (child_pid == 0) {
        printf("Child process is running, PID = %d\n", getpid());
        printf("Nice value in child is %d\n", nice(-10));
    } else {
        // This is the parent process. Keep its nice value.
        printf("Parent process is running, PID = %d\n", getpid());
        printf("Nice value in parent is %d\n", nice(0));
    }

    return 0;
}