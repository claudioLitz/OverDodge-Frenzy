import character.User;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int[] a = {1,2};
        int[] b = {1, 2, 3};


        User user1 = new User(50,12,12,12,a,"right",1,b);
        user1.ShowStatus();

        //Projectile p1 = new Projectile(1, 1, null, 1, 10, null);
        //p1.GetStatus();
    }
}
