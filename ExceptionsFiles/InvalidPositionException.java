public class InvalidPositionException // requires InvalidPositionException class{
    {
        private int posIn;
        public InvalidPositionException(int posIn) throws Exception
        {
        if (posIn < 0 || posIn > 3)
        {
            throw new Exception("Invalid position");
        }
    }}