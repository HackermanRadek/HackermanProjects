import org.w3c.dom.ls.LSOutput;

public class Cat {

        private  String name;
        private boolean hungry;

        public Cat (String name){
            this.name = name;
            this.hungry = true;

            if (hungry= true){
                System.out.println(name + " is hungry");
            }else if (hungry=false){
                System.out.println(name + " is not hungry ");
            }

            }

        public  void feed  (String mealName){

            System.out.println(name + " is eating " + mealName);

            hungry=false;


        }

        public void sleeps (int hours){
            System.out.println(name + " is sleeping " + hours + " hours");
                hungry = true;


        }


        public void play (String toyName){
            System.out.println(name + " is playing with" + toyName);
        }



}
