public class LinkedList{
    private Node first=null;
    private int p=0;
    public void add(Object ele)
    {
        if(first==null)
        {
            first=new Node(ele,null);
            p++;
            return;
        }
        Node curr=first;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr=new Node(ele,null);
        p++;
    }
    public int size(){
        return p;
    }
}