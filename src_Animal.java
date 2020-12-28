public class Animal {//класс животные
    protected String name;
    protected int run;
    protected int swim;


    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public void info() {
        System.out.println(" name: " + name + " run: "+run+" swim: "+swim);
    }
}
