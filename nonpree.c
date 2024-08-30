#include<stdio.h>

void findWaitingTime(int processes[], int n, int bt[], int wt[], int priority[], int at[]) {
    wt[0] = 0;
    for (int i = 1; i < n ; i++ ) {
        wt[i] = bt[i-1] + wt[i-1];
        if(wt[i] < at[i])
            wt[i] = at[i];
    }
}

void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    for (int i = 0; i < n ; i++)
        tat[i] = bt[i] + wt[i];
}

void findavgTime(int processes[], int n, int bt[], int priority[], int at[]) {
    int wt[n], tat[n], total_wt = 0, total_tat = 0;
    findWaitingTime(processes, n, bt, wt, priority, at);
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

void priorityScheduling(int processes[], int n, int burst_time[], int priority[], int at[]) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (priority[i] > priority[j]) {
                int temp = priority[i];
                priority[i] = priority[j];
                priority[j] = temp;
                temp = burst_time[i];
                burst_time[i] = burst_time[j];
                burst_time[j] = temp;
                temp = processes[i];
                processes[i] = processes[j];
                processes[j] = temp;
                temp = at[i];
                at[i] = at[j];
                at[j] = temp;
            }
        }
    }
    findavgTime(processes, n, burst_time, priority, at);
}

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    int processes[n], burst_time[n], priority[n], arrival_time[n];
    for(int i=0; i<n; i++) {
        printf("Enter burst time for process %d: ", i+1);
        scanf("%d", &burst_time[i]);
        printf("Enter priority for process %d: ", i+1);
        scanf("%d", &priority[i]);
        printf("Enter arrival time for process %d: ", i+1);
        scanf("%d", &arrival_time[i]);
        processes[i] = i+1;
    }
    priorityScheduling(processes, n, burst_time, priority, arrival_time);
    return 0;
}