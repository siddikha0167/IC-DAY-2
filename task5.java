public class task5 {
    public static void main(String[] args) {
        UserRegistration u=new UserRegistration();
        u.register(123,"Ammu");
        u.register("Kanna", 124);
    }
}
class UserRegistration{
    void register(String name,int userId){
        System.out.println("Registered user: " + name + " ID: " + userId);
    }
    void register(int userId, String name){
        System.out.println("Registered ID: " + userId + " user: " + name);
    }
}
