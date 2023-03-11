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
    public Object get(int index)
    {
        if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
        Node curr=first;
        if(index==0) return first.ele;
        for(int i=1;i<=index;i++)
        {
            curr=curr.next;
        }
        return curr.ele;
    }
    public void add(int index,Object ele)
    {
         if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
        Node curr=first;
        if(index==0){
            first=new Node(ele,first);
            p++;
        }
        for(int i=1;i<index;i++)
        {
            curr=curr.next;
        }
        curr=new Node(ele,curr.next);
        p++;
    } 
}
