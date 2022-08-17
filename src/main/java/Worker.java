@FunctionalInterface // ���� ���������� ������ �� ��� ����� � ����� ���������� ������ ��� ���� ����������� �����
public interface Worker {
    public void work();
}

class Director {

    public static void main(String[] args) {
        Director director = new Director();

        director.forceToWork(new Worker(){ // ��������� �����
            @Override
            public void work() {
                System.out.println("I'm working!");
            }
        });

        // �� �� ����� ����� ������ ��������� � ����� ��������
        director.forceToWork(() -> System.out.println("Of course, my sir!"));
    }

    public void forceToWork(Worker worker){
        worker.work();
    }
}
