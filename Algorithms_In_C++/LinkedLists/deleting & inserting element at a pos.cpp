#include <iostream>
using namespace std;
class node
{
public:
    int data;
    node *next;
    node(int d)
    {
        data = d;
        next = 0;
    }
};
void firstnode(node * &head,node * &traverse,int d)
{
    node *n = new node(d);
    n->next=0;
    head = n;
    traverse = n;
}
void insertnode(node*&head,node*&traverse,int d)
{
    node *n = new node(d);
    n->next =0;
    traverse->next = n;
    traverse = n;
}
void insertnode(node*&head,int d,int pos)
{
    node *temp=head;
    pos--;
    while(pos--)
    {
        temp=temp->next;
    }
    node *n =new node(d) ;
    n->next = temp->next;
    temp->next = n;
}

void deletenode(node*&head,int d)
{
    node*n=head;
    while(n->next->data!=d)
        n=n->next;
    node*ptr;
    ptr=n->next;
    n->next = ptr->next;
    delete(ptr);
}
void print(node *&head)
{
    node*temp = head;

    while(temp!=0)
    {cout << temp->data << " ";
    temp  = temp->next;}
}
int main()
{
    node * head = 0;
    node * traverse =0;
    firstnode(head,traverse,2);
    insertnode(head,traverse,4);
    insertnode(head,traverse,7);
    insertnode(head,traverse,8);
    insertnode(head,traverse,9);
    cout << "enter num and pos- \n";
    int n,pos;
    cin >> n >> pos;
    insertnode(head,n,pos);
    print(head);

    cout << "enter num you wanna delete babyy - \n";
    cin >> n;
    deletenode(head,n);
    print(head);

}
