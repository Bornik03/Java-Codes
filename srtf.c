#include<stdio.h>
#include <stdbool.h>
#include <limits.h>
void findWaitingTime(int processes[], int n, int bt[], int wt[], int at[]) {
    int rt[n];
    for (int i = 0; i < n; i++)
        rt[i] = bt[i];
    int complete = 0, t = 0, minm = INT_MAX;
    int shortest = 0, finish_time;
    bool check = false;
    while (complete != n) {
        for (int j = 0; j < n; j++) {
            if ((at[j] <= t) && (rt[j] < minm) && rt[j] > 0) {
                minm = rt[j];
                shortest = j;
                check = true;
            }
        }
        if (check == false) {
            t++;
            continue;
        }
        rt[shortest]--;
        minm = rt[shortest];
        if (minm == 0)
            minm = INT_MAX;
        if (rt[shortest] == 0) {
            complete++;
            check = false;
            finish_time = t + 1;
            wt[shortest] = finish_time - bt[shortest] - at[shortest];
            if (wt[shortest] < 0)
                wt[shortest] = 0;
        }
        t++;
    }
}
void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    for (int i = 0; i < n ; i++)
        tat[i] = bt[i] + wt[i];
}
void findavgTime(int processes[], int n, int bt[], int at[]) {
    int wt[n], tat[n], total_wt = 0, total_tat = 0;
    findWaitingTime(processes, n, bt, wt, at);
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
    findavgTime(processes, n, burst_time, arrival_time);
    return 0;
}