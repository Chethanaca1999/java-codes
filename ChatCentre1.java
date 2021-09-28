class ChatCentre1
{
public static void main(String a[])
{
ChatCentre centre=new ChatCentre();
centre.items[0]="pani puri";
centre.items[1]= "bale puri";
centre.items[2]="samosa";
centre.items[3]="mandakki";
centre.items[4]="bonda";

ChatCentre centre1=new ChatCentre("SaiChats","rajajinagar",centre.items,"chethana",2,true);

centre1.displayChatCent();
centre1.getItems();
}
}