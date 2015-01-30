public class LinkedList
{
   Node head;
   int length;
   public LinkedList()
   {
      this.head= null;
      length = 0;   
   }
   
   public void addFirst(Node inc)
   {
      if(this.length ==0)
      {
         this.head = inc;
         this.length ++;  
      }
      else
         {
         inc.next = this.head;
         this.head = inc;
         this.length ++;
         }
   }
   
   public void buildRoomList(int length)
   {
      Node nNode;
      for(int x = 0; x< length; x++)
      {
         Room[] room1 = new Room[3];
         room1[0] = new SideRoom();
         room1[0] = new TreasureChest(room1[0]);
         room1[1] = new MainRoom();
         room1[2] = new SideRoom();
         nNode = new Node(room1);
         this.addFirst(nNode); //change to addLast later
      }
   }
}