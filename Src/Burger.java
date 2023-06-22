public class Burger {


    public class Main {
        public static class BurgerMain {

            public static void main(String[] args) {

                burger burger1 = new burger();

                burger burger2 = new burger(true, true, true, true);

                burger burger3 = new burger(true, true, true, true, true);

            }

        }

        static class burger {

            private boolean bun;

            private boolean meat;

            private boolean cheese;

            private boolean lettuce;

            private boolean mayonnaise;

            public burger() {

                this.bun = true;

                this.meat = true;

                this.cheese = true;

                this.lettuce = true;

                this.mayonnaise = true;

                System.out.println("Regular burger with the following ingredients: bun, meat, cheese, herbs, mayonnaise");

            }

            public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {

                this.bun = bun;

                this.meat = meat;

                this.cheese = cheese;

                this.lettuce = lettuce;

                this.mayonnaise = false;

                System.out.println("Diet burger with the following ingredients: bun, meat, cheese, herbs, no mayonnaise");

            }

            public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {

                this.bun = bun;

                this.meat = meat;

                this.cheese = cheese;

                this.lettuce = lettuce;

                this.mayonnaise = mayonnaise;


                System.out.println("Double meat burger with the following ingredients: bun, two pieces of meat, cheese, herbs, mayonnaise");

            }
        }
    }
}
