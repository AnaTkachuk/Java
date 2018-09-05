public class Home22 {


    public static void main(String[] args) {
        stringToNum();

    }
    public static void stringToNum() {

        String[][] mass = new String[4][4];

        int[][] numMass = new int[4][4];


        for (int i = 0; i < mass[i].length; i++) {
            for (int j = 0; j < mass[i].length; j++) {

                try {
                    numMass[i][j] = Integer.parseInt(mass[i][j]);

                    throw new MyArrayDataException(3,2);

                }catch (MyArrayDataException e){
                    System.out.println("Опять ошибка");
                }
            }
        }

        int summ = 0;
        for (int i = 0; i < numMass.length; i++) {
            for (int j = 0; j < numMass.length; j++) {
                summ = summ += numMass[i][j];
            }
        }
        System.out.println("Сумма всех чисел" + summ);
    }

}

