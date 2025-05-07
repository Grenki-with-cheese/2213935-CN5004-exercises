

public class ExceptionsQ
{
   public static void main(String[] args)
   {
	int[] someArray = {12,9,3,11};
	int position = getPosition();
	display (someArray, position);
	System.out.println("End of program" );
    }
    
    static int getPosition()
    {
        try{
            System.out.println("Enter array position to display");
            String positionEntered = EasyScanner.nextString(); // requires EasyScanner class
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        /*} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (NumberFormatException e2 ) {
            System.out.println("General exception");
        }*/
    }
}


