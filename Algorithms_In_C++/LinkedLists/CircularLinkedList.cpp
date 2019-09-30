#include<iostream>
using namespace std;
class node
{
public:
	int data;
	node *next;
	
	node()
	{
		next = NULL;
	}
};
node*head = NULL;
void insert(int x)
{
	node *temp =  new node;
	temp->data=x;
	if(head == NULL)
	{
		cout<<"executing";
		head=temp;
	}
	else if(head->next==NULL)
	{
		head->next = temp;
		temp->next = head;
	}
	else
	{
		node *ptr= new node;
		ptr = head;
		while(ptr->next!=head)
		{
			ptr = ptr->next;
		}
		ptr->next=temp;
		temp->next=head;
	}
}
void display()
{
	if(head==NULL)
	{
		cout<<"underflow";
		return;
	}
	node *temp =  new node;
	temp=head;
	while(temp->next!=head)
	{
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	cout<<temp->data;
}
void del()
{
	if(head==NULL)
	{
		cout<<"underflow";
	}
	else if(head->next ==NULL)
	{
		head=NULL;
	}
	else
	{
		node *temp=new node;
		temp =  head;
		while(temp->next!=head)
		{
			cout<<temp->data<<" ";
			temp=temp->next;
		}
		temp->next = temp->next->next;
		head= temp->next;
		
	}
}
int main()
{
	/* code */
	for(int i=0; i<10; ++i)
	{
		insert(i);
	}
	display();
	cout<<endl;
	del();
	cout<<endl;
	display();
	return 0;
}
