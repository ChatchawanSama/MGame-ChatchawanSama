public class Die {
    private int faceValue;

    public int roll(){
        //Don't have in UML
        int max=6;
        int min=1;
        return (int)(Math.random()*(max-min+1)+min);
        //
    }

    public int getFaceValue() {
        return faceValue;
    }
}
