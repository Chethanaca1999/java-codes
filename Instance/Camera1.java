class Camera1
{
public static void main(String a[])
{

Camera cam=new Camera();
cam.cameraName="VivoS1";
cam.frontCameraPixel=24;
cam.backCameraPixel=62;
System.out.println(cam.cameraName+"\n   "+cam.frontCameraPixel+"  \n "+cam.backCameraPixel);
cam.vivo();
Camera came=new Camera();
cam.cameraName="oppo";
cam.frontCameraPixel=23;
cam.backCameraPixel=61;
System.out.println(cam.cameraName+" \n  "+cam.frontCameraPixel+" \n  "+cam.backCameraPixel);
cam.oppo();
}
}
