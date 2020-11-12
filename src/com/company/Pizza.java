package com.company;



public class Pizza {

        String pizza;
        String menuNumber;
        String pizzacount;
        String pris;
    /**
     * Class that creates the object pizza
     * Constructor with 4 parameters
     */
        public Pizza(String menuNumber, String pizza, String pris, String pizzacount){
            this.pizza = pizza;
            this.menuNumber = menuNumber;
            this.pizzacount = pizzacount;
            this.pris = pris;
        }

        public String getPizza(){
            return pizza;
        }

        public String getMenuNumber(){
            return menuNumber;
        }

        public String getPris(){
            return pris;
        }

        public String setPris(String pris){
            this.pris = pris;
            return pris;
        }

        public String getPizzacount(){
            return pizzacount;
        }

        public String setPizzacount(String pizzacount){
            this.pizzacount = pizzacount;
            return pizzacount;
        }

    /**
     * ToString method
     * @return the constructor in string format
     */

    public String toString(){
            return this.menuNumber + ". " + this.pizza + ".   Pris:" + this.pris + ".   Antal pizza købt:" + this.pizzacount;
        }
    }