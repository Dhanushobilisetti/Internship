class TreeNode
{
	TreeNode children;
	int c;
	boolean isleaf;
	public TreeNode()
	{
		children =new TreeNode[26];
		isleaf=false;
		c=0;
	}
}
class Main
{
	static void insert(TreeNode root,String x)
	{
		TreeNode curr=root;
		for(char c:x.tocharArray())
		{
			if(curr.children[c-'a']==null)
			{
				TreeNode t=new TreeNode();
				currchildren[c-'a']=t;
			}
			currchildren[c-'a'].c+=1;
			curr=curr.children[c-'a'];
		}
		curr.isleaf=true;
	}
	static Boolean search(TrreNode root,string x)
	{
		TreeNode=curr;
		for(char c:x.tocharArray())
		{
			if(curr.children[c-'a']==null)
			{
				return false;
				curr=curr.children[c-'a'];
			}
			return true;
		}
	}
	public static void main(String args[])
	{
		TreeNode root=new TreeNode();
		String s[]={"and","ant","an","bat","ball","bot","do","dad","does","gard","green"};
		for(String s1:s)
		{
			insert(root,s1);
		}
		String x="ba";
		boolean f=search(root,x);
		System.out.println(f);
	}
} 


	
