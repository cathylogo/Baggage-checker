
public class BaggageChecker {
	
	public static final double MAX_REGULAR_WEIGHT = 22.00;
	public static final double SURCHARGE_PER_KG = 3.00;
	public static final double MAX_CARRYON_DIMENSION = 36;
	public static final double MAX_SUM_DIMENSIONS = 192;
	
	public static boolean allowedWeightIsMoreThanMax(Baggage bag) {
		if(bag.getWeight() > MAX_REGULAR_WEIGHT) {
		return true;
	} else {
		return false;
	}
};		
	
	public static double calculateWeightSurcharge(Baggage bag) {
		double result =(bag.getWeight()-MAX_REGULAR_WEIGHT)* SURCHARGE_PER_KG;
		return result;
	};
	    // if one of the condition is true and other are false then it's should return false otherwise 
	    //  return true
	public static boolean  canBeUsedAsACarryOn(Baggage bag) {
		if (bag.getLength()< MAX_CARRYON_DIMENSION &&
			bag.getWidth()<MAX_CARRYON_DIMENSION && 
			bag.getHeight()<MAX_CARRYON_DIMENSION) 
			return true;
		else {
			return false;
		}
		
	};
	
	public static boolean sumDimensionsExceedsMax(Baggage bag) {
		int result = (bag.getHeight() +bag.getWidth() +bag.getLength());
		if (result > MAX_SUM_DIMENSIONS ) {
		   return true;
	    } else {
		   return false;
	   }
    }
	
}
	

	
