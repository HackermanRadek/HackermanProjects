public class Cat {

        private  String name;
        private String sth = " is not hungry";
        private String sth2 = " is hungry";

        public Cat (String name){
            this.name = name;

        }

        public  void feed  (String mealName){
            System.out.println(name + " is eating"  + mealName);
            System.out.println(name + sth);

        }

        public void play (String toyName){
            System.out.println(name + " is playing with" + toyName);
        }

      public void sleeps (int hours){
          System.out.println(name + " is sleeping " + hours + " hours");
          System.out.println(name + sth2);
      }


}
