
public class HitBox {
    public int Width;
    public int Height;
    public int[] Coords;
    //public bool Phase;

    public void Hitbox(int width, int Height, int[] Coords){
        this.Width = width;
        this.Coords = Coords;
        this.Height = Height;
    }


    public void SetWidth(int width){
        this.Width = width;
    }

    public void SetHeight(int Height){
        this.Height = Height;
    }

    public void SetCoords (int[] Coords){
        this.Coords = Coords;
    }

    public int GetWidth(){
        return Width;
    }

    public int GetHeight(){
        return Height;
    }

    public int[] GetCoords(){
        return Coords;
    }


    public void Status(){
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Status:   ");
        System.out.println("Width: " + this.Width);
        System.out.println("Height: " + this.Height);

    }
    
    public void verifyHit(){

    }
}