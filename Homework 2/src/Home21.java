public class Home21 {
    public static void main(String[] args){
        stringMass();
    }

    public static void stringMass(){

        String[][] mass = new String [4][4];
        try {
            String[][] newmass = new String[5][5];

            throw new MyArraySizeException();

        }catch (MyArraySizeException e){
            System.out.println("Ошибка О_о");

        }

    }
}
