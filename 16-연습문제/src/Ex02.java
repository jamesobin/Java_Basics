public class Ex02 {   
    public static void main(String[] args) {
        Product[] p = new Product[3];

        p[0] = new Electronics();
        p[1] = new Clothing();
        p[2] = new Food();

        for(int i = 0; i < p.length; i++) {
            p[i].showInfo();

            if(p[i] instanceof Food) {
                Food f = (Food) p[i];
                f.checkExpiration();
            }
        }
    }
}
