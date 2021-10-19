class AirportTester
{
public static void main(String a[])
{
Airport air=new Airport();
air.setAirportName("KIA");
air.setLocation("Bangalore");
air.setAirportId(1234);


Terminal ter=new Terminal();
ter.terminalId=1234;
ter.terminalName="KING";


air.setTerminal(ter);

System.out.println(air);
}
}


