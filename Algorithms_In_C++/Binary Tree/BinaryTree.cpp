#include<iostream>
#include<queue>
using namespace std;

class Node{
public:
    int data;
    Node* left, *right;

    Node(int d){
        data=d;
        left=NULL;
        right=NULL;
    }
};

class BinaryTree{
private:
    Node * root;
public:
    BinaryTree(){root=NULL;}

    Node* TakeInputRec(){///private function
        int d,c;
        cout<<"Enter the data";
        cin>>d;
        if (d==-1) return NULL;
        Node*n=new Node(d);
        n->left=TakeInputRec();
        n->right=TakeInputRec();
        return n;
    }

    void TakeInput(){///public function
        root=TakeInputRec();
        cout<<endl;
    }

    void PrintPreOrder(Node* rt){
        if (rt==NULL) return;
        cout<<rt->data<<" ";
        PrintPreOrder(rt->left);
        PrintPreOrder(rt->right);
    }

    void PrintPreOrder(){///public function
        cout<<"PreOrder:";
        PrintPreOrder(root);
        cout<<endl;
    }
    void PrintPostOrder(Node* rt){
        if (rt==NULL) return;
        PrintPostOrder(rt->left);
        PrintPostOrder(rt->right);
        cout<<rt->data<<" ";
    }

   void PrintPostOrder(){///public function
        cout<<"PostOrder:";
        PrintPostOrder(root);
        cout<<endl;
    }

   void PrintInOrder(Node* rt){
        if (rt==NULL) return;
        PrintInOrder(rt->left);
        cout<<rt->data<<" ";
        PrintInOrder(rt->right);
    }

   void PrintInOrder(){///public function
        cout<<"InOrder:";
        PrintInOrder(root);
        cout<<endl;
    }

    Node* LevelOrderInput(){
        int d;
        cout<<"enter root data:";
        cin>>d;
        Node * n=new Node(d);

        queue<Node*> q;
        q.push(n);
        while (!q.empty()){
            Node* f=q.front();
            q.pop();
            cout<<"Enter data for left node for data-"<<f->data<<":";
            cin>>d;
            if (d!=-1) {
                f->left=new Node(d);
                q.push(f->left);
            }
            cout<<"Enter data for right node for data-"<<f->data<<":";
            cin>>d;
            if (d!=-1) {
                f->right=new Node(d);
                q.push(f->right);
            }
         }
        return n;
    }
    void TakeLOInput(){
        root=LevelOrderInput();
        cout<<endl;
    }

    void PrintLevelOrder(){
        if (root==NULL) return;
        queue<Node*> q;
        q.push(root);
        q.push(NULL);

        while (!q.empty()){
            Node* f=q.front();
            q.pop();
            if (f==NULL){
                cout<<endl;
                if (!q.empty()) q.push(NULL);
            } else{
                cout<<f->data<<" ";
                if (f->left!=NULL) q.push(f->left);
                if (f->right!=NULL) q.push(f->right);
           }
        }
        cout<<endl;
    }
    void PrintAllLeaves(Node* rt){
        if (rt==NULL) return;
        if (rt->left==NULL && rt->right==NULL){
            cout<<rt->data<<" ";
            return;
        }
        PrintAllLeaves(rt->left);
        PrintAllLeaves(rt->right);
    }
    void PrintAllLeaves(){
        cout<<"Leaves:";
        PrintAllLeaves(root);
        cout<<endl;
    }
    int Height(Node* rt){
        if (rt==NULL) return -1;
        return max(Height(rt->left),Height(rt->right))+1;
    }
    int Height(){
        return Height(root);
    }
    int Depth (Node* rt, int k, int d){
        if (rt==NULL) return -1;
        if (rt->data==k) return d;
        int ans=Depth(rt->left,k,d+1);
        if (ans!=-1) return ans;
        return Depth(rt->right,k,d+1);
    }
    int Depth(int k){
        return Depth(root,k,0);
    }

    Node* DeleteLeaves(Node* rt){
    }

    void DeleteLeaves(){
        root=DeleteLeaves(root);
        PrintLevelOrder();
    }

    void Duplicate(Node * rt){
    }

    void Duplicate(){
        Duplicate(root);
    }
    bool FindNode(Node* root,int k)
    {

        if(root->data==k) return true;
        ///if(root->left==NULL&&root->right==NULL) return 0;
        return FindNode(root->left,k);
        return FindNode(root->right,k);
    }
    bool FindNode(int k)
    {
        return FindNode(root,k);
    }

};


int main(){
    BinaryTree T;
    T.TakeInput();
    ///T.TakeLOInput();
    T.PrintPreOrder();
    T.PrintInOrder();
    T.PrintPostOrder();
    T.PrintLevelOrder();
    cout<<"Height:"<<T.Height()<<endl;
    cout<<"Depth:"<<T.Depth(5)<<endl;
    T.PrintAllLeaves();
    int k;
    cin>>k;
    cout<<T.FindNode(k)<<endl;
    ///T.DeleteLeaves();
    ///T.GetDia();
}
