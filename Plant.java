public class Plant {
    String plantname;
    String color;
    int height;

    Plant() {
        this("sunflower");
        System.out.println("no parameter constructor");
    }

    Plant(String plantname) {
        this("sunflower", "sunflower1");
        System.out.println(plantname);
    }

    Plant(String plantname, String color) {
       this("yellow",180);
        System.out.println(plantname);
        System.out.println(color);
    }

    Plant(String color, int height) {
        System.out.println(color);
        System.out.println(height);
    }

    Plant(String plantname, String color, int height) {
        this.plantname = plantname;
        this.color = color;
        this.height = height;
    }

    public static void main(String args[]) {
        Plant plant1 = new Plant();
    }
}


