public class loops {
    
    public static void main(String[] args){
        while_loop();
        for_loop();
        arreys();
    }
        

    public static void while_loop(){

        int i =0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }

    public static void for_loop(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void arreys(){
        System.out.println("These are the types of cars we have:");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void multi_arreys(){
        int [][] myNumbers = {{1,2,3,4,5}, {6,7,8}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
        }
    }
}
