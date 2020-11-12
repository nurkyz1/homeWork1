public class Main {

    public static void main(String[] args) {
        System.out.println(love(30,20));
        System.out.println(love(20,30));
        System.out.println(love(15,45));
        System.out.println(love(25,40));
        System.out.println(love(9,26));
        System.out.println(love(generateRandomAge(),30));
    }
    public static String love (int age, int temperature ){
        if (age >=20  && temperature >=20 ){
            return "Можно идти гулять ";
        }else if (age<20 && temperature<=28 ) {
          return "Можно идти гулять ";
        }else if (age>45 && temperature <=25){
           return "Можно идти гулять ";
        }else {
           return "Остовайтесь дома";
        }


    }
    public static int generateRandomAge (){
        int age =(int) Math.random();

        return age ;
    }
}
