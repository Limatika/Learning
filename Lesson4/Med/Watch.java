package Lesson4.Med;

public class Watch {
    int hour;
    int minut;
    int second;

    public Watch(int hour, int minut, int second) {
        this.hour = hour;
        this.minut = minut;
        this.second = second;
    }
    public Watch(int second) {
        this.second=second%3600%60;
        hour=second/3600;
        minut=second%3600/60;
    }
    public void Perevodvsec(){
        int summ = 3600*hour+60*minut+second;
        System.out.println("В " +hour+ " часах  "+ minut + " минутах " +second+" секундах  будет "+ summ + " секунд");
    }
    public void Perevodvhour(){
        System.out.println(" Будет  "+hour+" Часов " + minut + " минут  и "+second+" секунд");
    }

}
