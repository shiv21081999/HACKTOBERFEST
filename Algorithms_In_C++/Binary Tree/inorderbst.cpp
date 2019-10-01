#include<iostream>
using namespace std;
struct bstnode
{
	bstnode *right;
	bstnode *left;
	int data;
	bstnode *parent;
};
bstnode *getnewnode(int d)
{
	bstnode *node = new bstnode;
	node->data=d;
	node->left=NULL;
	node->right=NULL;
	node->parent=NULL;
	return node;
}
bstnode *insert(bstnode *root, int d)
{
	if(root==NULL)
	{
		//tree is empty;
		root=getnewnode(d);
	}
	else if(d<=root->data)
	{
		root->left=insert(root->left,d);
		root->left->parent=root;
	}
	else
	{
		root->right=insert(root->right, d);
		root->right->parent=root;
	}
	return root;
}
bstnode *search(bstnode *root, int x)
{
	if(root==NULL)
	{
		return root;
	}
	else if(root->data==x)
	{
		return root;
	}
	else if(x <= root->data)
	{
		return search(root->left, x);
	}
	else
	{
		return search(root->right, x);
	}
}
bstnode *findmin(bstnode *root)
{
	if(root==NULL)
	{
		return root;
	}
	else if(root->left)
	{
		return findmin(root->left);
	}
	else 
	{
		return root;
	}
}
bstnode *successor(bstnode *root, int data)
{
	bstnode *curr=search(root, data);
	if(curr==NULL)
	{
		return NULL;
	}
	//node has right subtree
	if(curr->right)
	{
		findmin(curr->right);
	}
	else
	{
		bstnode *successor=NULL;
		bstnode *ancestor=root;
		while(ancestor != successor)
		{
			if(curr->data < successor->data)
			{
				successor=ancestor;
				ancestor=ancestor->left;
			}
			else
			{
				ancestor=ancestor->right;
			}
		}
		return successor;
	}
}
void inorder(const bstnode *root)
{
	if(root==NULL)
	{
		return;
	}
	inorder(root->left);
	cout<<root->data<<endl;
	inorder(root->right);
}
int main()
{
	bstnode *root;//pointer to root node
	root = NULL; //tree is empty
	root=insert(root, 10);
	root=insert(root, 12);
	root=insert(root, 11);
	root=insert(root, 15);
	root=insert(root, 24);
	inorder(root);
}
