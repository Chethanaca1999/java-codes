class MncTester
{
public static void main(String a[])
{
Anchor an=new Anchor();
an.name="Anchor";
an.ceo="Noel";
an.headquarters="Mumbai";
String mes=an.message();
System.out.println(mes);
an.display();

BharatForge bh=new BharatForge();
bh.name="BharatForge";
bh.ceo="mr B R Kalyani";
bh.headquarters="pune";
bh.display();

Bharati bhr=new Bharati();
bhr.name="Bharati Enterprices";
bhr.ceo="sunil bharahi mittal";
bhr.headquarters="New Delhi";
bhr.display();

Birla bi=new Birla();
bi.name="Aditya Birla company";
bi.ceo="Ajay Srinivasan";
bi.headquarters="Mumbi";
bi.display();

Britania br=new Britania();
br.name="Britania Industries";
br.ceo="Varun Berry";
br.headquarters="Bangalore";
br.display();

Infosys in=new Infosys();
in.name="Infosys";
in.ceo="salil pareka";
in.headquarters="bangalore";
in.display();

Maruthi mar=new Maruthi();
mar.name="Maruthi Suziki";
mar.ceo="kenichi Ayushka";
mar.headquarters="New Delhi";
mar.display();

MicroMax mi=new MicroMax();
mi.name="Micromax Limited";
mi.ceo="Rahul Sharma";
mi.headquarters="Gurugram";
mi.display();

Tcs tc=new Tcs();
tc.name="Tata Consultancy Service";
tc.ceo="Rajesh Gopinathan";
tc.headquarters="Mumbai";
tc.display();

Wipro wi=new Wipro();
wi.name="Wipro";
wi.ceo="Thierry depollo";
wi.headquarters="Bangalore";
wi.display();
}
}