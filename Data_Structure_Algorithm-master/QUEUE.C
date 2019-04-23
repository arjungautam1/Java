//program to implement linear queue in C
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define SIZE 5
struct queue
{
 int item[SIZE];
 int rear;
 int front;
};
typedef struct queue queueType;
void insertItem(queueType*);
void deleteItem(queueType*);
void display(queueType*);
void main()
{
 int ch;
 queueType *q;
 q->rear=-1;
 q->front=0;
 clrscr();
 printf("\nMenu for program :");
 printf("\n 1:Insert \n2:delete \n 3:display\n4:exit\n");
 do
 {
  printf("Enter your choice :");
  scanf("%d",&ch);
  switch(ch)
  {
   case 1:
   insertItem(q);
   break;
   case 2:
   deleteItem(q);
   break;
   case 3:
   display(q);
   break;
   case 4:
   exit(1);
   break;
   default:
   printf("Enter between 1 to 4 ,your choice is wrong");
   break;
  }
 }
 while(ch<5);
}
void insertItem(queueType *q)
{
 int d;
 printf("\nEnter the data to be inserted :");
 scanf("%d",&d);
 if(q->rear==SIZE-1)
 {
  printf("The queue is full.\n");
 }
 else
 {
 q->rear++;
 q->item[q->rear]=d;
 }
}
void deleteItem(queueType *q)
{
 int i;
 if(q->rear<q->front)
 {
  printf("Queue is empty.");
 }
 else
 {
  printf("Deleted item is:");
  printf("%d\n",q->item[q->front]);
	for(i=0;i<q->rear;i++)
	{
		 q->item[i]=q->item[i+1];
	}
	q->rear--;
 }
}
void display(queueType *q)
{
 int i;
 if(q->rear<q->front)
 {
  printf("\nQueue is empty.");
 }
 else
 {
  for(i=q->front;i<q->rear;i++)
  {
   printf("%d\t",q->item[i]);
  }
 }
}



