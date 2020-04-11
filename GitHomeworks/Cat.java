import org.w3c.dom.ls.LSOutput;

public class Cat {

        private  String name;
        private boolean hungry;

        public Cat (String name){
            this.name = name;
            this.hungry = true;
            }


        public  void feed  (String mealName){
                if ( hungry=true) {
                    System.out.println(name + " is eating " + mealName);

                    hungry = false;
                }else {
                    System.out.println(name + " is not hungry");
                }


        }

        public void sleeps (int hours){
            System.out.println(name + " is sleeping " + hours + " hours");
                hungry = true;


        }


        public void play (String toyName){
            System.out.println(name + " is playing with" + toyName);
        }



}
