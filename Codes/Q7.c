#include <stdio.h>

int main()
{
    int year;
    printf("Enter a year: ");
    scanf("%d", &year);
    if (year % 4 == 0)
    {
        printf("Leap Year");
    }
    else if (year % 100 == 0)
    {
        printf("Not Leap Year");
    }
    else if (year % 400 == 0)
    {
        printf("Leap Year");
    }
    else
    {
        printf("Not Leap Year");
    }
    return 0;
}