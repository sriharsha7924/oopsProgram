package gift.newyear;

public class Halva extends Sweets{
	public Halva() {
		 
    }
 
 @Override
   public void sweet() {
        System.out.println("Sweet is Halva");
    }
 @Override
    public String getSweetName() {
        return "Halva";
    }
}
