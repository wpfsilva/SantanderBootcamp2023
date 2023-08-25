package edu.exercicios.smartTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.getLigada());
        smartTv.proximoCanal();
        smartTv.power();
        smartTv.proximoCanal();
        System.out.println(smartTv.getCanal());
        smartTv.proximoCanal();
        System.out.println(smartTv.getCanal());
        System.out.println(smartTv.getVolume());
        smartTv.maisVolume();
        System.out.println(smartTv.getVolume());
        smartTv.maisVolume();
        System.out.println(smartTv.getVolume());
        smartTv.menosVolume();
        System.out.println(smartTv.getVolume());
        smartTv.power();
    }
}
