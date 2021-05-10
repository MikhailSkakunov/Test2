package Lesson7;

public class Cat {
    String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.foodAvailability(appetite)) {
            plate.decreaseFood(appetite);
            System.out.println("Кот начал есть!");
        }
        if (!plate.foodAvailability(appetite)) {
            System.out.println("Очень голодные коты! Еды не хватает!!!");
            System.out.println("Вскрываем новую упаковку Вискас! " + "\n" + "Наполняем миску!");
            plate.addFood(appetite);
            System.out.println("Кот уплетает Вискас!");
            plate.decreaseFood(appetite);
            satiety = true;
            feed();
        }
    }

            public void feed () {
            if (satiety == false)
                System.out.println("Кот голодный!");
            if (satiety == true)
                System.out.println("Кот наелся!");
                System.out.println();
        }


    public Cat(String name, int appetite, boolean satiety){
            this.name = name;
            this.appetite = appetite;
            this.satiety = satiety;

        }
}