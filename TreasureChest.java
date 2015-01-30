public class TreasureChest extends RoomDecorator
{
   Room room;
   public TreasureChest(Room room)
   {
      this.room = room;
   }

   public String getDescription()
   {
      return room.getDescription() + " with a treasure chest!";
   }
}