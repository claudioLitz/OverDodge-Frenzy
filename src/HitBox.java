
public class HitBox {
    protected int Width;
    protected int Height;
    protected int[] Coords;
    //public bool Phase;

    protected void SetWidth(int width){
        this.Width = width;
    }

    protected void SetHeight(int Height){
        this.Height = Height;
    }

    protected void SetCoords (int[] Coords){
        this.Coords = Coords;
    }

    protected void GetStatus(){
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Status:   ");
        System.out.println("Width: " + this.Width);
        System.out.println("Height: " + this.Height);

    }
    
    protected void verifyHit(){

    }
}