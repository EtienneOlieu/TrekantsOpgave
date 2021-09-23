public class Triangle {
    //attributter for trekanten - vi er kun interesserede i siderne
    private int aSide;
    private int bSide;
    private int cSide;

    public Triangle (int aSide, int bSide,int cSide){
        //konstruktørmetoden der kan kaldes på for at instantiere trekanten
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    //metode til at finde ud af hvilken slags trekant der er blevet lavet
    public String getType () {
        String type = "I am not sure what I am";

        if (aSide >= bSide + cSide || bSide >= aSide + cSide || cSide >= aSide + bSide){
            type = "Invalid - I am not a triangle\nYou need to at least try to make a triangle. It wont work like this.";
         } else if (aSide==bSide && bSide==cSide){
            type = "I am an equilateral triangle, all of my sides have the same length.\nThis is a good clean one, nice for beginners.";
        } else if (aSide == bSide && bSide != cSide || aSide != bSide && cSide == aSide || cSide == bSide && cSide != aSide){
            type = "I am an isosceles, only two of my sides have the same length.\nNow we are getting somewhere!";
        } else if (aSide != bSide && bSide != cSide && cSide != aSide){
            type = "I am a scalene triangle, none of my sides have the same length.\nThat's good work kid, these aren special triangles and should always be treasured whenever they are found.";
        }
        return "Your triangle says: " + type+"\n";
    }

    @Override
    public String toString() {
        return "Triangle " + " side a = " + aSide + ", side b = " + bSide + ", side c = " + cSide + '.'+"\n";
    }
}
