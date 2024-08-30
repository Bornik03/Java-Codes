#include <stdio.h>
struct Process {
    int pid;  
    int arrival_time;
    int burst_time;
};
void swap(struct Process *a, struct Process *b) {
    struct Process temp = *a;
    *a = *b;
    *b = temp;
}
void sort_processes(struct Process processes[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].arrival_time > processes[j + 1].arrival_time) {
                swap(&processes[j], &processes[j + 1]);
            }
        }
    }
}
void calculate_times(struct Process processes[], int n, int waiting_time[], int turnaround_time[]) {
    waiting_time[0] = 0;
    for (int i = 1; i < n; i++) {
        waiting_time[i] = waiting_time[i - 1] + processes[i - 1].burst_time;
    }
    for (int i = 0; i < n; i++) {
        turnaround_time[i] = waiting_time[i] + processes[i].burst_time;
    }
}
void calculate_average_times(struct Process processes[], int n) {
    int waiting_time[n], turnaround_time[n];
    float total_waiting_time = 0, total_turnaround_time = 0;

    calculate_times(processes, n, waiting_time, turnaround_time);

    printf("Process\t Arrival Time\t Burst Time\t Waiting Time\t Turnaround Time\n");

    for (int i = 0; i < n; i++) {
        total_waiting_time += waiting_time[i];
        total_turnaround_time += turnaround_time[i];
        printf("%d\t\t %d\t\t %d\t\t %d\t\t %d\n", processes[i].pid, processes[i].arrival_time,
               processes[i].burst_time, waiting_time[i], turnaround_time[i]);
    }
    printf("\nAverage Waiting Time: %.2f\n", total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", total_turnaround_time / n);
}

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    struct Process processes[n];
    for (int i = 0; i < n; i++) {
        printf("Enter Arrival Time and Burst Time for Process %d: ", i + 1);
        scanf("%d %d", &processes[i].arrival_time, &processes[i].burst_time);
        processes[i].pid = i + 1;
    }
    sort_processes(processes, n);
    calculate_average_times(processes, n);
    return 0;
}