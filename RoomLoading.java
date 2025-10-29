public class RoomLoading
{

    private int roomNumber;
    private final  String[] rooms = {"The start", "The "};


    /**
     * @param info
     * [2] Room number
     */
    public RoomLoading(int[] info)
    {

        roomNumber = info[2];

    }


    @Override
    public String toString()
    {
        return "[CURRENT ROOM]: " + rooms[roomNumber] + "[CURRENT NUMBER]: " + roomNumber;
    }

}