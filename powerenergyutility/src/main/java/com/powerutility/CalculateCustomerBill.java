package com.powerutility;

public class CalculateCustomerBill {
	
	public static double ResidentialElectricBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*5.5;
	}
	
	public static double CoomercialElectricBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*7.5;
	}
	
	public static double ResidentialWaterBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*2.5;
	}
	
	public static double CoomercialWaterBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*4.5;
	}
	
	public  double NonStaticResidentialElectricBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*5.5;
	}
	
	public  double NonStaticCommercialElectricBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*7.5;
	}
	
	public  double NonStaticResidentialWaterBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*2.5;
	}
	
	public  double NonStaticComercialWaterBill(int InitialReading, int finalReading)
	{
	 return (finalReading- InitialReading)*4.5;
	}
	

}
