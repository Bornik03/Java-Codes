#include<stdio.h>
#include <stdbool.h>
void findWaitingTime(int processes[], int n, int bt[], int wt[], int quantum, int at[]) {
    int rem_bt[n];
    for (int i = 0 ; i < n ; i++)
        rem_bt[i] = bt[i];
    int t = 0;
    while (1) {
        bool done = true;
        for (int i = 0 ; i < n; i++) {
            if (rem_bt[i] > 0 && at[i] <= t) {
                done = false;
                if (rem_bt[i] > quantum) {
                    t += quantum;
                    rem_bt[i] -= quantum;
                }
                else {
                    t = t + rem_bt[i];
                    wt[i] = t - bt[i];
                    rem_bt[i] = 0;
                }
            }
        }
        if (done == true)
          break;
        t++;
    }
}

void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    for (int i = 0; i < n ; i++)
        tat[i] = bt[i] + wt[i];
}

void findavgTime(int processes[], int n, int bt[], int quantum, int at[]) {
    int wt[n], tat[n], total_wt = 0, total_tat = 0;
    findWaitingTime(processes, n, bt, wt, quantum, at);
    findTurnAroundTime(processes, n, bt, wt, tat);
    printf("Processes    Burst Time     Waiting time    Turnaround Time\n");
    for (int i=0; i<n; i++) {
        total_wt = total_wt + wt[i];
        total_tat = total_tat + tat[i];
        printf("%d\t\t%d\t\t%d\t\t%d\n", i+1, bt[i], wt[i], tat[i]);
    }
    printf("Average waiting time = %f", (float)total_wt / (float)n);
    printf("\nAverage turnaround time = %f", (float)total_tat / (float)n);
}

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    int processes[n], burst_time[n], arrival_time[n];
    for(int i=0; i<n; i++) {
        printf("Enter burst time for process %d: ", i+1);
        scanf("%d", &burst_time[i]);
        printf("Enter arrival time for process %d: ", i+1);
        scanf("%d", &arrival_time[i]);
        processes[i] = i+1;
    }
    int quantum = 2;
    findavgTime(processes, n, burst_time, quantum, arrival_time);
    return 0;
}