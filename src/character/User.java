package character;
import java.util.Arrays;

public class User {
    private int HP;
    private int cooldown_dash;
    private int cooldown_sprint;
    private int cooldown_use;
    private int[] coords;
    private String direction;
    private int accel;
    private int[] stats;

    //Constructor method
    public User(int HP, int cooldown_dash, int cooldown_sprint, int cooldown_use, int[] coords, String direction, int accel, int[] stats ){
        this.HP = HP;
        this.cooldown_dash = cooldown_dash;
        this.cooldown_sprint = cooldown_sprint;
        this.cooldown_use = cooldown_use;
        this.coords = coords;
        this.direction = direction;
        this.accel = accel;
        this.stats = stats;
    }

    //Set methods
    public void SetHp(int HP){
        this.HP = HP;
    }
    public void Setcooldown_dash(int cooldown_dash){
        this.cooldown_dash = cooldown_dash;
    }
    public void Setcooldown_sprint(int cooldown_sprint){
        this.cooldown_sprint = cooldown_sprint;
    }
    public void Setcooldown_use(int cooldown_use){
        this.cooldown_use = cooldown_use;
    }
    public void Setcoords(int[] coords){
        this.coords = coords;
    }
    public void Setdirection(String direction){
        this.direction = direction;
    }
    public void Setaccel(int accel){
        this.accel = accel;
    }
    public void Setstats(int[] stats){
        this.stats = stats;
    }



    public void ShowStatus(){
        System.out.println("Vida: "+this.HP);
        System.out.println("Dash: "+ this.cooldown_dash);
        System.out.println("Sprint: "+ this.cooldown_sprint);
        System.out.println("Usable ability: "+ this.cooldown_use);
        System.out.println("Coords: "+ Arrays.toString(this.coords));
        System.out.println("Direção: "+ this.direction);
        System.out.println("Acceleration: "+ this.accel);
        System.out.println("Stats: "+ Arrays.toString(this.stats));
    }















    protected void move(){

    }

    protected void atk(){

    }
    protected void dash(){

    }
    protected void sprint(){

    }
    protected void damage(){

    }
    protected void interfaceUPD(){

    }
    protected void hitboxUPD(){
        
    }
}
