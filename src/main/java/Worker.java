@FunctionalInterface // чтоб компилятор следил за тем чтобы у этого интерфейса всегда был один абстрактный метод
public interface Worker {
    public void work();
}

class Director {

    public static void main(String[] args) {
        Director director = new Director();

        director.forceToWork(new Worker(){ // анонимный класс
            @Override
            public void work() {
                System.out.println("I'm working!");
            }
        });

        // То же самое через лямбда выражение с одной командой
        director.forceToWork(() -> System.out.println("Of course, my sir!"));
    }

    public void forceToWork(Worker worker){
        worker.work();
    }
}
