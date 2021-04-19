
package l8hassignment1.L8HASSIGNMENT1;


public class tape extends Publication {
    protected double playingtime;

    public tape() {
    }

    public void setPlayingtime(double playingtime) {
        this.playingtime = playingtime;
    }

    public double getPlayingtime() {
        return this.playingtime;
    }

    public void display() {
        System.out.println("Playing Time: " + this.playingtime + " Minutes");
    }
}
