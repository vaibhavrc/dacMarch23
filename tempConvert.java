class tempConvert{
	public static void main(String args[]){
		float temp=100;
		double cel=(temp-32)/1.8;
		double farh=temp*1.8+32;
		System.out.println("Converted temp. in celcius:"+cel);
		System.out.println("Converted temp. in Fahrenheit:"+farh);	
	}
}