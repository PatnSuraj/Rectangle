/**
 * Name:- Anantha Suraj Patnaikuni
 * Banner:- B00845171
 * Course:- CSCI 2110 Data Structures and Algorithms
 * Lab-1
 * Professor:- Dr. Srini Sampalli
 * Description:- The purpose of the code is to check whether the given two rectangles are overlapping or touching each other through some methods
 */
// Rectangle class
public class Rectangle {

// Instance variables
    private double xpos, ypos, width, height;

// Constructor, creates the rectangle with specified instance variables
    public Rectangle(double xpos, double ypos, double width, double height) {
        this.xpos = xpos;
        this.ypos = xpos;
        this.width = width;
        this.height = height;
    }

//Getter method for all instance variables
    public double getXpos() { return this.xpos; }
    public double getYpos() { return this.ypos; }
    public double getWidth() { return this.width; }
    public double getHeight() { return this.height; }

//Setter method for all instance variables
    public void setXpos(double xpos) { this.xpos = xpos; }
    public void setYpos(double ypos) { this.ypos = ypos; }
    public void setHeight(double Height) { this.height = Height; }
    public void setWidth(double Width) { this.width = Width; }


//Contains method to check if the rectangle is inside another rectangle
    public boolean contains(double px, double py) {
        return ((px < (xpos + width) && xpos < px) && ((py < (ypos + height ) && ypos < py)));
    }

//Touches method to check if the Rectangle touches another rectangle
    public boolean touches(double px, double py) {
        return ((xpos == px || px == (xpos + width)) || ((ypos == py && py == (ypos + height))));
    }

//Contains method to specify rectangle is inside another rectangle
    public boolean contains(Rectangle r) {
        return (contains(r.getXpos(), r.getYpos()) && contains(r.getXpos()+r.getWidth(), r.getYpos()+r.getHeight()));
    }

//Touches method to specify rectangle touching another rectangle
    public boolean touches(Rectangle r) {
        return (touches(r.getXpos(),r.getYpos()) || touches(r.getXpos()+r.getWidth(),r.getYpos()+r.getHeight()));
    }
}


