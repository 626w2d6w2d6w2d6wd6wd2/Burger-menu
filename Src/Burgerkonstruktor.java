public class Burgerkonstruktor {

    public class Burger {
        protected class burger {

            private String bun;

            private String meat;

            private String cheese;

            private String lettuce;

            private String mayonnaise;


            public burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {

                this.bun = bun;

                this.meat = meat;

                this.cheese = cheese;

                this.lettuce = lettuce;

                this.mayonnaise = mayonnaise;

                System.out.println("Composition of a regular burger: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise);

            }


            public burger(String bun, String meat, String cheese, String lettuce) {

                this.bun = bun;

                this.meat = meat;

                this.cheese = cheese;

                this.lettuce = lettuce;

                this.mayonnaise = "";

                System.out.println("Diet burger composition: " + bun + ", " + meat + ", " + cheese + ", " + lettuce);

            }


            public burger(String bun, String meat, String cheese, String lettuce, String mayonnaise, int meatCount) {

                this.bun = bun;

                this.meat = meat;

                this.cheese = cheese;

                this.lettuce = lettuce;

                this.mayonnaise = mayonnaise;

                if (meatCount == 2) {


                    System.out.println("Double meat burger composition: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise);
                    }
                }
            }
        }
    }