class Animal {
    public void move() {

    }

    public void makeSound() {
        
    }
}

class Lion extends Animal {
    @Override
    public void move() {
        System.out.println("사자가 네 발로 달려 갑니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("사자가 표효합니다!");
    }
}

class Elephant extends Animal {  
    @Override
    public void move() {
        System.out.println("코끼리가 천천히 걷습니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("코끼리가 뿌웁~ 하고 울어요!");
    }
}

class Penguin extends Animal {
    @Override
    public void move() {
        System.out.println("펭귄이 미끄러지듯 이동합니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("펭귄이 삐약삐약 울어요!");
    }

    public void swim() {
        System.out.println("펭귄이 수영을 합니다.");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Animal[] a = new Animal[3];

        a[0] = new Lion();
        a[1] = new Elephant();
        a[2] = new Penguin();

        for(int i = 0; i < a.length; i++) {
            a[i].move();
            a[i].makeSound();

            if(a[i] instanceof Penguin) {
                Penguin p = (Penguin) a[i];
                p.swim();
            }
        }
    }
}
