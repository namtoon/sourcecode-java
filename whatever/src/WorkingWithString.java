
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "Apirak";
        int age = 23;
        String result =  name + " " + age; // gen1
        System.out.println(result);
        
        StringBuffer buffer = new StringBuffer ();// gen2
        buffer.append(name).append(" ").append(age); 
        System.out.println(buffer.toString());
       
        StringBuilder builder = new StringBuilder(); //gen3
        builder.append(name).append(" ").append(age);
        System.out.println(builder.toString());
        
        String result2 = String.format("%s %d", name, age); //gen4
        System.out.println(result2);
        
    }

}
