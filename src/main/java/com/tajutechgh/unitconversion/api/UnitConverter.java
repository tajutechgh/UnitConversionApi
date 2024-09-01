package com.tajutechgh.unitconversion.api;

public class UnitConverter {
	
	static void convert(ConversionDetails details) throws UnitConversionException {
		
		String fromUnit = details.getFromUnit();
		
		String toUnit = details.getToUnit();
		
		if (fromUnit.equals("km") && toUnit.equals("mile")) {
			
			LenghtConverter.kilometer2Mile(details);
			
		} else if (fromUnit.equals("mile") && toUnit.equals("km")) {
			
			LenghtConverter.mile2Kilometer(details);
			
		} else {
			
			throw new UnitConversionException("Invalid From and To Units");
		}
	}

}
