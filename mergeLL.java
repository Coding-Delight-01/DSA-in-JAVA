// Merged two LL (commented out) and Sum Two LL LeetCode

import java.io.*;

class Node
{
    int data;
    Node next;

   /* Node(int d)
    {
        data = d;
        next = null;
    } */

}


class LinkedList
{
    Node head= null;

    void insert(int data) 
    {
        Node n = new Node();
        n.data = data;
        n.next = null;


        if(head== null)
        head = n;

        else
        {
            Node no = head;
            while(no.next!=null) 
            {
                no=no.next;
            }
            
            no.next = n;
        
        }
    }

    void merge(LinkedList q)                          //    MERGE OF TWO LL
    {
        Node h1 = head;
        Node h2 = q.head;

        while(h1!=null && h2!= null)
        {
            Node t1= h1.next;
            Node t2= h2.next;

            h1.next= h2;
            h2.next = t1;

            h1= t1;
            h2= t2;

        }
        
        q.head= h2;                      // change the head of 2nd LL ie. q to next node(that is to be inserted next)

    }


    void display()
    {
        Node x= head;
        while(x!=null)
        {
            System.out.print(x.data + " ");
            x=x.next;
        }

    }



    public  int ADD(LinkedList l)
    {
        Node t=l.head;
        int f=1,n=0;
        while(t!=null)
        {
            n=(t.data)*f+n;
            f*=10;
            t=t.next;
         }
        return n;
    }


    void ADDList(int n3)
    {
        int temp=n3;
        
        Node ll=new Node();
        
        do
        {
        // Node l3=new Node();
        // ll.next=l3;
           
           int x=temp%10;
            temp/=10;

            insert(x);
            
        // ll.data=x;
        //  ll=l3;
        //  System.out.println("digit  "+x+" node  "+ll.data); 
            
        }while(temp!=0);
        
       // return ll;


    }



    //merge two sorted LL
    void mergeTwoLists(LinkedList ll1, LinkedList ll2) 
    {
          
        Node l1=ll1.head;
        Node l2=ll2.head;
        Node n= new Node();
        n.next=null;
        System.out.print("\n"+n.data +" =initial n  "+ "\n obj.head.data  "+ l1.data + " obj2.head.data  "+l2.data);
        if(l1.data<l2.data)
        {
            n.data=l1.data;
            l1=l1.next;
        }
        
        else if(l1.data>l2.data)
        {
            n.data=l2.data;
            l2=l2.next;
        }

            System.out.print("\n should be smaller of two "+n.data +"  "+ " obj.head.next.data  "+ l1.data);
        while(l1.next!=null || l2.next!=null)
        {
            System.out.print ("\n inside loop "+n.data +" *\n");

            if(l1.data<l2.data)
            {
                n.data=l1.data;
                l1=l1.next;
            }
            
            else if(l1.data>l2.data)
            {
                n.data=l2.data;
                l2=l2.next;
            }
            else if(l1.data==l2.data)
            {
                n.data=l1.data;
                n=n.next;
                n.data=l2.data;
            }
            
            n=n.next;
        }
        
        //return n;
    }
}
        













public class mergeLL
{ public static void main(String args[]) throws IOException
    {
        LinkedList obj = new LinkedList();    // for 1st LL
        LinkedList obj2 = new LinkedList();    // for 2nd LL
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter no of nodes in 1st linked list");  // 1st LinkedList
        int n= Integer.parseInt(br.readLine()) ;
        System.out.println("enter the nodes data of 1st LL");
        for(int x=0;x<n;x++)
        {
            int no= Integer.parseInt(br.readLine()) ;
            obj.insert(no);

        }


        System.out.println("\n enter no of 2nd linked list");      // 2nd LL
        int n2= Integer.parseInt(br.readLine()) ;
        System.out.println("\n enter the nodes data of 2nd LL");
        for(int y=0;y<n2;y++)
        {
            int no2= Integer.parseInt(br.readLine()) ;
            obj2.insert(no2);

        }

        System.out.println("\n the 1st linked list is \t HEAD NODE IS " + obj.head.data);   // TO ACCESS NODE obj.head.data
        obj.display();
   
        System.out.println("\n the 2nd linked list is \t HEAD NODE IS " + obj2.head.data);
        obj2.display();
        
     LinkedList L3 = new LinkedList(); 
     L3.mergeTwoLists(obj,obj2);
     System.out.println("\n merge sorted");
     L3.display();








        // obj.merge(obj2);                                                    // MERGING THE 1ST AND 2ND LL

        // System.out.println("\n  \n after merging linked list 1st is");
        // obj.display();



        // System.out.println("\n  \n after merging linked list 2nd is");
        // if(obj2.head!=null) obj2.display();

        // else System.out.println("NULL "); 


        //     int x=obj.ADD(obj);
        //     int y=obj.ADD(obj2);
        //     System.out.println("\nRev Numb1 is "+x+"\nnumber 2 is"+ y);

        //     int summ=x+y;
        //  LinkedList sum = new LinkedList(); 
        //  sum.ADDList(summ);
        //  System.out.println("\n Sum is (reversed)");
        //  sum.display();


    }
                      
}

