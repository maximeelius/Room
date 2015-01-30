public class tester//need a way to decorate the rooms upon creation
{
   public static void main(String[] args)
   {
   int choice = 0;
   LinkedList temp = new LinkedList();
   temp.buildRoomList(6);
   Node nNode = temp.head;
   Room curRoom = temp.head.rooms[1];
   do
   {
   if((curRoom.getDescription()).substring(0, 9).compareTo("Main Room")==0)
      {
      System.out.print("\n\nThe group enters into a " + curRoom.getDescription());
      choice = MainRoom.roomMenu();
      curRoom = MainRoom.roomChange(nNode, choice);
      if(choice ==2)
         nNode = nNode.next;
      System.out.print("\n\nThe group enters into a " +curRoom.getDescription());   
      }
   else   
      if((curRoom.getDescription()).substring(0, 9).compareTo("Side Room")==0) //WE are In A side Room
         {
         curRoom = SideRoom.roomChange(nNode);
       //  System.out.print("\n\nThe group re-enters into a " + curRoom.getDescription());
         }
   
   
   }while(nNode.next!=null);//come up w/ condition
   }
}