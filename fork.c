#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
int main() {
    pid_t pid1, pid2, pid3, pid4, pid5, pid6, pid7, pid8;

    printf("Parent of all: %d\n", getpid());

    pid1 = fork();

    if (pid1 == 0) {
        printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
        pid2 = fork();
        if (pid2 == 0) {
            printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
            pid4 = fork();
            if (pid4 == 0) {
                printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
                pid7 = fork();
                if (pid7 == 0) {
                    printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
                }
                else {
                    wait(NULL);
                }
            } else {
                pid5 = fork();
                if (pid5 == 0) {
                    printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
                }
                else {
                    wait(NULL);
                }
            }
            wait(NULL);
        } else {
            pid3 = fork();
            if (pid3 == 0) {
                printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
                pid6 = fork();
                if (pid6 == 0) {
                    printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
                }
                else {
                    wait(NULL);
                }
            }
            else {
                wait(NULL);
            }
        }
    } else {
        pid8 = fork();
        if (pid8 == 0) {
            printf("Child with id: %d and its Parent id: %d\n", getpid(), getppid());
        }
        else {
            wait(NULL);
        }
    }

    return 0;
}