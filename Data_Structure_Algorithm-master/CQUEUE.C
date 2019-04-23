//program to implement the circular queue
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define SIZE 5
struct cqueue
{
 int item[SIZE];
 int rear;
 int front;
};
typedef struct cqueue cqType;
void insertItem(cqType*);
void deleteItem(cqType*);
void display(cqType*);
int main()
{
 int ch;
 cqType *q;
 q->rear=SIZE-1;
 q->front=SIZE-1;
 clrscr();
 printf("\n Menu for program :\n");
 printf("1:insert\n2:delete:\n3:display\n4:exit\n");
 do{
 printf("\nEnter your choice :");
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
  printf("Your choice is wrong\n");
  break;
 }
}
while(ch<5);
return 0;
}
void insertItem(cqType *q)
{
 int d;
 if((q->rear+1)%SIZE==q->front)
 printf("Queue is full\n");
 else
 {
  q->rear=(q->rear+1)%SIZE;
  printf("\nEnter data to be inserted:\t");
  scanf("%d",&d);
  q->item[q->rear]=d;
  }
 }
void deleteItem(cqType *q)
{
 if(q->rear==q->front)
  printf("Queue is Empty\n");
  else
  {
   q->front=(q->front+1)%SIZE;
   printf("Deleted items are:\t");
   printf("%d\n",q->item[q->front]);
  }
 }
 void display(cqType *q)
 {
  int i;
  if(q->rear==q->front)
   printf("Queue is Empty\n");
   else
   {
    printf("Items of queue are :\n");
    for(i=(q->front+1)%SIZE;i!=q->rear;i=(i+1)%SIZE)
    {
     printf("%d\t",q->item[i]);
    }
    printf("%d\t",q->item[q->rear]);
   }
  }
