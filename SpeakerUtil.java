class SpeakerUtil
{
public static void main(String a[])
{
boolean isConnected=Speaker.onOrOff();
System.out.println(isConnected);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
boolean connected=Speaker.onOrOff();
System.out.println(connected);
Speaker.decVolume();
Speaker.decVolume();
Speaker.decVolume();
Speaker.decVolume();
Speaker.decVolume();
Speaker.decVolume();
Speaker.decVolume();
}

}
