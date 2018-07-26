
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "Apirak1995";
        // System.out.println(name.substring(0, 1));
    int i = 0;
        while (name.length() > i) {
            System.out.println(name.substring(0, 1));
            name = name.substring(1);
            // System.out.println(name.substring(i,i+1));
            // System.out.println(name.charAt(i));
      }
//        for (i=0;i< name.length();i--) {
//            System.out.println(name.substring(0, 1));
//            name = name.substring(1);
//        }

    }

}
